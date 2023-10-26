package ua.edu.ucu.demo.flowers.filter;

import ua.edu.ucu.demo.flowers.flower.Item;

public interface SearchFilter {
    boolean match(Item item);
}
