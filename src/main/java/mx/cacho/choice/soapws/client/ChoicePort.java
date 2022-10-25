package mx.cacho.choice.soapws.client;

import jakarta.jws.Oneway;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 */
@WebService(name = "ChoicePort", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface ChoicePort {


    /**
     * @param getAllHotelsRequest
     * @return returns mx.cacho.choice.soapws.client.GetAllHotelsResponse
     */
    @WebMethod
    @WebResult(name = "getAllHotelsResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getAllHotelsResponse")
    public GetAllHotelsResponse getAllHotels(
            @WebParam(name = "getAllHotelsRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getAllHotelsRequest")
            GetAllHotelsRequest getAllHotelsRequest);

    /**
     * @param getAllHotelsPaginatedRequest
     * @return returns mx.cacho.choice.soapws.client.GetAllHotelsPaginatedResponse
     */
    @WebMethod
    @WebResult(name = "getAllHotelsPaginatedResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getAllHotelsPaginatedResponse")
    public GetAllHotelsPaginatedResponse getAllHotelsPaginated(
            @WebParam(name = "getAllHotelsPaginatedRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getAllHotelsPaginatedRequest")
            GetAllHotelsPaginatedRequest getAllHotelsPaginatedRequest);

    /**
     * @param createHotelRequest
     * @return returns mx.cacho.choice.soapws.client.CreateHotelResponse
     */
    @WebMethod
    @WebResult(name = "createHotelResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "createHotelResponse")
    public CreateHotelResponse createHotel(
            @WebParam(name = "createHotelRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "createHotelRequest")
            CreateHotelRequest createHotelRequest);

    /**
     * @param addAmenitiesToHotelRequest
     * @return returns mx.cacho.choice.soapws.client.AddAmenitiesToHotelResponse
     */
    @WebMethod
    @WebResult(name = "addAmenitiesToHotelResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "addAmenitiesToHotelResponse")
    public AddAmenitiesToHotelResponse addAmenitiesToHotel(
            @WebParam(name = "addAmenitiesToHotelRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "addAmenitiesToHotelRequest")
            AddAmenitiesToHotelRequest addAmenitiesToHotelRequest);

    /**
     * @param getHotelsByNameRequest
     * @return returns mx.cacho.choice.soapws.client.GetHotelsByNameResponse
     */
    @WebMethod
    @WebResult(name = "getHotelsByNameResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getHotelsByNameResponse")
    public GetHotelsByNameResponse getHotelsByName(
            @WebParam(name = "getHotelsByNameRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getHotelsByNameRequest")
            GetHotelsByNameRequest getHotelsByNameRequest);

    /**
     * @param createAmenityRequest
     * @return returns mx.cacho.choice.soapws.client.CreateAmenityResponse
     */
    @WebMethod
    @WebResult(name = "createAmenityResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "createAmenityResponse")
    public CreateAmenityResponse createAmenity(
            @WebParam(name = "createAmenityRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "createAmenityRequest")
            CreateAmenityRequest createAmenityRequest);

    /**
     * @param getHotelRequest
     * @return returns mx.cacho.choice.soapws.client.GetHotelResponse
     */
    @WebMethod
    @WebResult(name = "getHotelResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getHotelResponse")
    public GetHotelResponse getHotel(
            @WebParam(name = "getHotelRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getHotelRequest")
            GetHotelRequest getHotelRequest);

    /**
     * @param updateHotelRequest
     * @return returns mx.cacho.choice.soapws.client.UpdateHotelResponse
     */
    @WebMethod
    @WebResult(name = "updateHotelResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "updateHotelResponse")
    public UpdateHotelResponse updateHotel(
            @WebParam(name = "updateHotelRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "updateHotelRequest")
            UpdateHotelRequest updateHotelRequest);

    /**
     * @param getAllAmenitiesRequest
     * @return returns mx.cacho.choice.soapws.client.GetAllAmenitiesResponse
     */
    @WebMethod
    @WebResult(name = "getAllAmenitiesResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getAllAmenitiesResponse")
    public GetAllAmenitiesResponse getAllAmenities(
            @WebParam(name = "getAllAmenitiesRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getAllAmenitiesRequest")
            GetAllAmenitiesRequest getAllAmenitiesRequest);

    /**
     * @param deleteHotelRequest
     */
    @WebMethod
    @Oneway
    public void deleteHotel(
            @WebParam(name = "deleteHotelRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "deleteHotelRequest")
            DeleteHotelRequest deleteHotelRequest);

    /**
     * @param getAmenityRequest
     * @return returns mx.cacho.choice.soapws.client.GetAmenityResponse
     */
    @WebMethod
    @WebResult(name = "getAmenityResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getAmenityResponse")
    public GetAmenityResponse getAmenity(
            @WebParam(name = "getAmenityRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "getAmenityRequest")
            GetAmenityRequest getAmenityRequest);

    /**
     * @param removeAmenitiesFromHotelRequest
     * @return returns mx.cacho.choice.soapws.client.RemoveAmenitiesFromHotelResponse
     */
    @WebMethod
    @WebResult(name = "removeAmenitiesFromHotelResponse", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "removeAmenitiesFromHotelResponse")
    public RemoveAmenitiesFromHotelResponse removeAmenitiesFromHotel(
            @WebParam(name = "removeAmenitiesFromHotelRequest", targetNamespace = "http://choice.cacho.mx/soap-ws/hotels", partName = "removeAmenitiesFromHotelRequest")
            RemoveAmenitiesFromHotelRequest removeAmenitiesFromHotelRequest);

}