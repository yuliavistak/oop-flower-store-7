package ua.edu.ucu.demo.flowers.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//треба шукати url
@RequestMapping("/api/flower")
public class FlowerController {
    private FlowerService flowerService; 

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }
}
