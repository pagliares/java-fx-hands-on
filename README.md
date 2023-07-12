# JavaFX hands-on

Welcome to the repository containing examples used in the classes about Java Desktop Development with JAVA FX. The classes are taught by Rodrigo Martins Pagliares in the Computer Science undergraduate course at UNIFAL-MG, Brazil. 

I thinnk this repository is a valuable resource for students who want to review class examples or further explore JavaFX development. I hope you find it helpful and informative!

## Outline

### Part I - First steps with JavaFX
<p><a href="https://github.com/pagliares/java-fx-hands-on#01---first-javafx-application">01 - First JavaFX application with fxml</a></p>
<p><a href="https://github.com/pagliares/java-fx-hands-on#01---first-javafx-application">02 - First JavaFX application without fxml</a></p>

## Part I - First steps with JavaFX

### 01 - First JavaFX application with fxml 

- <small><a href="https://github.com/pagliares/java-fx-hands-on#outline">Back to Outline</a></small>
- <strong>Project source:</strong> FirstJavaFXApplication

<p align="center"> <img src="Images/HelloApplication.png" width=302 height="251" alt="Example output" title="First JFrame"></p>
<p align="center"> <img src="Images/HelloApplication_2.png" width=302 height="251" alt="Example output" title="First JFrame"></p>

<strong>Summary</strong>

<strong>File hello-view.fxml</strong>

<p align="center"> <img src="Images/Example_01/file-hello-viewl-xml.png" width=807 height="419" alt="Example output" title="First JFrame"></p>

Overall, this FXML file defines a simple user interface with a label and a button, and specifies that the HelloController class should be used as the controller for the user interface.

The first three lines are import statements for the JavaFX layout and control classes used in the FXML file.

The <VBox> tag defines a vertical box layout container, which will contain the user interface elements.

The alignment and spacing attributes of the <VBox> tag set the alignment and spacing properties of the layout.

The <padding> tag sets the padding of the <VBox> container.

The <Label> tag creates a label control with an fx:id attribute of welcomeText. The fx:id attribute is used to uniquely identify the control within the FXML file.

The <Button> tag creates a button control with the text "Hello!" and an onAction attribute of #onHelloButtonClick. This specifies that when the button is clicked, the onHelloButtonClick method of the HelloController class should be invoked.

The xmlns:fx attribute is an XML namespace declaration for the http://javafx.com/fxml namespace, which is used to reference JavaFX-specific FXML elements and attributes.

The fx:controller attribute of the <VBox> tag specifies the fully-qualified name of the Java class that serves as the controller for this FXML file. In this case, it is com.example.firstjavafxapplication.HelloController.

<strong>File HelloController.java</strong>

<p align="center"> <img src="Images/Example_01/file_hello_controller.png" width=680 height="447" alt="Example output" title="First JFrame"></p>

Overall, this Java class defines a controller that handles the user input of clicking the "Hello!" button in the FXML file and updates the label control with the text "Welcome to JavaFX Application!".

The HelloController class is defined as a public class.

The @FXML annotation is used to mark the welcomeText instance variable as an element in the FXML file with an fx:id attribute of welcomeText. This is how the controller is able to access and manipulate the label control in the FXML file.

The onHelloButtonClick() method is marked with the @FXML annotation and is called when the button in the FXML file is clicked. The method sets the text of the welcomeText label control to "Welcome to JavaFX Application!".

The onHelloButtonClick() method is marked as protected, which means it can only be accessed by subclasses of HelloController.

<strong>File HelloApplication.java</strong>

<p align="center"> <img src="Images/Example_01/file-hello-application.png" width=841 height="476" alt="Example output" title="First JFrame"></p>

Overall, this Java class defines the entry point of the JavaFX application and sets up the user interface by loading the FXML file and creating a Scene object to display it on the Stage.

The HelloApplication class is defined as a public class that extends the Application class.

The start() method is overridden and is called when the JavaFX application is launched. In this method, an FXMLLoader is created that loads the FXML file with the user interface. A Scene object is then created with the loaded FXML root node and set to the specified size. The Scene object is then set on the Stage object, which is created by the launch() method. Finally, the Stage object is displayed on the screen.

The main() method is a static method that is called to launch the JavaFX application. The launch() method is called to start the JavaFX application.

The HelloApplication class does not define any other methods or variables.

<strong>File module-info.java</strong>

<p align="center"> <img src="Images/Example_01/file-module-info.png" width=647 height="209" alt="Example output" title="First JFrame"></p>

Overall, this module descriptor file specifies the module dependencies, opens the package to the javafx.fxml module, and exports the package to be visible to other modules.

The module keyword is used to declare that this file is a module descriptor.

The com.example.firstjavafxapplication is the name of the module.

The requires keyword is used to specify the dependencies of the module. In this case, the javafx.controls and javafx.fxml modules are required.

The opens keyword is used to specify the packages that should be accessible to the javafx.fxml module. In this case, the com.example.firstjavafxapplication package is opened to the javafx.fxml module.

The exports keyword is used to specify the packages that should be visible to other modules. In this case, the com.example.firstjavafxapplication package is exported.

<strong>File pom.xml </strong>

<p align="center"> <img src="Images/Example_01/file-pom-xml-dependencies.png" width=465 height="477" alt="Example output" title="First JFrame"></p>

<p align="center"> <img src="Images/Example_01/file-pom-xml-plugin.png" width=879 height="435" alt="Example output" title="First JFrame"></p>


File for a Maven project that includes dependencies and plugins for building a JavaFX application. Here's a breakdown of the relevant parts:

The dependencies section lists the required dependencies for the project. In this case, the project requires the javafx-controls and javafx-fxml dependencies to use JavaFX components and features in the application. The project also includes JUnit Jupiter API and engine dependencies for unit testing.

The build section includes plugins that are used during the build process. The maven-compiler-plugin is used to compile the Java source code. The plugin is configured to use Java 19 for both the source and target. The javafx-maven-plugin is used to package and run the JavaFX application. It is configured to use the HelloApplication class as the main class to launch the application. Other configuration options include specifying the name of the launcher, the name of the JLink zip and image, and turning off debug information and header files.


### 02 - First JavaFX application without fxml (not recommended)

- <small><a href="https://github.com/pagliares/java-fx-hands-on#outline">Back to Outline</a></small>
- <strong>Project source:</strong> first-javafx-application-without-fxml

<p align="center"> <img src="Images/Hello_Application_Without_FXML.png" width=302 height="251" alt="Example output" title="First JFrame"></p>

<strong>Summary</strong>

This is a JavaFX application that creates a simple UI without using FXML. The UI consists of a vertical box (VBox) that contains a Label and a Button. When the button is clicked, the label text is changed to a welcome message.

The start method is the main entry point for JavaFX applications. It sets up the UI by creating a VBox and adding a Label and Button to it. It also creates a Scene object and sets it as the scene for the Stage. Finally, it sets the title of the Stage and shows it.

The main method simply calls the launch method to start the application.
