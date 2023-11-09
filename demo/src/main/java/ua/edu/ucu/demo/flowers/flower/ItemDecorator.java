package main.java.ua.edu.ucu.demo.flowers.flower;

import ua.edu.ucu.demo.flowers.flower.Item;

public class ItemDecorator extends Item {
    private Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice() {
        return item.getPrice();
    }
}
