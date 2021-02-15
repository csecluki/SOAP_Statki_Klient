
package pl.lukasz.statki;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.lukasz.statki package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PobierzDanePortu_QNAME = new QName("http://statki.lukasz.pl/", "pobierzDanePortu");
    private final static QName _IncorrectMMSIException_QNAME = new QName("http://statki.lukasz.pl/", "IncorrectMMSIException");
    private final static QName _OdbierzZgloszenieResponse_QNAME = new QName("http://statki.lukasz.pl/", "odbierzZgloszenieResponse");
    private final static QName _PobierzDaneStatku_QNAME = new QName("http://statki.lukasz.pl/", "pobierzDaneStatku");
    private final static QName _PobierzDanePortuResponse_QNAME = new QName("http://statki.lukasz.pl/", "pobierzDanePortuResponse");
    private final static QName _PobierzDaneStatkuResponse_QNAME = new QName("http://statki.lukasz.pl/", "pobierzDaneStatkuResponse");
    private final static QName _IncorrectPortException_QNAME = new QName("http://statki.lukasz.pl/", "IncorrectPortException");
    private final static QName _DodajStatekResponse_QNAME = new QName("http://statki.lukasz.pl/", "dodajStatekResponse");
    private final static QName _DodajPortResponse_QNAME = new QName("http://statki.lukasz.pl/", "dodajPortResponse");
    private final static QName _DodajPort_QNAME = new QName("http://statki.lukasz.pl/", "dodajPort");
    private final static QName _DodajStatek_QNAME = new QName("http://statki.lukasz.pl/", "dodajStatek");
    private final static QName _OdbierzZgloszenie_QNAME = new QName("http://statki.lukasz.pl/", "odbierzZgloszenie");
    private final static QName _DodajStatekImg_QNAME = new QName("", "img");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.lukasz.statki
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncorrectMMSIException }
     * 
     */
    public IncorrectMMSIException createIncorrectMMSIException() {
        return new IncorrectMMSIException();
    }

    /**
     * Create an instance of {@link PobierzDanePortu }
     * 
     */
    public PobierzDanePortu createPobierzDanePortu() {
        return new PobierzDanePortu();
    }

    /**
     * Create an instance of {@link PobierzDanePortuResponse }
     * 
     */
    public PobierzDanePortuResponse createPobierzDanePortuResponse() {
        return new PobierzDanePortuResponse();
    }

    /**
     * Create an instance of {@link OdbierzZgloszenieResponse }
     * 
     */
    public OdbierzZgloszenieResponse createOdbierzZgloszenieResponse() {
        return new OdbierzZgloszenieResponse();
    }

    /**
     * Create an instance of {@link PobierzDaneStatku }
     * 
     */
    public PobierzDaneStatku createPobierzDaneStatku() {
        return new PobierzDaneStatku();
    }

    /**
     * Create an instance of {@link IncorrectPortException }
     * 
     */
    public IncorrectPortException createIncorrectPortException() {
        return new IncorrectPortException();
    }

    /**
     * Create an instance of {@link PobierzDaneStatkuResponse }
     * 
     */
    public PobierzDaneStatkuResponse createPobierzDaneStatkuResponse() {
        return new PobierzDaneStatkuResponse();
    }

    /**
     * Create an instance of {@link DodajPortResponse }
     * 
     */
    public DodajPortResponse createDodajPortResponse() {
        return new DodajPortResponse();
    }

    /**
     * Create an instance of {@link DodajStatekResponse }
     * 
     */
    public DodajStatekResponse createDodajStatekResponse() {
        return new DodajStatekResponse();
    }

    /**
     * Create an instance of {@link DodajPort }
     * 
     */
    public DodajPort createDodajPort() {
        return new DodajPort();
    }

    /**
     * Create an instance of {@link DodajStatek }
     * 
     */
    public DodajStatek createDodajStatek() {
        return new DodajStatek();
    }

    /**
     * Create an instance of {@link OdbierzZgloszenie }
     * 
     */
    public OdbierzZgloszenie createOdbierzZgloszenie() {
        return new OdbierzZgloszenie();
    }

    /**
     * Create an instance of {@link Port }
     * 
     */
    public Port createPort() {
        return new Port();
    }

    /**
     * Create an instance of {@link Statek }
     * 
     */
    public Statek createStatek() {
        return new Statek();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzDanePortu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "pobierzDanePortu")
    public JAXBElement<PobierzDanePortu> createPobierzDanePortu(PobierzDanePortu value) {
        return new JAXBElement<PobierzDanePortu>(_PobierzDanePortu_QNAME, PobierzDanePortu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncorrectMMSIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "IncorrectMMSIException")
    public JAXBElement<IncorrectMMSIException> createIncorrectMMSIException(IncorrectMMSIException value) {
        return new JAXBElement<IncorrectMMSIException>(_IncorrectMMSIException_QNAME, IncorrectMMSIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdbierzZgloszenieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "odbierzZgloszenieResponse")
    public JAXBElement<OdbierzZgloszenieResponse> createOdbierzZgloszenieResponse(OdbierzZgloszenieResponse value) {
        return new JAXBElement<OdbierzZgloszenieResponse>(_OdbierzZgloszenieResponse_QNAME, OdbierzZgloszenieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzDaneStatku }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "pobierzDaneStatku")
    public JAXBElement<PobierzDaneStatku> createPobierzDaneStatku(PobierzDaneStatku value) {
        return new JAXBElement<PobierzDaneStatku>(_PobierzDaneStatku_QNAME, PobierzDaneStatku.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzDanePortuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "pobierzDanePortuResponse")
    public JAXBElement<PobierzDanePortuResponse> createPobierzDanePortuResponse(PobierzDanePortuResponse value) {
        return new JAXBElement<PobierzDanePortuResponse>(_PobierzDanePortuResponse_QNAME, PobierzDanePortuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PobierzDaneStatkuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "pobierzDaneStatkuResponse")
    public JAXBElement<PobierzDaneStatkuResponse> createPobierzDaneStatkuResponse(PobierzDaneStatkuResponse value) {
        return new JAXBElement<PobierzDaneStatkuResponse>(_PobierzDaneStatkuResponse_QNAME, PobierzDaneStatkuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncorrectPortException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "IncorrectPortException")
    public JAXBElement<IncorrectPortException> createIncorrectPortException(IncorrectPortException value) {
        return new JAXBElement<IncorrectPortException>(_IncorrectPortException_QNAME, IncorrectPortException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DodajStatekResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "dodajStatekResponse")
    public JAXBElement<DodajStatekResponse> createDodajStatekResponse(DodajStatekResponse value) {
        return new JAXBElement<DodajStatekResponse>(_DodajStatekResponse_QNAME, DodajStatekResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DodajPortResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "dodajPortResponse")
    public JAXBElement<DodajPortResponse> createDodajPortResponse(DodajPortResponse value) {
        return new JAXBElement<DodajPortResponse>(_DodajPortResponse_QNAME, DodajPortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DodajPort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "dodajPort")
    public JAXBElement<DodajPort> createDodajPort(DodajPort value) {
        return new JAXBElement<DodajPort>(_DodajPort_QNAME, DodajPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DodajStatek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "dodajStatek")
    public JAXBElement<DodajStatek> createDodajStatek(DodajStatek value) {
        return new JAXBElement<DodajStatek>(_DodajStatek_QNAME, DodajStatek.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdbierzZgloszenie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://statki.lukasz.pl/", name = "odbierzZgloszenie")
    public JAXBElement<OdbierzZgloszenie> createOdbierzZgloszenie(OdbierzZgloszenie value) {
        return new JAXBElement<OdbierzZgloszenie>(_OdbierzZgloszenie_QNAME, OdbierzZgloszenie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "img", scope = DodajStatek.class)
    public JAXBElement<byte[]> createDodajStatekImg(byte[] value) {
        return new JAXBElement<byte[]>(_DodajStatekImg_QNAME, byte[].class, DodajStatek.class, ((byte[]) value));
    }

}
