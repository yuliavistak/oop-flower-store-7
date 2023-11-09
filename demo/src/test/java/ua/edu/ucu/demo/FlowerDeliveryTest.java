package test.java.ua.edu.ucu.demo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ua.edu.ucu.demo.flowers.store.Order;
import ua.edu.ucu.demo.flowers.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.demo.flowers.delivery.PostDeliveryStrategy;


public class FlowerDeliveryTest {
    @BeforeEach
    public void init() {
        Order roseFlowerOrder = new Order();
        Order justFlowerOrder = new Order();
        Order tulipFlowerOrder = new Order();

        PostDeliveryStrategy post = new PostDeliveryStrategy();
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();

        String postResult = 
        "Order will arrive in a week!";
        
        String dhlResult = "Order will arrive in 3 days! DHL is so fast)";

    }

    @Test
    public void testPost() {

        roseFlowerOrder.setDeliveryStrategy(post);
        String result = roseFlowerOrder.deliveryResult();

        Assertions.assertEquals(result, postResult);
    }


    @Test
    public void testDHL() {
        tulipFlowerOrder.setDeliveryStrategy(dhl);

        String result = tulipFlowerOrder.deliveryResult();

        Assertions.assertEquals(result, dhlResult);


    }
}

