package com.example.lombok_builder;

import com.example.lombok_builder.models.Animal;
import com.example.lombok_builder.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokBuilderApplication.class, args);

		// Manual builder for class User
		User user1 = new User.Builder()
				.setFirstName("Johan")
				.setLastName("Johnsson")
				.setEmail("johan@johnsson-net.se")
				.build();

		User user2 = new User.Builder()
                .setFirstName("Matti")
				.build();

		System.out.println("First test with manual builder pattern.");
		System.out.println(user1);
		System.out.println(user2);

		// Lombok builder
		Animal animal1 = Animal.builder()
				.type("Cat")
				.name("Dexter")
				.build();

		Animal animal2 = Animal.builder()
				.type("Dog")
				.build();

		System.out.println();
		System.out.println("Second test with Lombok builder");
		System.out.println("Name: " + animal1.getName() + " Type: " + animal1.getType());
		System.out.println("Name: " + animal2.getName() + " Type: " + animal2.getType());
	}


}
