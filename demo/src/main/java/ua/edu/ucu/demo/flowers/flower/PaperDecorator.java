import main.java.ua.edu.ucu.demo.flowers.flower.ItemDecorator;

public class PaperDecorator extends ItemDecorator {
    public int additional = 20;

    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {

        return super.getPrice() + additional;
    }
}
