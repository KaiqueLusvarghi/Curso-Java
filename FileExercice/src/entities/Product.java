package entities;

public class Product {

    private String name;
    private Integer quantity;
    private Double price;

    public Product(){}
    public Product(String name, Integer quantity, Double price){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }
   public void setName(String name) {
       this.name = name;
   }
   public Double getPrice() {
       return price;
   }
   public void setPrice(Double price) {
       this.price = price;
   }
   public Integer getQuantity() {
       return quantity;
   }
   public void setQuantity(Integer quantity) {
       this.quantity = quantity;
   }
   
   public Double total(){
    return quantity * price;

   }

    
}
