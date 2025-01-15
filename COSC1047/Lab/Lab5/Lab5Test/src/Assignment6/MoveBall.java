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
import javafx.stage.Stage;

public class MoveBall extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Button up = new Button("Up");
        Button down = new Button("Down");
        Button left = new Button("Left");
        Button right = new Button("Right");

        HBox calcBottom = new HBox(5);
        calcBottom.setAlignment(Pos.CENTER);
        calcBottom.setPadding(new Insets(5));
        calcBottom.getChildren().addAll(up, down, left, right);

        BorderPane pane = new BorderPane();
        myCircle circlePane = new myCircle();
        pane.setTop(circlePane);
        pane.setBottom(calcBottom);

        up.setOnAction(e -> {
            circlePane.moveUp();
        });
        down.setOnAction(e -> {
            circlePane.moveDown();
        });
        left.setOnAction(e -> {
            circlePane.moveLeft();
        });
        right.setOnAction(e -> {
            circlePane.moveRight();
        });

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Moving Ball");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}

class myCircle extends Pane {

    private Circle circle1 = new Circle(200, 50, 40);

    public myCircle() {
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        getChildren().addAll(circle1);
    }

    public void moveLeft() {
        circle1.setCenterX(circle1.getCenterX() - 10);
        if (circle1.getCenterX() - 40 < 0)
            circle1.setCenterX(0 + 40);
    }

    public void moveRight() {
        circle1.setCenterX(circle1.getCenterX() + 10);
        if (circle1.getCenterX() + 40 > 400)
            circle1.setCenterX(400 - 40);
    }

    public void moveUp() {
        circle1.setCenterY(circle1.getCenterY() - 10);
        if (circle1.getCenterY() - 40 < 0)
            circle1.setCenterY(0 + 40);
    }

    public void moveDown() {
        circle1.setCenterY(circle1.getCenterY() + 10);
        if (circle1.getCenterY() + 40 > 400)
            circle1.setCenterY(400 - 40);
    }

}
