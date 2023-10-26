package ua.edu.ucu.demo.flowers.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Flower {
    public Flower(Flower flower) {
    }
    private double price;
    private double sepalLength;
    private FlowerColor color;
}
