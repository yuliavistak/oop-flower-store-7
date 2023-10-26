package ua.edu.ucu.demo.flowers.delivery;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // треба шукати url
@RequestMapping("/api/delivery")
public class DeliveryController {

    @GetMapping("/post")
    public String getPost() {
        return "Your choice is successfully saved. Delivery details: Post, 7 days waiting";
    }

    @GetMapping("/DHL")
    public String getDhl() {
        return "Your choice is successfully saved. Delivery details: DHL, 3 days waiting";
    }
} 
