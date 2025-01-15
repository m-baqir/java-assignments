package Assignment5;

import java.lang.ProcessBuilder.Redirect;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StopSign extends Application {
   @Override
   public void start(Stage stage) {
      Polygon polygon = new Polygon();

      polygon.getPoints().addAll(new Double[] {
            69.0, 25.0,
            131.0, 25.0,
            175.0, 69.0,
            175.0, 131.0,
            131.0, 175.0,
            69.0, 175.0,
            25.0, 131.0,
            25.0, 69.0,
      });
      polygon.setFill(Color.RED);

      Group root = new Group(polygon);
      Text text = new Text("STOP");
      text.setFill(Color.WHITE);
      text.setX(200);
      text.setY(150);
      text.setFont(Font.font(null, FontWeight.BOLD, 40));

      StackPane stackPane = new StackPane(polygon, text);

      Scene scene = new Scene(stackPane, 600, 300);
      stage.setTitle("Drawing a Stop Sign");

      stage.setScene(scene);

      stage.show();
   }

   public static void main(String args[]) {
      launch(args);
   }
}