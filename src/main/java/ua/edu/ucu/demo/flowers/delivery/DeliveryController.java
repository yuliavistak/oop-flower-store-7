package ua.edu.ucu.demo.flowers.delivery;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // треба шукати url
@RequestMapping("/api/delivery")
public class DeliveryController {

    @GetMapping("/post")
    public String getPost() {
        String res = 
        "Choice is saved. Delivery details: Post, 7 days waiting";
        return res;
    }

    @GetMapping("/DHL")
    public String getDHL() {
        String res = 
        "Choice is saved. Delivery details: DHL, 3 days waiting";
        return res;
    }
} 
