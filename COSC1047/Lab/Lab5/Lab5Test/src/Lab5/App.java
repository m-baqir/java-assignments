package Lab5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(195);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Ellipse ellipse1 = new Ellipse();
        ellipse1.setCenterX(110);
        ellipse1.setCenterY(150);
        ellipse1.setRadiusX(40);
        ellipse1.setRadiusY(30);
        ellipse1.setStroke(Color.BLACK);
        ellipse1.setFill(Color.WHITE);

        Ellipse ellipse2 = new Ellipse();
        ellipse2.setCenterX(290);
        ellipse2.setCenterY(150);
        ellipse2.setRadiusX(40);
        ellipse2.setRadiusY(30);
        ellipse2.setStroke(Color.BLACK);
        ellipse2.setFill(Color.WHITE);

        Circle eye1 = new Circle();
        eye1.setCenterX(110);
        eye1.setCenterY(150);
        eye1.setRadius(20);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.BLACK);

        Circle eye2 = new Circle();
        eye2.setCenterX(290);
        eye2.setCenterY(150);
        eye2.setRadius(20);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.BLACK);

        Polygon nose = new Polygon();
        nose.getPoints().addAll(new Double[] {
                200.0, 175.0,
                150.0, 225.0,
                250.0, 225.0
        });
        nose.setStroke(Color.BLACK);
        nose.setFill(Color.WHITE);

        Arc mouth = new Arc(200, 300, 80, 30, 180, 180);
        mouth.setFill(Color.WHITE);
        mouth.setStroke(Color.BLACK);
        mouth.setType(ArcType.OPEN);

        Pane pane = new Pane();

        pane.getChildren().addAll(circle, ellipse1, ellipse2, eye1, eye2, nose, mouth);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Smiley Face");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}