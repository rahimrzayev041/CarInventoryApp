/*
The program enables users to input their car information. 
Pressing the "Create New XML File" button generates a file named "cars.xml". 
Upon entering additional car information and clicking the "Update XML" button, the program appends the new information to the original XML file.
 */ 
package carinventory;


import javax.xml.bind.annotation.XmlRootElement; // This function converts a class or an integer type into an XML root element.
                                                 // When the XmlRootElement annotation is used, its value is represented as an XML element in an XML document.
                                                 

/**
 *
 * @author Rahim Rzayev
 */

public class Car {
    
    private String year;   //The private keyword is an access modifier used for "year" and makes it only accessible within the declared class.
    private String company; //The private keyword is an access modifier used for "company" and makes it only accessible within the declared class.
    private String style;   //The private keyword is an access modifier used for "style" and makes it only accessible within the declared class.
    private String colour;  //The private keyword is an access modifier used for "colour" and makes it only accessible within the declared class.
    private String mileage;  //The private keyword is an access modifier used for "mileage" and makes it only accessible within the declared class.
    private String model;  //The private keyword is an access modifier used for "model" and makes it only accessible within the declared class.
    private String doors;  //The private keyword is an access modifier used for "doors" and makes it only accessible within the declared class.
    private String interiorcolour;  //The private keyword is an access modifier used for "interiorcolour" and makes it only accessible within the declared class.
    private String problems;  //The private keyword is an access modifier used for "problems" and makes it only accessible within the declared class.
    private String status;  //The private keyword is an access modifier used for "status" and makes it only accessible within the declared class.
    private String enginesize;  //The private keyword is an access modifier used for "enginesize" and makes it only accessible within the declared class.
    private String price;  //The private keyword is an access modifier used for "price" and makes it only accessible within the declared class.
    private String fueltype;  //The private keyword is an access modifier used for "fueltype" and makes it only accessible within the declared class.
    private String drive;  //The private keyword is an access modifier used for "drive" and makes it only accessible within the declared class.

    public Car() {
    }
    
    

    public String getYear() {
        return year; //Within the body of the method, we use the return statement to return the value.
                     // We also know that any method declared void doesn't return a value.
    }

    public void setYear(String year) { //Public means you can call it from outside of the class.
                                       // setYear is the name of the method. 
        this.year = year;
    }

    public String getCompany() {  //Public means you can call it from outside of the class.
                                       // gtCompany is the name of the method. 
        return company;
    }

    public void setCompany(String company) { //Public means you can call it from outside of the class.
                                               // setCompany is the name of the method. 
        this.company = company;
    }

    public String getStyle() {  //Public means you can call it from outside of the class.
                                // getStyle is the name of the method. 
        return style;
    }

    public void setStyle(String style) { //Public means you can call it from outside of the class.
                                       // setStyle is the name of the method. 
        this.style = style;
    }

    public String getColour() {  //Public means you can call it from outside of the class.
                                       // getColour is the name of the method. 
        return colour;
    }

    public void setColour(String colour) {          //Public means you can call it from outside of the class.
                                       // setColour is the name of the method. 
        this.colour = colour;
    }

    public String getMileage() {   //Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return mileage;
    }

    public void setMileage(String mileage) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.mileage = mileage;
    }
  public String getModel() {   //Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return model;
    }

    public void setModel(String model) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.model = model;
    }

     public String getDoors() {
//Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return doors;
    }

    public void setDoors(String doors) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.doors = doors;
    }

     public String getInteriorColour() {
//Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return interiorcolour;
    }

    public void setInteriorColour(String interiorcolour) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.interiorcolour = interiorcolour;
    }
  public String getProblems() {
       
//Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return problems;
    }

    public void setProblems(String problems) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.problems = problems;
    }
     public String getStatus() {
       
//Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return status;
    }

    public void setStatus(String status) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.status = status;
    }
      public String getEnginesize() {
       
//Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return enginesize;
    }

    public void setEnginesize(String enginesize) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.enginesize = enginesize;
    }

        public String getPrice() {
       
//Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return price;
    }

    public void setPrice(String price) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.price = price;
    }


   public String getFuelType(){
       
//Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return fueltype;
    }

    public void setFuelType(String fueltype) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.fueltype = fueltype;
    }
 public String getDrive(){
       
//Public means you can call it from outside of the class.
                                       // setMileage is the name of the method. 
        return drive;
    }

    public void setDrive(String drive) {    //Public means you can call it from outside of the class.
                                               // setMileage is the name of the method. 
        this.drive = drive;
    }
}
