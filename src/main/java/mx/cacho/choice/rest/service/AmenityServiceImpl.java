package mx.cacho.choice.rest.service;

import lombok.extern.slf4j.Slf4j;
import mx.cacho.choice.rest.model.Amenity;
import mx.cacho.choice.soapws.client.AmenityInfo;
import mx.cacho.choice.soapws.client.ChoicePort;
import mx.cacho.choice.soapws.client.CreateAmenityRequest;
import mx.cacho.choice.soapws.client.GetAllAmenitiesRequest;
import mx.cacho.choice.soapws.client.GetAmenityRequest;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AmenityServiceImpl implements AmenityService {

    private ChoicePort choicePort;


    AmenityServiceImpl(ChoicePort choicePort) {
        this.choicePort = choicePort;
    }

    @Override
    public Optional<Amenity> getAmenity(Long amenityId) {
        var request = new GetAmenityRequest();
        request.setId(amenityId);

        //TODO: Mapping logic
        try {
            AmenityInfo amenityInfo = choicePort.getAmenity(request).getAmenity();

            if (amenityInfo.getAmenityId() <= 0) {
                return Optional.empty();
            }

            Amenity amenity = Amenity.builder()
                    .id(amenityInfo.getAmenityId())
                    .name(amenityInfo.getName())
                    .description(amenityInfo.getDescription())
                    .build();

            return Optional.of(amenity);
        } catch (Exception e) {
            log.error("Unexpected exception", e);
            return Optional.empty();
        }
    }

    @Override
    public List<Amenity> getAllAmenities() {
        var request = new GetAllAmenitiesRequest();
        var response = choicePort.getAllAmenities(request);

        try {
            //TODO: Mapping
            return response.getAmenity().stream().map(ai -> Amenity.builder()
                    .id(ai.getAmenityId())
                    .name(ai.getName())
                    .description(ai.getDescription())
                    .build()).toList();
        } catch (Exception e) {
            log.error("Unexpected exception", e);
            return Collections.emptyList();
        }
    }

    @Override
    public Amenity createAmenity(Amenity amenity) {
        var request = new CreateAmenityRequest();
        request.setName(amenity.getName());
        request.setDescription(amenity.getDescription());

        AmenityInfo amenityInfo = choicePort.createAmenity(request).getAmenity();
        try {
            return Amenity.builder()
                    .id(amenityInfo.getAmenityId())
                    .name(amenityInfo.getName())
                    .description(amenityInfo.getDescription())
                    .build();
        } catch (Exception e) {
            log.error("Unexpected exception", e);
            return null;
        }
    }
}
