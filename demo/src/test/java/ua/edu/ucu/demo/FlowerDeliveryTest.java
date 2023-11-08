package test.java.ua.edu.ucu.demo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Random;
import ua.edu.ucu.demo.flowers.store.Order;
import ua.edu.ucu.demo.flowers.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.demo.flowers.delivery.PostDeliveryStrategy;


public class FlowerDeliveryTest {
    // private static 
    @BeforeEach
    public void init() {
        Order roseFlowerOrder= new Order();
        Order justFlowerOrder= new Order();
        Order tulipFlowerOrder= new Order();

        PostDeliveryStrategy post = new PostDeliveryStrategy();
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();

        String postResult = "Your order will arrive in a week! It takes some time to process the order by post";

    }

    @Test
    public void testDelivery() {

        roseFlowerOrder.setDeliveryStrategy(post);
        String result = roseFlowerOrder.delivery.deliver(roseFlowerOrder.items);

        Assertions.assertEquals(result, postResult);
    }


}

