package mx.cacho.choice.rest.service;

import mx.cacho.choice.rest.model.Amenity;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Validated
public interface AmenityService {

    public Optional<Amenity> getAmenity(Long amenityId);

    public List<Amenity> getAllAmenities();

    Amenity createAmenity(Amenity amenity);
}
