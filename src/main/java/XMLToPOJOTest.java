import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

public class XMLToPOJOTest {
    public static void main(String[] args) throws Exception {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            Person pojo = xmlMapper.readValue(getXmlString(), Person.class);
            System.out.println(pojo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getXmlString() {
        return "<person> <firstName>Adithya</firstName>"
                + "<lastName>Jai</lastName>"
                + "<address>Bangalore</address>" + "</person>";
    }



/*    <?xml version="1.0" encoding="UTF-8"?>
  <Product xmlns:xalan="http://xml.apache.org/xslt" xmlns:corG3="urn:com:ericsson:schema:xml/Gima/cor/abstracts/objects/all/model/g3" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <ProductNumber>CAX 105 6060</ProductNumber>
    <ProductNumber>1/CAX 105 6060</ProductNumber>
  </Product>*/

}

// Person class (POJO)
@XmlRootElement(name = "ProductNumber")
@XmlAccessorType(XmlAccessType.FIELD)
class Person {
    private String firstName;
    private String lastName;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[ " +
                "firstName = " + firstName +
                ", lastName = " + lastName +
                ", address = " + address +
                " ]";
    }
}