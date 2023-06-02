package miki.edu.spring.beans;

import com.google.gson.Gson;
import miki.edu.spring.beans.ViaCepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson;

    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }

}
