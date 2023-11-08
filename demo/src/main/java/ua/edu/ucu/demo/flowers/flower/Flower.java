package ua.edu.ucu.demo.flowers.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Flower {
    public Flower(Flower flower) {
    }
    private double sepalLength;
    private double price;
    private FlowerColor color;

}
