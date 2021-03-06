
package pl.lukasz.statki;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StatkiUsluga", targetNamespace = "http://statki.lukasz.pl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StatkiUsluga {


    /**
     * 
     * @param mmsi
     * @param latitude
     * @param portName
     * @param knots
     * @param longitude
     * @return
     *     returns java.lang.String
     * @throws IncorrectPortException_Exception
     * @throws IncorrectMMSIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "odbierzZgloszenie", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.OdbierzZgloszenie")
    @ResponseWrapper(localName = "odbierzZgloszenieResponse", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.OdbierzZgloszenieResponse")
    @Action(input = "http://statki.lukasz.pl/StatkiUsluga/odbierzZgloszenieRequest", output = "http://statki.lukasz.pl/StatkiUsluga/odbierzZgloszenieResponse", fault = {
        @FaultAction(className = IncorrectMMSIException_Exception.class, value = "http://statki.lukasz.pl/StatkiUsluga/odbierzZgloszenie/Fault/IncorrectMMSIException"),
        @FaultAction(className = IncorrectPortException_Exception.class, value = "http://statki.lukasz.pl/StatkiUsluga/odbierzZgloszenie/Fault/IncorrectPortException")
    })
    public String odbierzZgloszenie(
        @WebParam(name = "MMSI", targetNamespace = "")
        int mmsi,
        @WebParam(name = "portName", targetNamespace = "")
        String portName,
        @WebParam(name = "latitude", targetNamespace = "")
        float latitude,
        @WebParam(name = "longitude", targetNamespace = "")
        float longitude,
        @WebParam(name = "knots", targetNamespace = "")
        float knots)
        throws IncorrectMMSIException_Exception, IncorrectPortException_Exception
    ;

    /**
     * 
     * @param mmsi
     * @return
     *     returns pl.lukasz.statki.Statek
     * @throws IncorrectMMSIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pobierzDaneStatku", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.PobierzDaneStatku")
    @ResponseWrapper(localName = "pobierzDaneStatkuResponse", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.PobierzDaneStatkuResponse")
    @Action(input = "http://statki.lukasz.pl/StatkiUsluga/pobierzDaneStatkuRequest", output = "http://statki.lukasz.pl/StatkiUsluga/pobierzDaneStatkuResponse", fault = {
        @FaultAction(className = IncorrectMMSIException_Exception.class, value = "http://statki.lukasz.pl/StatkiUsluga/pobierzDaneStatku/Fault/IncorrectMMSIException")
    })
    public Statek pobierzDaneStatku(
        @WebParam(name = "MMSI", targetNamespace = "")
        int mmsi)
        throws IncorrectMMSIException_Exception
    ;

    /**
     * 
     * @param img
     * @param flag
     * @param mmsi
     * @param vtype
     * @param grossTonnage
     * @param name
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dodajStatek", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.DodajStatek")
    @ResponseWrapper(localName = "dodajStatekResponse", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.DodajStatekResponse")
    @Action(input = "http://statki.lukasz.pl/StatkiUsluga/dodajStatekRequest", output = "http://statki.lukasz.pl/StatkiUsluga/dodajStatekResponse")
    public int dodajStatek(
        @WebParam(name = "MMSI", targetNamespace = "")
        int mmsi,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "flag", targetNamespace = "")
        String flag,
        @WebParam(name = "vtype", targetNamespace = "")
        String vtype,
        @WebParam(name = "img", targetNamespace = "")
        byte[] img,
        @WebParam(name = "grossTonnage", targetNamespace = "")
        int grossTonnage);

    /**
     * 
     * @param country
     * @param latitude
     * @param name
     * @param longitude
     */
    @WebMethod
    @RequestWrapper(localName = "dodajPort", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.DodajPort")
    @ResponseWrapper(localName = "dodajPortResponse", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.DodajPortResponse")
    @Action(input = "http://statki.lukasz.pl/StatkiUsluga/dodajPortRequest", output = "http://statki.lukasz.pl/StatkiUsluga/dodajPortResponse")
    public void dodajPort(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "country", targetNamespace = "")
        String country,
        @WebParam(name = "latitude", targetNamespace = "")
        float latitude,
        @WebParam(name = "longitude", targetNamespace = "")
        float longitude);

    /**
     * 
     * @param name
     * @return
     *     returns pl.lukasz.statki.Port
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pobierzDanePortu", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.PobierzDanePortu")
    @ResponseWrapper(localName = "pobierzDanePortuResponse", targetNamespace = "http://statki.lukasz.pl/", className = "pl.lukasz.statki.PobierzDanePortuResponse")
    @Action(input = "http://statki.lukasz.pl/StatkiUsluga/pobierzDanePortuRequest", output = "http://statki.lukasz.pl/StatkiUsluga/pobierzDanePortuResponse")
    public Port pobierzDanePortu(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
