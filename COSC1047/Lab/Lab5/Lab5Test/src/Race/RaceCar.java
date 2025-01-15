package Race;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RaceCar extends Application {
    @Override
    public void start(Stage primaryStage) {
        CarPane mycarPane = new CarPane();

        // Pause and resume animation
        mycarPane.setOnMousePressed(e -> mycarPane.pause());
        mycarPane.setOnMouseReleased(e -> mycarPane.play());

        // Increase and decrease speed
        mycarPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                mycarPane.fast();
            } else if (e.getCode() == KeyCode.DOWN) {
                mycarPane.slow();
            }
        });

        // Create a scene
        Scene scene = new Scene(mycarPane, 450, 70);
        primaryStage.setTitle("MyRaceCar");
        primaryStage.setScene(scene);
        primaryStage.show();

        mycarPane.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

class CarPane extends Pane {

    Timeline myTimeline;
    private double x = 5;
    private double y = 0;
    private double dx = 1;
    private Circle circle1 = new Circle(x + 15, y + 35, 5);
    private Circle circle2 = new Circle(x + 35, y + 35, 5);
    private Rectangle myRectangle = new Rectangle(x, y + 20, 50, 10);
    private Polygon myPolygon = new Polygon(x + 5, y + 20, x + 15, y + 10, x + 25, y + 10, x + 35, y + 20);

    public CarPane() {
        circle1.setFill(Color.BLACK);
        circle2.setFill(Color.BLACK);
        myPolygon.setFill(Color.BLUEVIOLET);
        myRectangle.setFill(Color.BROWN);
        getChildren().addAll(circle2, myRectangle, myPolygon);
        getChildren().add(circle1);
        

        // Create animation
        myTimeline = new Timeline(
                new KeyFrame(Duration.millis(50), e -> carMove()));
        myTimeline.setCycleCount(Timeline.INDEFINITE);
        myTimeline.play();
    }

    public void play() {
        myTimeline.play();
    }

    public void pause() {
        myTimeline.pause();
    }

    public void fast() {
        myTimeline.setRate(myTimeline.getRate() + 0.5);
    }

    public void slow() {
        myTimeline.setRate(
                myTimeline.getRate() > 0 ? myTimeline.getRate() - 0.75 : 0);
    }

    public DoubleProperty rateProperty() {
        return myTimeline.rateProperty();
    }

    protected void carMove() {
        if (x < 0 || x > getWidth() - 60) {
            dx *= -1;
        }

        x += dx;
        circle1.setCenterX(x + 35);
        circle2.setCenterX(x + 15);
        myRectangle.setX(x);
        myPolygon.setLayoutX(x);
    }
}