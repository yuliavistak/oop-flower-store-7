package ua.edu.ucu.demo.flowers.delivery;

import java.util.List;

import ua.edu.ucu.demo.flowers.flower.Item;

public class PostDeliveryStrategy implements Delivery {
    public String deliver(List<Item> items) {
        String res = "Order will arrive in a week!";
        return res;
    }

}
