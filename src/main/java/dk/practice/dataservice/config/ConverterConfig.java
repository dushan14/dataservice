package dk.practice.dataservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class ConverterConfig implements RepositoryRestConfigurer {

    @Override
    public void configureConversionService(ConfigurableConversionService conversionService) {
        conversionService.addConverter(new CountryLanguageIdConverter());
    }
}
