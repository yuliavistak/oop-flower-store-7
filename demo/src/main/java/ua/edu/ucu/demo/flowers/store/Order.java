package ua.edu.ucu.demo.flowers.store;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.demo.flowers.payment.Payment;
import ua.edu.ucu.demo.flowers.flower.Item;
import ua.edu.ucu.demo.flowers.delivery.Delivery;


@AllArgsConstructor@Setter@Getter
public class Order {
    
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }

    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public String deliveryResult() {
        return this.delivery.deliver(this.items);
    }

    public int calculateTotalPrice() {
        int total = 0;
        for (Item item: items) {
            total += item.getPrice();
        }
        return total;
    }

    public String processOrder() {
        return "Loading...";
    }

    public void addItem(Item newItem) {
        this.items.add(newItem);
    }

    public void removeItem(Item oldItem) {
        this.items.remove(oldItem);
    }

}
