package Timeline;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MyTimeLIne extends Application {
    @Override
    public void start(Stage primaryStage) {
        TimeLinePane timeLinePane = new TimeLinePane();

        timeLinePane.setOnMousePressed(e -> timeLinePane.pause());
        timeLinePane.setOnMouseReleased(e -> timeLinePane.play());

        Scene scene = new Scene(timeLinePane, 300, 300);
        primaryStage.setTitle("Time Line");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

class TimeLinePane extends Pane {

    private Timeline animation;
    private int sec;
    private double secondX = 150 * Math.sin(sec * (2 * Math.PI * 100));
    private double secondY = 150 * Math.cos(sec * (2 * Math.PI * 100));
    private Line line = new Line(150, 150, secondX, secondY);

    public TimeLinePane() {

        getChildren().add(line);

        animation = new Timeline(
                new KeyFrame(Duration.seconds(1), e -> moveLine()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
    }

    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }

    protected void moveLine() {
        sec = (sec < 100 ? sec + 1 : 1);

        line.setEndX(150 * Math.sin(sec * (2 * Math.PI * 100)));
        line.setEndY(150 * Math.cos(sec * (2 * Math.PI * 100)));
    }
}