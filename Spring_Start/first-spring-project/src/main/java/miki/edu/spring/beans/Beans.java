package miki.edu.spring.beans;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Beans {

    @Bean
    public Gson gson(){
        return new Gson();
    }

}
