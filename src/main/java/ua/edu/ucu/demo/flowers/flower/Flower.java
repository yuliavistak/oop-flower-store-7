package ua.edu.ucu.demo.flowers.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor @Getter
@Entity
@NoArgsConstructor
public class Flower extends Item {
    @Id
    private int id;
    private FlowerColor color;
    private double price;
    private double sepalLength;
    private String description;
    public Flower(Flower flower) {

    }
}
