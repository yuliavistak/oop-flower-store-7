import main.java.ua.edu.ucu.demo.flowers.flower.ItemDecorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return super.getPrice() + 20;
    }
}
