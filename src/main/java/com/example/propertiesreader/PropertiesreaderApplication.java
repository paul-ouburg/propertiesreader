package com.example.propertiesreader;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RequiredArgsConstructor
@SpringBootApplication
public class PropertiesreaderApplication implements CommandLineRunner {


	private final AppProperties props;

	public static void main(String[] args) {
		SpringApplication.run(PropertiesreaderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(props.getBrand());
		System.out.println(props.getType());
		System.out.println(props.getColour());
		System.out.println(props.getWheelsize());
		System.out.println(props.getWeight());
	}
}
