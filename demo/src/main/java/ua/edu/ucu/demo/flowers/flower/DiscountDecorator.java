package main.java.ua.edu.ucu.demo.flowers.flower;

public class DiscountDecorator extends ItemDecorator {
    public DiscountDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
