package miki.edu.spring;

import com.google.gson.Gson;
import miki.edu.spring.beans.ConversorJson;
import miki.edu.spring.beans.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjectApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Preça da Sé\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados CEP: " + response);
		};
	}

	@Bean
	public Gson gson() {
		return new Gson();
	}
}
