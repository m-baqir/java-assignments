package Assignment6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Bubbles extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setOnMousePressed(e -> {
            if (e.isSecondaryButtonDown()) {
                pane.getChildren().remove(e.getTarget());
            } else {
                pane.getChildren().add(new Circle(e.getX(), e.getY(), 10));
            }
        });

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Bubbles");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
