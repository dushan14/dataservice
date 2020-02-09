package dk.practice.dataservice.repository;

import dk.practice.dataservice.model.CountryLanguage;
import dk.practice.dataservice.model.CountryLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountrylanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId>, JpaSpecificationExecutor<CountryLanguage> {

}