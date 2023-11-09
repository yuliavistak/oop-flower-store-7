package ua.edu.ucu.demo.flowers.delivery;

import java.util.List;

import ua.edu.ucu.demo.flowers.flower.Item;

public class PostDeliveryStrategy implements Delivery {
    public String deliver(List<Item> items) {
        String res = 
        "Your order will arrive in a week! It takes some time to process the order by post";
        return res;
    }

}
