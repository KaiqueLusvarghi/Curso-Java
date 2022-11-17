package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;

import entities.Post;

public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(
                sdf.parse("08/11/2022 10:30:04"),
                "Traveling to New Zealand",
                "I'm going to visit this wonder  fulcountry!",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the Force be with you!");
        Post p2 = new Post(
                sdf.parse("08/11/2022 11:00:10"),
                "Good night guys",
                "See you tomorrow!",
                74);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);

    }
}
