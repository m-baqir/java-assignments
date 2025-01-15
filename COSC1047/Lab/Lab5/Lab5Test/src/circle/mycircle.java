package circle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class mycircle extends Application {
    protected BorderPane myPane() {

        StackPane stackpane = new StackPane();
        BorderPane borderpane = new BorderPane();

        Circle red = new Circle(0, 0, 20);
        red.centerXProperty().bind(stackpane.widthProperty().divide(2));
        red.centerYProperty().bind(stackpane.heightProperty().divide(2).subtract(30));
        red.setFill(Color.RED);
        Circle blue = new Circle(150, 100, 10);
        blue.centerXProperty().bind(stackpane.widthProperty().divide(2));
        blue.centerYProperty().bind(stackpane.heightProperty().divide(2));
        blue.setFill(Color.BLUE);

        stackpane.getChildren().addAll(red, blue);

        borderpane.setCenter(stackpane);

        red.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    red.setRadius(red.getRadius() - 5);
                    break;
                case UP:
                    red.setRadius(red.getRadius() + 5);
                    break;
            }
        });

        return borderpane;

    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(myPane(), 400, 400);
        primaryStage.setTitle("circle");
        primaryStage.setScene(scene);
        primaryStage.show();

        myPane().requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

}