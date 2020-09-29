package com.guru.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.guru.property.bean.FakeDataSource;

@SpringBootApplication
public class PropertydemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PropertydemoApplication.class, args);
		
		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource.getUserName());
	}

}
