package dk.practice.dataservice.service;

import dk.practice.dataservice.model.City;
import dk.practice.dataservice.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public Page<City> getCities(Pageable pageable) {
        return cityRepository.findAll(pageable);
    }

    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    public String deleteCity(int id) {
        cityRepository.deleteById(id);
        return "delete success";
    }
}
