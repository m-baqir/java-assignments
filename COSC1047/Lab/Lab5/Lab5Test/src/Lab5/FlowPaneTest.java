package Lab5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FlowPaneTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        ImageView iv1 = new ImageView(getClass().getResource("images\\swift-og.png").toExternalForm());
        Label iv1Label = new Label("Swift");
        iv1.setFitWidth(100);
        iv1.setFitHeight(100);
        iv1Label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        ImageView iv2 = new ImageView(getClass().getResource("images\\ISO_C++_Logo.svg.png").toExternalForm());
        Label iv2Label = new Label("C++");
        iv2.setFitWidth(100);
        iv2.setFitHeight(100);
        iv2Label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        ImageView iv3 = new ImageView(
                getClass().getResource("images\\java-logo-7833D1D21A-seeklogo.com.png").toExternalForm());
        Label iv3Label = new Label("Java");
        iv3.setFitWidth(100);
        iv3.setFitHeight(100);
        iv3Label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        primaryStage.setTitle("FlowPane Example");
        FlowPane root = new FlowPane();
        root.setVgap(6);
        root.setHgap(5);
        root.setPrefWrapLength(250);
        root.getChildren().add(iv1Label);
        root.getChildren().add(iv1);
        root.getChildren().add(iv2Label);
        root.getChildren().add(iv2);
        root.getChildren().add(iv3Label);
        root.getChildren().add(iv3);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}