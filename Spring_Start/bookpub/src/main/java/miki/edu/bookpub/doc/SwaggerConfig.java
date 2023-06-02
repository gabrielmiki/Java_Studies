package miki.edu.bookpub.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Contact contact() {

        return new Contact(
                "Gabriel Miki",
                "http://www.info.com.br",
                "gabriel@email"
        );

    }

    private ApiInfoBuilder apiInfoBuilder() {

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("Studies Spring Boot Rest API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Open Source");
        apiInfoBuilder.license("Licence: Edu");
        apiInfoBuilder.licenseUrl("http://www.info.com.br");
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;

    }

    @Bean
    public Docket detailsApi() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("miki.edu.bookpub.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInfoBuilder().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;

    }
}
