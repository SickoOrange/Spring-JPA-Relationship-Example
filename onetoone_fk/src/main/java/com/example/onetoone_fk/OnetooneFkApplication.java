package com.example.onetoone_fk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnetooneFkApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(OnetooneFkApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("hello wolrd");

	}
}
