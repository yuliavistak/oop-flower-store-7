package ua.edu.ucu.demo.flowers.delivery;

import java.util.List;

import ua.edu.ucu.demo.flowers.flower.Item;

public class DHLDeliveryStrategy implements Delivery {
    public String deliver(List<Item> items) {
        return "Your order will arrive in 3 days! DHL is so fast)";
    }
}
