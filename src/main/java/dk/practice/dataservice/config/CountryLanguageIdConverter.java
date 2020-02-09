package dk.practice.dataservice.config;

import dk.practice.dataservice.model.CountryLanguageId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class CountryLanguageIdConverter implements Converter<String, CountryLanguageId> {

    /**
     * @param id countryCode-languageCode
     * @return CountryLanguageId
     */
    @Override
    public CountryLanguageId convert(String id) {
        String[] strings = id.split("-");
        return new CountryLanguageId(strings[0], strings[1]);
    }
}
