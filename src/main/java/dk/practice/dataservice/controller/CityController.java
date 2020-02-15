package dk.practice.dataservice.controller;

import dk.practice.dataservice.domain.PageInput;
import dk.practice.dataservice.model.City;
import dk.practice.dataservice.service.CityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController(value = "v1")
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
public class CityController {

    @Autowired
    private CityService cityService;

    @ApiOperation(
            value = "Get all cities",
            notes = "Returns cities as a page.",
            response = Page.class)
    @GetMapping(path = "cities", produces = "application/json")
    public Page<City> getCities(PageInput pageInput) {
        return cityService.getCities(PageInput.getPageable(pageInput));
    }

    @ApiOperation(
            value = "Saves a city",
            notes = "Saves a city.",
            response = City.class)
    @PostMapping(path = "cities", produces = "application/json")
    public City saveCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @ApiOperation(
            value = "Deletes a city",
            notes = "Deletes a city.",
            response = City.class)
    @DeleteMapping(path = "cities/{id}", produces = "application/json")
    public String deleteCity(@PathVariable Integer id) {
        return cityService.deleteCity(id);
    }

//    @RequestMapping(value= "/cities/**", method=RequestMethod.OPTIONS)
//    public void corsHeaders(HttpServletResponse response) {
//        response.addHeader("Access-Control-Allow-Origin", "*");
//        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
//        response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
//        response.addHeader("Access-Control-Max-Age", "3600");
//    }
}
