package ua.edu.ucu.demo.flowers.delivery;

import java.util.List;

import ua.edu.ucu.demo.flowers.flower.Item;

public interface Delivery {
    String deliver(List<Item> items);
}
