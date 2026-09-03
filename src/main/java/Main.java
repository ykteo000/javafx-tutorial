import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label helloWorld = new Label("Hello World!"); // UI text element
        Scene scene = new Scene(helloWorld);          // Canvas containing the label
        stage.setScene(scene);                        // Put canvas in window
        stage.show();                                 // Display window
    }
}