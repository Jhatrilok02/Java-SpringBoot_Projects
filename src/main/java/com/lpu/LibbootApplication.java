package com.lpu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lpu.algo.MyPasswordEncoder;

@SpringBootApplication
public class LibbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LibbootApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(LibbootApplication.class, args);
		MyPasswordEncoder bean = context.getBean(MyPasswordEncoder.class);
		System.out.println(bean);
	}

}
