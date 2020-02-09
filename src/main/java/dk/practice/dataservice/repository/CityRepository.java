package dk.practice.dataservice.repository;

import dk.practice.dataservice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CityRepository extends JpaRepository<City, Integer>, JpaSpecificationExecutor<City> {

}