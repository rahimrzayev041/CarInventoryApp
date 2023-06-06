/*Name: Rahim
 *Surname: Rzayev
 The program enables users to input their car information. 
Pressing the "Create New XML File" button generates a file named "cars.xml". 
Upon entering additional car information and clicking the "Update XML" button, the program appends the new information to the original XML file.
*/ 

 
package carinventory;

import java.io.File;//If you import java.io. ... class files in the java\io directory (and in this directory path inside any jar files) on the classpath. This particular import happens to be the Java Input/Output package containing the . class files for reading and writing data
import java.util.Scanner;//Scanner is a class in java. util package used for obtaining the input of the primitive types like int, double, etc. and strings. It is the easiest way to read input in a Java program, though not very efficient if you want an input method for scenarios where time is a constraint like in competitive programming.
                                   // It is used to turn XML to Java objects and Java objects back to XML.
import javax.xml.bind.Marshaller; //The JAXB Marshaller method is in charge of managing the process of serializing Java objects to XML data.

import javax.xml.bind.JAXBContext;//The JAXBContext class provides the client's entry point to the JAXB API. It provides an abstraction for managing the XML/Java binding information necessary to implement the JAXB binding framework operations: unmarshal, marshal and validate.
import javax.xml.bind.JAXBException;//Packages that use JAXBException. Package. Description. javax.xml.bind. Provides a runtime binding framework for client applications including unmarshalling, marshalling, and validation capabilities.
import java.io.FileInputStream;//A FileInputStream obtains input bytes from a file in a file system. What files are available depends on the host environment. FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader .
import java.io.FileNotFoundException;//Signals that an attempt to open the file denoted by a specified pathname has failed. This exception will be thrown by the FileInputStream , FileOutputStream , and RandomAccessFile constructors when a file with the specified pathname does not exist.
import java.io.InputStreamReader;//An InputStreamReader is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset. The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
import java.nio.charset.StandardCharsets;//The native character encoding of the Java programming language is UTF-16. A charset in the Java platform therefore defines a mapping between sequences of sixteen-bit UTF-16 code units (that is, sequences of chars) and sequences of bytes.
import java.util.ArrayList;//An import statement tells Java which class you mean when you use a short name (like List ). It tells Java where to find the definition of that class. You can import just the classes you need from a package as shown below. Just provide an import statement for each class that you want to use.
import java.util.List;//An import statement tells Java which class you mean when you use a short name (like List ). It tells Java where to find the definition of that class. You can import just the classes you need from a package as shown below. Just provide an import statement for each class that you want to use.
import java.util.logging.Level;//logging. The Level class defines a set of standard logging levels that can be used to control logging output. ... Logger. A Logger object is used to log messages for a specific system or application component.
import java.util.logging.Logger; //The Level class defines a set of standard logging levels that can be used to control logging output. ... Logger. A Logger object is used to log messages for a specific system or application component.
import javax.xml.bind.Unmarshaller;//Marshalling is the process of writing Java objects to XML file. Unmarshalling is the process of converting XML content to Java objects.

/**
 *
 * @author Rahim Rzayev
 */
public class CarInventory extends javax.swing.JFrame {

    public CarInventory() { // All other classes can see public members.
                            // This indicates that a public field or function can be accessed by any other class.
                            // Furthermore, unless a public field is designated as final, other classes can edit it.
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResult = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        colour = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mileage = new javax.swing.JTextField();
        company = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        problems = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        drive = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        fueltype = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        enginesize = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        interiorcolour = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        style = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        doors = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        update2 = new javax.swing.JButton();
        create2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Car Inventory");

        jLabel7.setText("RESULT");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Model");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel14.setText("Engine size");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel5.setText("Colour");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 198, 46, -1));

        colour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                colourKeyPressed(evt);
            }
        });
        jPanel1.add(colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 218, 92, -1));

        jLabel6.setText("Mileage");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 256, 60, -1));

        mileage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mileageKeyTyped(evt);
            }
        });
        jPanel1.add(mileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 281, 92, -1));

        company.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                companyKeyPressed(evt);
            }
        });
        jPanel1.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 90, 92, -1));

        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });
        jPanel1.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 34, 116, -1));

        jLabel1.setText("Company");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 65, -1, -1));

        jLabel2.setText("Year");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel13.setText("Problems");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        problems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                problemsKeyPressed(evt);
            }
        });
        jPanel1.add(problems, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 218, 113, -1));

        jLabel4.setText("Style");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        drive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                driveKeyPressed(evt);
            }
        });
        jPanel1.add(drive, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 92, -1));

        jLabel15.setText("Total Price");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 502, -1, -1));

        jLabel16.setText("Status");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        status.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                statusKeyPressed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 116, -1));

        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearKeyTyped(evt);
            }
        });
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 34, 92, -1));

        fueltype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fueltypeActionPerformed(evt);
            }
        });
        fueltype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fueltypeKeyPressed(evt);
            }
        });
        jPanel1.add(fueltype, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 100, -1));

        jLabel8.setText("Price");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 52, -1));

        enginesize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enginesizeActionPerformed(evt);
            }
        });
        enginesize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enginesizeKeyTyped(evt);
            }
        });
        jPanel1.add(enginesize, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 160, 114, -1));

        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 114, -1));

        jLabel9.setText("Interior colour");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        interiorcolour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interiorcolourActionPerformed(evt);
            }
        });
        jPanel1.add(interiorcolour, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, -1));

        jLabel10.setText("Fuel Type");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        style.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                styleKeyPressed(evt);
            }
        });
        jPanel1.add(style, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 92, -1));

        jLabel11.setText("Drive");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        doors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                doorsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                doorsKeyTyped(evt);
            }
        });
        jPanel1.add(doors, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 92, -1));

        jLabel12.setText("Doors");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        update2.setText("Update XML");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        create2.setText("Create New XML File");
        create2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        jButton5.setText("Restart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update2)
                .addGap(18, 18, 18)
                .addComponent(create2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addComponent(jLabel7)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);  // These codes are foor exitting from textfield
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model.setText(null);    // these codes are for clearing text from model textfield
        company.setText(null); // these codes are for clearing text from company textfield
        drive.setText(null);   // these codes are for clearing text from  drive textfield
        colour.setText(null);  // these codes are for clearing text from colour textfield
        mileage.setText(null);  // these codes are for clearing text from  mileage textfield
        txtResult.setText(null); // these codes are for clearing text from txtResult textfield
        year.setText(null);    // these codes are for clearing text from year textfield
        style.setText(null);   // these codes are for clearing text from style textfield
        doors.setText(null);  // these codes are for clearing text from doors textfield
        interiorcolour.setText(null); // these codes are for clearing text from interiorcolour textfield
        problems.setText(null); // these codes are for clearing text from problems textfield
        fueltype.setText(null); // these codes are for clearing text from fueltype textfield
        price.setText(null); // these codes are for clearing text from price textfield
        enginesize.setText(null); // these codes are for clearing text from enginesize textfield
        status.setText(null); // these codes are for clearing text from status textfield
    }//GEN-LAST:event_jButton1ActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        try (Scanner scn = new Scanner(System.in)) { //A try statement is used to catch exceptions that might be thrown as your program executes. The statements that might throw an exception within a try block.
            Inventory inventory = new Inventory();// These codes are for creating new array which named inventory
            List<Car> cars = new ArrayList<>(); // it creates new array list
            Car carInventory = new Car();// These codes are for creating new array which named car
            carInventory.setYear(year.getText());    // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setCompany(company.getText());  // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setStyle(style.getText());   // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setColour(colour.getText());  // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setMileage(mileage.getText());  // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setDoors(doors.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setDrive(drive.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setInteriorColour(interiorcolour.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setModel(model.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setFuelType(fueltype.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setPrice(price.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setEnginesize(enginesize.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setStatus(status.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setProblems(problems.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            cars.add(carInventory);// after finishing all work when user clicked on create new xml it will add all of them to the document

            inventory.setCars(cars);// it will create new document for adding
            String result = createXML(inventory);// after creating document it will find where app added this document
            txtResult.setText(result);              //Show the answer in the textbox;
        }
    }//GEN-LAST:event_createActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try (Scanner scn = new Scanner(System.in)) { //A try statement is used to catch exceptions that might be thrown as your program executes. The statements that might throw an exception within a try block.
            Inventory inventory = new Inventory();// These codes are for creating new array which named inventory
            List<Car> cars = new ArrayList<>(); // Used to build an empty ArrayList. ArrayList is a list of arrays in Java.
            Car carInventory = new Car(); // An ArrayList combines the features of a List with an Array.

            carInventory.setYear(year.getText());    // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setCompany(company.getText());  // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setStyle(style.getText());   // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setColour(colour.getText());  // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setMileage(mileage.getText());  // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setDoors(doors.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setDrive(drive.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setInteriorColour(interiorcolour.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setModel(model.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setFuelType(fueltype.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setPrice(price.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setEnginesize(enginesize.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setStatus(status.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            carInventory.setProblems(problems.getText()); // I wrote these codes for getting and after getting it to add this  information to the document
            cars.add(carInventory);// after finishing all work when user clicked on create new xml it will add all of them to the document

            String result = updateXML(inventory);// these codes are for updating writing which user wrote after saving upload them to document
            txtResult.setText(result);//after clicking on update button it will demonstrate where is the document located
        } catch (JAXBException ex) {//Each catch block is an exception handler that handles the type of exception indicated by its argument.
            Logger.getLogger(CarInventory.class.getName()).log(Level.SEVERE, null, ex);//This method is used to find or create a logger with the name passed as parameter.If a new logger is created by this method then its log level will be configured based on the LogManager configuration and it will be configured to also send logging output to its parent's Handlers.
        } catch (FileNotFoundException ex) {//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
            Logger.getLogger(CarInventory.class.getName()).log(Level.SEVERE, null, ex);//If a new logger is created by this method then its log level will be configured based on the LogManager configuration and it will be configured to also send logging output to its parent's Handlers
        }
    }//GEN-LAST:event_updateActionPerformed

    private void doorsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doorsKeyTyped
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.
        if (!Character.isDigit(c)){//Function isdigit() takes a single argument in the form of an integer and returns the value of type int . Even though, isdigit() takes integer as an argument, character is passed to the function. Internally, the character is converted to its ASCII value for the check
            evt.consume();//The @Consumes annotation is used to specify which MIME media types of representations a resource can accept, or consume, from the client.
            doors.setText("Enter number!");//I wrote these codes, since when user entered letter to textfield it will show "enter number".
        }
    }//GEN-LAST:event_doorsKeyTyped

    private void doorsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doorsKeyPressed
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.
        if (!Character.isDigit(c)){//Function isdigit() takes a single argument in the form of an integer and returns the value of type int . Even though, isdigit() takes integer as an argument, character is passed to the function. Internally, the character is converted to its ASCII value for the check
            evt.consume();//The @Consumes annotation is used to specify which MIME media types of representations a resource can accept, or consume, from the client.
            doors.setText("Enter number!");//I wrote these codes, since when user entered letter to textfield it will show "enter number".
        }
    }//GEN-LAST:event_doorsKeyPressed

    private void styleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_styleKeyPressed
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.

        if (Character.isLetter(c)|| Character.isWhitespace(c)||Character.isISOControl(c)){//The isLetter(char ch) method of Character class determines whether the given(or specified) character is a letter or not. A character is considered to be a letter if the general category type provided by the Character.

            style.setEditable(true); // If the parameter is false, then the user can type into the field.

        }
        else //Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.

        {
            style.setEditable(false);// If the parameter is false, then the user cannot type into the field.

            style.setText("Enter letter!"); //setText( ) method is used to set "Enter letter!" message in the inputletter textField when the user adds number instead of letter
        }
    }//GEN-LAST:event_styleKeyPressed

    private void interiorcolourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interiorcolourActionPerformed
        // this textfield is for adding information about the interior colour
    }//GEN-LAST:event_interiorcolourActionPerformed

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.
        if (!Character.isDigit(c)){//Function isdigit() takes a single argument in the form of an integer and returns the value of type int . Even though, isdigit() takes integer as an argument, character is passed to the function. Internally, the character is converted to its ASCII value for the check
            evt.consume();//The @Consumes annotation is used to specify which MIME media types of representations a resource can accept, or consume, from the client.
            price.setText("Enter number!");//I wrote these codes, since when user entered letter to textfield it will show "enter number".
        }
    }//GEN-LAST:event_priceKeyTyped

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // this textfield is for adding information about price
    }//GEN-LAST:event_priceActionPerformed

    private void enginesizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enginesizeKeyTyped
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.
        if (!Character.isDigit(c)){//Function isdigit() takes a single argument in the form of an integer and returns the value of type int . Even though, isdigit() takes integer as an argument, character is passed to the function. Internally, the character is converted to its ASCII value for the check
            evt.consume();//The @Consumes annotation is used to specify which MIME media types of representations a resource can accept, or consume, from the client.
            enginesize.setText("Enter number!");//I wrote these codes, since when user entered letter to textfield it will show "enter number".
        }
    }//GEN-LAST:event_enginesizeKeyTyped

    private void enginesizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enginesizeActionPerformed
        // this textfield is for adding enginee size of car
    }//GEN-LAST:event_enginesizeActionPerformed

    private void fueltypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fueltypeKeyPressed
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.

        if (Character.isLetter(c)|| Character.isWhitespace(c)||Character.isISOControl(c)){//The isLetter(char ch) method of Character class determines whether the given(or specified) character is a letter or not. A character is considered to be a letter if the general category type provided by the Character.

            fueltype.setEditable(true); // If the parameter is false, then the user can type into the field.

        }
        else //Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.

        {
            fueltype.setEditable(false);// If the parameter is false, then the user cannot type into the field.

            fueltype.setText("Enter letter!"); //setText( ) method is used to set "Enter letter!" message in the inputletter textField when the user adds number instead of letter
        }
    }//GEN-LAST:event_fueltypeKeyPressed

    private void fueltypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fueltypeActionPerformed
        // this textfield is for adding fuel type of car
    }//GEN-LAST:event_fueltypeActionPerformed

    private void yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyTyped
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.
        if (!Character.isDigit(c)){//Function isdigit() takes a single argument in the form of an integer and returns the value of type int . Even though, isdigit() takes integer as an argument, character is passed to the function. Internally, the character is converted to its ASCII value for the check
            evt.consume();//The @Consumes annotation is used to specify which MIME media types of representations a resource can accept, or consume, from the client.
            year.setText("Enter number!");//I wrote these codes, since when user entered letter to textfield it will show "enter number".
        }
    }//GEN-LAST:event_yearKeyTyped

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // // I have created this textfield for adding information about invent year of this car
    }//GEN-LAST:event_yearActionPerformed

    private void statusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_statusKeyPressed
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.

        if (Character.isLetter(c)|| Character.isWhitespace(c)||Character.isISOControl(c)){//The isLetter(char ch) method of Character class determines whether the given(or specified) character is a letter or not. A character is considered to be a letter if the general category type provided by the Character.

            status.setEditable(true); // If the parameter is false, then the user can type into the field.

        }
        else //Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.

        {
            status.setEditable(false);// If the parameter is false, then the user cannot type into the field.

            status.setText("Enter letter!"); //setText( ) method is used to set "Enter letter!" message in the inputletter textField when the user adds number instead of letter
        }
    }//GEN-LAST:event_statusKeyPressed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // I have created this textfield for adding how was the status of car
    }//GEN-LAST:event_statusActionPerformed

    private void driveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_driveKeyPressed
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.

        if (Character.isLetter(c)|| Character.isWhitespace(c)||Character.isISOControl(c)){//The isLetter(char ch) method of Character class determines whether the given(or specified) character is a letter or not. A character is considered to be a letter if the general category type provided by the Character.

            drive.setEditable(true); // If the parameter is false, then the user can type into the field.

        }
        else //Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.

        {
            drive.setEditable(false);// If the parameter is false, then the user cannot type into the field.

            drive.setText("Enter letter!"); //setText( ) method is used to set "Enter letter!" message in the inputletter textField when the user adds number instead of letter
        }
    }//GEN-LAST:event_driveKeyPressed

    private void problemsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_problemsKeyPressed
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.

        if (Character.isLetter(c)|| Character.isWhitespace(c)||Character.isISOControl(c)){//The isLetter(char ch) method of Character class determines whether the given(or specified) character is a letter or not. A character is considered to be a letter if the general category type provided by the Character.

            problems.setEditable(true); // If the parameter is false, then the user can type into the field.

        }
        else //Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.

        {
            problems.setEditable(false);// If the parameter is false, then the user cannot type into the field.

            problems.setText("Enter letter!"); //setText( ) method is used to set "Enter letter!" message in the inputletter textField when the user adds number instead of letter
        }
    }//GEN-LAST:event_problemsKeyPressed

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // I have created this textfield for adding which model is their car
    }//GEN-LAST:event_modelActionPerformed

    private void companyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_companyKeyPressed
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.

        if (Character.isLetter(c)|| Character.isWhitespace(c)||Character.isISOControl(c)){//The isLetter(char ch) method of Character class determines whether the given(or specified) character is a letter or not. A character is considered to be a letter if the general category type provided by the Character.

            company.setEditable(true); // If the parameter is false, then the user can type into the field.

        }
        else //Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.

        {
            company.setEditable(false);// If the parameter is false, then the user cannot type into the field.

            company.setText("Enter letter!"); //setText( ) method is used to set "Enter letter!" message in the inputletter textField when the user adds number instead of letter
        }
    }//GEN-LAST:event_companyKeyPressed

    private void mileageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mileageKeyTyped
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.
        if (!Character.isDigit(c)){//Function isdigit() takes a single argument in the form of an integer and returns the value of type int . Even though, isdigit() takes integer as an argument, character is passed to the function. Internally, the character is converted to its ASCII value for the check
            evt.consume();//The @Consumes annotation is used to specify which MIME media types of representations a resource can accept, or consume, from the client.
            mileage.setText("Enter number!");//I wrote these codes, since when user entered letter to textfield it will show "enter number".
        }
    }//GEN-LAST:event_mileageKeyTyped

    private void colourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colourKeyPressed
        char c = evt.getKeyChar();//The getKeyChar method always returns a valid Unicode character or char undefined. For key pressed and key released events, the getKeyCode method returns the event's keyCode.

        if (Character.isLetter(c)|| Character.isWhitespace(c)||Character.isISOControl(c)){//The isLetter(char ch) method of Character class determines whether the given(or specified) character is a letter or not. A character is considered to be a letter if the general category type provided by the Character.

            colour.setEditable(true); // If the parameter is false, then the user can type into the field.

        }
        else //Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.

        {
            colour.setEditable(false);// If the parameter is false, then the user cannot type into the field.

            colour.setText("Enter letter!"); //setText( ) method is used to set "Enter letter!" message in the inputletter textField when the user adds number instead of letter
        }
    }//GEN-LAST:event_colourKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);   // The Scanner class is available in the java.util package and is used to get user input.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarInventory().setVisible(true); //setVisible(true) is a blocking action that will continue to block until the dialog is closed. 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField colour;
    private javax.swing.JTextField company;
    private javax.swing.JButton create2;
    private javax.swing.JTextField doors;
    private javax.swing.JTextField drive;
    private javax.swing.JTextField enginesize;
    private javax.swing.JTextField fueltype;
    private javax.swing.JTextField interiorcolour;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField mileage;
    private javax.swing.JTextField model;
    private javax.swing.JTextField price;
    private javax.swing.JTextField problems;
    private javax.swing.JTextField status;
    private javax.swing.JTextField style;
    private javax.swing.JTextField txtResult;
    private javax.swing.JButton update2;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables

    public static String createXML(Inventory carInventory) {

        String filePath="";//gets file name from path string java
        try {//A try statement is used to catch exceptions that might be thrown as your program executes. ... The statements that might throw an exception within a try block. Then you catch the exception with a catch block. The finally block is used to provide statements that are executed regardless of whether any exceptions occur.
        
            JAXBContext jaxbContext = JAXBContext.newInstance(Inventory.class); //Create JAXB Context
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();//Create Marshaller
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//Required formatting
            File file = new File("cars.xml");// It is for creating new file which called cars.xml
            filePath= file.getAbsolutePath(); //Store XML to File
            jaxbMarshaller.marshal(carInventory, file);  //Writes XML file to file-system
        } catch (JAXBException e) {//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
            e.printStackTrace();//printStackTrace() helps the programmer to understand where the actual problem occurred. It helps to trace the exception. it is printStackTrace() method of Throwable class inherited by every exception class. This method prints the same message of e object and also the line number where the exception occurred.
        }

        return filePath;//A return statement causes the program control to transfer back to the caller of a method. Every method in Java is declared with a return type and it is mandatory for all java methods. A return type may be a primitive type like int, float, double, a reference type or void type

    }

    public static String updateXML(Inventory carInventory) throws JAXBException, FileNotFoundException {
 
        // into Java content and subsequently marshalling (writing) Java content back into XML instance documents as part of this process.
        
        JAXBContext context = JAXBContext.newInstance(Inventory.class);// JAXB is an abbreviation for Java Architecture for XML Binding.
        Unmarshaller um = context.createUnmarshaller(); // JAXB includes methods for unmarshalling (reading) XML instance documents

        Inventory cars = (Inventory) um.unmarshal(new InputStreamReader(new FileInputStream("cars.xml"), StandardCharsets.UTF_8)); //it copies all result textfield and changes the document type to cars.xml

        List<Car> carList = cars.getCars();// changes carlist arrays to cars

        carList.add(carInventory.getCars().get(0));     //Add the taken information
        carInventory.setCars(carList);                  //Set cars to car inventory
        String result=createXML(carInventory);          //The completed XML is saved in the xml variable.

        return result;//A return statement causes the program control to transfer back to the caller of a method.

    }

}
