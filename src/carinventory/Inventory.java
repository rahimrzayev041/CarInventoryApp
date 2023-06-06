/*Name: Rahim
 *Surname: Rzayev
 The program enables users to input their car information. 
Pressing the "Create New XML File" button generates a file named "cars.xml". 
Upon entering additional car information and clicking the "Update XML" button, the program appends the new information to the original XML file.
*/ 
package carinventory;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rahim Rzayev
 */
@XmlRootElement(name = "Inventory") //  you can easily change this name for your XML-Output
@XmlAccessorType (XmlAccessType.FIELD)
public class Inventory {
   
   @XmlElement(name = "CAR") // XmlElement sets the name of the entities
   private List<Car> cars; // Creating an ArrayList from another collection

    public Inventory() {
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }




   
   
}
