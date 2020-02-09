package dk.practice.dataservice;

import dk.practice.dataservice.config.CountryLanguageIdConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.convert.support.ConfigurableConversionService;

@SpringBootApplication
public class DataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataServiceApplication.class, args);
    }

}
