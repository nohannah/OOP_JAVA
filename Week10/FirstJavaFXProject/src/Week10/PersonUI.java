
package Week10;
import javafx.application.Application;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonUI extends Application{
    private Person1 p;
    private Label label;
    private TextField nameField;
    private TextField taskField;
    public static void main(String[] args) {
        PersonUI.launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Person editor");
        p=new Person1("Danny", 60);
        label=new Label("Personal Details "+p);
        nameField=new TextField();
        nameField.setPromptText("Enter new name ");

        Button changenameButton=new Button("Change name");
        changenameButton.setOnAction(event->updateName());

        Button increasebtn=new Button("Increase age");
        increasebtn.setOnAction(event->
        {
            p.increaseAge();
            updateLabel();
        });

        Button decreasebtn=new Button("Decrease age");
        decreasebtn.setOnAction(event->
        {
            p.decreaseAge();
            updateLabel();
        });

        taskField=new TextField();
        taskField.setPromptText("Enter a new task to-do");
        
        Button addtodobtn=new Button("Add to-do");
        addtodobtn.setOnAction(event->{
            addtodo();
            updateLabel();}
            );

        int horizontalPadding=5;
        HBox nameRow=new HBox(horizontalPadding,nameField,changenameButton);
        nameRow.setAlignment(Pos.CENTER);

        HBox ageRow=new HBox(horizontalPadding,increasebtn, decreasebtn);
        ageRow.setAlignment(Pos.CENTER);

        HBox todoRow=new HBox(horizontalPadding,taskField,addtodobtn);
        todoRow.setAlignment(Pos.CENTER);

        int verticalPadding=5;
        VBox root=new VBox(verticalPadding, label,nameRow, ageRow, todoRow);
        root.setAlignment(Pos.CENTER);

        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();


        

    }
    private void updateName()
    {
            String newName=nameField.getText();
            if(!newName.trim().isEmpty())
            {
                p.setName(newName);
                updateLabel();            
            }
    }
    private void updateLabel()
    {
        label.setText("Personal Details "+p);
    }
    private void addtodo()
    {
        String t=taskField.getText();
        Todo task=new Todo(t);
        p.addTodo(task);
    }
    
}