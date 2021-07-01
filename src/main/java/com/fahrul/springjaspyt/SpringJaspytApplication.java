package com.fahrul.springjaspyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringJaspytApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJaspytApplication.class, args);
	}

}
