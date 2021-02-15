package iscae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan(basePackages={"Entite","controller","Repository","Service"})
@EnableJpaRepositories("Repository")
@ComponentScan({"Entite","controller","Repository","Service"})
@SpringBootApplication
public class TransferargenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferargenApplication.class, args);
	}

}
