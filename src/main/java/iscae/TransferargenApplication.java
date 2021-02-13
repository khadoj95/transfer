package iscae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan("Entite")
@SpringBootApplication
public class TransferargenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferargenApplication.class, args);
	}

}
