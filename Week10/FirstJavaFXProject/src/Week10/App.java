package Week10;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        // Launch the JavaFX application (calls start(...) internally)
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello! Bye!");

        Label label = new Label("Click the button!");
        Button helloButton = new Button("Say 'Hello!'");

        // Example: button click changes the label text
        helloButton.setOnAction(e -> label.setText("Hello, world!"));

        VBox root = new VBox();
        root.getChildren().addAll(label, helloButton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
