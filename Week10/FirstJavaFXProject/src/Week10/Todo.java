package Week10;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Todo {

    String task; 
    public Todo(String task) {
        this.task = task;
    }
    @Override
    public String toString() {
        return this.task;
    }

}
