package com.example.SabloaneProiectare;

import com.example.SabloaneProiectare.difexamples.ClientComponent;
import com.example.SabloaneProiectare.difexamples.SingletonComponent;
import com.example.SabloaneProiectare.difexamples.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(Main.class, args);

		TransientComponent transientBean =
				context.getBean(TransientComponent.class);

		transientBean.operation();

		transientBean =
				context.getBean(TransientComponent.class);

		transientBean.operation();

		SingletonComponent singletonBean =
				context.getBean(SingletonComponent.class);

		singletonBean.operation();

		singletonBean =
				context.getBean(SingletonComponent.class);

		singletonBean.operation();

		ClientComponent c =
				context.getBean(ClientComponent.class);

		c.operation();

		c =
				(ClientComponent) context.getBean("clientComponent");

		c.operation();
	}
}