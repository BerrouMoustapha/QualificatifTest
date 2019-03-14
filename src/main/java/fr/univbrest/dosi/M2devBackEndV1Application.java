package fr.univbrest.dosi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class M2devBackEndV1Application {

	public static void main(String[] args) {
		SpringApplication.run(M2devBackEndV1Application.class, args);
	}

}
