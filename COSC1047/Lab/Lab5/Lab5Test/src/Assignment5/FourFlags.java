package Assignment5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FourFlags extends Application {

    @Override
    public void start(Stage primaryStage) {
        ImageView iv1 = new ImageView(getClass().getResource("images\\Flag_of_Canada.svg.png").toExternalForm());

        iv1.setFitWidth(400);
        iv1.setFitHeight(200);

        ImageView iv2 = new ImageView(
                getClass().getResource("images\\Flag_of_Pakistan.svg.png").toExternalForm());

        iv2.setFitWidth(400);
        iv2.setFitHeight(200);

        ImageView iv3 = new ImageView(
                getClass().getResource("images\\flag-400.png").toExternalForm());

        iv3.setFitWidth(400);
        iv3.setFitHeight(200);

        ImageView iv4 = new ImageView(
                getClass().getResource("images\\Flag_of_the_United_Kingdom.svg.png").toExternalForm());

        iv4.setFitWidth(400);
        iv4.setFitHeight(200);

        primaryStage.setTitle("GridPane Example");
        GridPane root = new GridPane();
        root.setVgap(6);
        root.setHgap(5);

        root.add(iv1, 0, 0, 1, 1);
        root.add(iv2, 1, 0, 1, 1);
        root.add(iv3, 0, 1, 1, 1);
        root.add(iv4, 1, 1, 1, 1);

        Scene scene = new Scene(root, 800, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}