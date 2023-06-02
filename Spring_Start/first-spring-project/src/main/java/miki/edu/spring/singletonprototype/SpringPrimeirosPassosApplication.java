package miki.edu.spring.singletonprototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPrimeirosPassosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(SistemaMenssagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
        };
    }

}
