package br.com.murilohenzo.msordermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsOrderManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsOrderManagementApplication.class, args);
	}

}
