package Trafficlight;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    @Override
    public void start(Stage mainStage) {
        Pane myLightPane = new Pane();
        Rectangle myRectangle = new Rectangle(0, 0, 33, 100);
        Circle redLight = new Circle(17, 25, 10);
        Circle yellowLight = new Circle(17, 50, 10);
        Circle greenLight = new Circle(17, 75, 10);
        myRectangle.setFill(Color.WHITE);
        myRectangle.setStroke(Color.BLACK);
        myRectangle.xProperty().bind(myLightPane.widthProperty().divide(2).subtract(myRectangle.getWidth() / 2));
        myRectangle.yProperty().bind(myLightPane.heightProperty().divide(2).subtract(myRectangle.getHeight() / 2));
        redLight.setFill(Color.WHITE);
        redLight.setStroke(Color.BLACK);
        redLight.centerXProperty().bind(myLightPane.widthProperty().divide(2));
        redLight.centerYProperty().bind(myRectangle.yProperty().add(20));
        yellowLight.setFill(Color.WHITE);
        yellowLight.setStroke(Color.BLACK);
        yellowLight.centerXProperty().bind(myLightPane.widthProperty().divide(2));
        yellowLight.centerYProperty().bind(myRectangle.yProperty().add(50));
        greenLight.setFill(Color.WHITE);
        greenLight.setStroke(Color.BLACK);
        greenLight.centerXProperty().bind(myLightPane.widthProperty().divide(2));
        greenLight.centerYProperty().bind(myRectangle.yProperty().add(80));

        myLightPane.getChildren().addAll(myRectangle, redLight, yellowLight, greenLight);

        RadioButton Redrb = new RadioButton("Red");
        RadioButton Yellowrb = new RadioButton("Yellow");
        RadioButton Greenrb = new RadioButton("Green");

        ToggleGroup myToggleGroup = new ToggleGroup();
        Redrb.setToggleGroup(myToggleGroup);
        Yellowrb.setToggleGroup(myToggleGroup);
        Greenrb.setToggleGroup(myToggleGroup);

        HBox controlPanel = new HBox(10);
        controlPanel.getChildren().addAll(Redrb, Yellowrb, Greenrb);
        controlPanel.setAlignment(Pos.CENTER);

        BorderPane myPane = new BorderPane();
        myPane.setCenter(myLightPane);
        myPane.setBottom(controlPanel);

        Redrb.setOnAction(e -> {
            redLight.setFill(Color.RED);
            yellowLight.setFill(Color.WHITE);
            greenLight.setFill(Color.WHITE);
        });

        Yellowrb.setOnAction(e -> {
            redLight.setFill(Color.WHITE);
            yellowLight.setFill(Color.YELLOW);
            greenLight.setFill(Color.WHITE);
        });

        Greenrb.setOnAction(e -> {
            redLight.setFill(Color.WHITE);
            yellowLight.setFill(Color.WHITE);
            greenLight.setFill(Color.GREEN);
        });

        Scene scene = new Scene(myPane, 300, 150);
        mainStage.setTitle("TrafficLight");
        mainStage.setScene(scene);
        mainStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}