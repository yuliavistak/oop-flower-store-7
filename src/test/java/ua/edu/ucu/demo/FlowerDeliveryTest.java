package ua.edu.ucu.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ua.edu.ucu.demo.flowers.store.Order;
import ua.edu.ucu.demo.flowers.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.demo.flowers.delivery.PostDeliveryStrategy;


public class FlowerDeliveryTest {
    @Test
    public void testPost() {
        Order roseFlowerOrder = new Order(null, null, null);

        PostDeliveryStrategy post = new PostDeliveryStrategy();

        String postResult = 
        "Order will arrive in a week!";
        roseFlowerOrder.setDeliveryStrategy(post);
        String result = roseFlowerOrder.deliveryResult();

        Assertions.assertEquals(result, postResult);
    }


    @Test
    public void testDHL() {
        Order tulipFlowerOrder = new Order(null, null, null);

        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();

        tulipFlowerOrder.setDeliveryStrategy(dhl);

        String result = tulipFlowerOrder.deliveryResult();

        String dhlResult = "Order will arrive in 3 days! DHL is so fast)";

        Assertions.assertEquals(result, dhlResult);

    }
}

