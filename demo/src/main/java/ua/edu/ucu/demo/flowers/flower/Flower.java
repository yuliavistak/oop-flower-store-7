package ua.edu.ucu.demo.flowers.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Flower extends Item {
    private double sepalLength;
    private double price;
    private FlowerColor color;
    private String description;
    public Flower(Flower flower) {

    }
}
