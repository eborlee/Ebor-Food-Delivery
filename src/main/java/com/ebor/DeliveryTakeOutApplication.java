package com.ebor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@Slf4j // log provided by lombok
@SpringBootApplication
@ServletComponentScan // to scan annotations like filter
public class DeliveryTakeOutApplication {

	public static void main(String[] args) {


		SpringApplication.run(DeliveryTakeOutApplication.class, args);
		log.info("====== Successfully start the project ======");
	}

}
