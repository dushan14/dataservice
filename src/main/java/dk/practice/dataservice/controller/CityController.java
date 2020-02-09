package dk.practice.dataservice.controller;

import dk.practice.dataservice.domain.PageInput;
import dk.practice.dataservice.model.City;
import dk.practice.dataservice.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "v1")
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
public class CityController {

    @Autowired
    CityService cityService;

    @ApiOperation(
            value = "Get all cities",
            notes = "Returns cities as a page.",
            response = Page.class)
    @GetMapping(path = "cities", produces = "application/json")
    public Page<City> getCities(PageInput pageInput) {
        return cityService.getCities(PageInput.getPageable(pageInput));
    }
}
