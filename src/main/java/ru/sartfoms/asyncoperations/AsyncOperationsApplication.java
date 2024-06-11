package ru.sartfoms.asyncoperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
public class AsyncOperationsApplication implements AppShellConfigurator {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		SpringApplication.run(AsyncOperationsApplication.class, args);
	}

}
