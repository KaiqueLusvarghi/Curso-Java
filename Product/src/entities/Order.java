package entities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitieEnum.OrderStatus;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<Orderitem> items = new ArrayList<Orderitem>();

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void additem(Orderitem item) {
        items.add(item);
    }

    public void removeitem(Orderitem item) {
        items.remove(item);
    }

    public Double total() {
        double soma = 0;
        for (Orderitem it : items) {
            soma += it.subTotal();
        }
        return soma;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("OrderMoment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order satatus: ");
        sb.append(status + "\n");
        sb.append("Cleint: ");
        sb.append(client +"\n");
        sb.append("Order Items: \n");
        for(Orderitem item : items){
            sb.append(item + "\n");
        }
        sb.append("Total price:  $");
        sb.append(String.format("%.2f",total()));
        return sb.toString();
    }
}
