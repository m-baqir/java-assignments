package Lab6;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
    @Override
    public void start(Stage primaryStage) {

        Text Number1 = new Text("Number 1:");
        Text Number2 = new Text("Number 2:");
        Text Result = new Text("Result:");
        TextField textFieldNumber1 = new TextField();
        TextField textFieldNumber2 = new TextField();
        TextField textFieldResult = new TextField();
        textFieldResult.setEditable(false);

        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        Button clear = new Button("Clear");
        Button calculate = new Button("Calculate");
        RadioButton multiply = new RadioButton("Multiply");
        RadioButton divide = new RadioButton("Divide");
        Text symbol = new Text("");
        Text result = new Text("");

        HBox calcBottom = new HBox();
        calcBottom.setPadding(new Insets(5));
        calcBottom.getChildren().addAll(textFieldNumber1, symbol, textFieldNumber2);
        VBox myBox = new VBox();
        myBox.getChildren().addAll(calculate, multiply, divide);

        ToggleGroup tg = new ToggleGroup();
        multiply.setToggleGroup(tg);
        divide.setToggleGroup(tg);

        BorderPane pane = new BorderPane();
        pane.setTop(myBox);
        pane.setBottom(calcBottom);

        multiply.setOnAction(e -> {
            symbol.setText("*");
        });

        divide.setOnAction(e -> {
            symbol.setText("/");
        });

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }

    private static double getDouble(TextField t) {
        return Double.parseDouble(t.getText());
    }

    public static void main(String[] args) {
        launch(args);
    }

    public class CalculateBtHandler implements EventHandler {

        @Override
        public void handle(Event calculateEvent) {

        }

    }
}