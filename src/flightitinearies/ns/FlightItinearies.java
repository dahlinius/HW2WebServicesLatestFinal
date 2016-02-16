
package flightitinearies.ns;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FlightItinearies", targetNamespace = "ns.flightItinearies")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightItinearies {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<flightitinearies.ns.FlightItinerary>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFlightItinearies", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.GetFlightItinearies")
    @ResponseWrapper(localName = "getFlightItineariesResponse", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.GetFlightItineariesResponse")
    @Action(input = "ns.flightItinearies/FlightItinearies/getFlightItineariesRequest", output = "ns.flightItinearies/FlightItinearies/getFlightItineariesResponse")
    public List<FlightItinerary> getFlightItinearies(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authorize", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.Authorize")
    @ResponseWrapper(localName = "authorizeResponse", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.AuthorizeResponse")
    @Action(input = "ns.flightItinearies/FlightItinearies/authorizeRequest", output = "ns.flightItinearies/FlightItinearies/authorizeResponse")
    public String authorize(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookItinerary", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.BookItinerary")
    @ResponseWrapper(localName = "bookItineraryResponse", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.BookItineraryResponse")
    @Action(input = "ns.flightItinearies/FlightItinearies/bookItineraryRequest", output = "ns.flightItinearies/FlightItinearies/bookItineraryResponse")
    public String bookItinerary(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "issueTickets", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.IssueTickets")
    @ResponseWrapper(localName = "issueTicketsResponse", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.IssueTicketsResponse")
    @Action(input = "ns.flightItinearies/FlightItinearies/issueTicketsRequest", output = "ns.flightItinearies/FlightItinearies/issueTicketsResponse")
    public String issueTickets(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<flightitinearies.ns.Flight>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFlightPrices", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.GetFlightPrices")
    @ResponseWrapper(localName = "getFlightPricesResponse", targetNamespace = "ns.flightItinearies", className = "flightitinearies.ns.GetFlightPricesResponse")
    @Action(input = "ns.flightItinearies/FlightItinearies/getFlightPricesRequest", output = "ns.flightItinearies/FlightItinearies/getFlightPricesResponse")
    public List<Flight> getFlightPrices(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
