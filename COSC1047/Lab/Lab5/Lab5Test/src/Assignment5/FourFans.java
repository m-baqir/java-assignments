package Assignment5;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class FourFans extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                Circle circle = new Circle();
                circle.setRadius(150);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.WHITE);

                double rotate = 50;
                Pane pane2 = new Pane();
                for (int k = 0; k < 4; k++) {

                    Arc arc = new Arc(150, 150, 110, 110, 90 + rotate, 40);
                    arc.setFill(Color.BLACK);
                    arc.setType(ArcType.ROUND);
                    rotate += 90;
                    pane2.getChildren().add(arc);
                }

                pane.add(circle, i, j);
                pane.add(pane2, i, j);

            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("FourFans");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

}