package ua.edu.ucu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
// @RestController
public class DemoApplication {

	public static void main(String[]args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	// @GetMapping("/hello")
	// public String getHello() {
	// 	return "Hello";
	// }

	// @GetMapping("/flower")
	// public Flower getFlower() {
	// 	return new Flower(45, 0.8, FlowerColor.RED);
	// }

	// @GetMapping("/flower")
	// public List<Flower> getFlower() {
	// 	return List.of(new Flower(45, 0.8, FlowerColor.RED));
		
	// }
}
