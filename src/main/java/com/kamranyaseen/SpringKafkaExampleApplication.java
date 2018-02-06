package com.kamranyaseen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kamranyaseen.model.Customer;
import com.kamranyaseen.services.KafkaProducer;

@SpringBootApplication
public class SpringKafkaExampleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaExampleApplication.class, args);
	}
	
	@Autowired
	KafkaProducer producer;
	
	@Override
	public void run(String... arg0) throws Exception {
		Customer test1 = new Customer("Kamran Yaseen", 33);
		producer.send(test1);
		Customer test2 = new Customer("Shawqi Alhashdi", 32);
		producer.send(test2);
	}
}
