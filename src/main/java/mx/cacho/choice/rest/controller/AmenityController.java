package mx.cacho.choice.rest.controller;

import lombok.extern.slf4j.Slf4j;
import mx.cacho.choice.rest.exception.AmenityNotFoundException;
import mx.cacho.choice.rest.model.Amenity;
import mx.cacho.choice.rest.service.AmenityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController()
@RequestMapping(path = "/api/amenities", produces = "application/json")
public class AmenityController {

    private AmenityService amenityService;

    @Autowired
    AmenityController(AmenityService amenityService) {
        this.amenityService = amenityService;
    }

    @ResponseBody
    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<Amenity> getAmenity(@PathVariable("id") Long id) {
        log.debug("GET Amenity: {}", id);

        Optional<Amenity> amenity = amenityService.getAmenity(id);
        if (amenity.isEmpty()) {
            throw new AmenityNotFoundException(String.format("Amenity Not Found: %s", id));
        }

        return new ResponseEntity<>(amenity.get(), HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping(path = "")
    public ResponseEntity<List<Amenity>> getAllAmenities() {
        log.debug("GET all Amenities");

        return new ResponseEntity<>(amenityService.getAllAmenities(), HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping(path = "", produces = "application/json")
    public ResponseEntity<Amenity> createAmenity(@RequestBody Amenity amenity) {
        log.debug("POST Amenity: {}", amenity);

        Amenity createdAmenity = amenityService.createAmenity(amenity);
        if (amenity == null) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Amenity could not be created");
        }
        return new ResponseEntity<>(createdAmenity, HttpStatus.OK);
    }
}
