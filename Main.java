import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        Label lbl = new Label();
        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(15);
        textArea.setPrefRowCount(5);
        Button btn = new Button("Click");
        btn.setOnAction(event -> lbl.setText("Input: " + textArea.getText()));
        FlowPane root = new FlowPane(Orientation.VERTICAL,10,10,textArea,btn,lbl);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,300,250);

        stage.setScene(scene);
        stage.setTitle("TextArea in JavaFX");
        stage.show();
    }
}