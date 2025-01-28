import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxVBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creating HBox
        HBox hbox = new HBox(10); // 10px spacing between elements
        Button hButton1 = new Button("Button 1");
        Button hButton2 = new Button("Button 2");
        Button hButton3 = new Button("Button 3");
        hbox.getChildren().addAll(hButton1, hButton2, hButton3);

        // Creating VBox
        VBox vbox = new VBox(10); // 10px spacing between elements
        Button vButton1 = new Button("Button A");
        Button vButton2 = new Button("Button B");
        Button vButton3 = new Button("Button C");
        vbox.getChildren().addAll(vButton1, vButton2, vButton3);

        // Creating the main layout which combines both HBox and VBox
        VBox mainLayout = new VBox(20); // Vertical space between HBox and VBox
        mainLayout.getChildren().addAll(hbox, vbox);

        // Scene setup
        Scene scene = new Scene(mainLayout, 300, 200);

        // Setting the stage
        primaryStage.setTitle("HBox and VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
