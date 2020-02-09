package dk.practice.dataservice.repository;

import dk.practice.dataservice.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountryRepository extends JpaRepository<Country, String>, JpaSpecificationExecutor<Country> {

}