package Assignment7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;

public class Grapes extends Application {
    protected ComboBox<String> myComboBox = new ComboBox<>();

    @Override
    public void start(Stage mainStage) {
        myComboBox.getItems().addAll("TOP", "BOTTOM", "LEFT", "RIGHT");
        myComboBox.setStyle("-fx-color: yellow");
        myComboBox.setValue("LEFT");

        TextField myTextField = new TextField("0");
        myTextField.setPrefColumnCount(3);

        HBox settingsPane = new HBox(10);
        settingsPane.setAlignment(Pos.CENTER);
        settingsPane.getChildren().addAll(new Label("contentDisplay:"),
                myComboBox, new Label("graphicTextGap:"), myTextField);

        ImageView myImage = new ImageView(getClass().getResource("image\\grapes.gif").toExternalForm());

        Label labelGrapes = new Label("Grapes", myImage);
        labelGrapes.setGraphicTextGap(0);

        StackPane imagePane = new StackPane(labelGrapes);

        myComboBox.setOnAction(e -> {
            labelGrapes.setContentDisplay(setDisplay());
        });

        myTextField.setOnAction(e -> {
            labelGrapes.setGraphicTextGap(Integer.parseInt(myTextField.getText()));
        });

        BorderPane myBorderPane = new BorderPane();
        myBorderPane.setTop(settingsPane);
        myBorderPane.setCenter(imagePane);

        Scene scene = new Scene(myBorderPane, 400, 200);
        mainStage.setTitle("Grapes");
        mainStage.setScene(scene);
        mainStage.show();
    }

    private ContentDisplay setDisplay() {
        if (myComboBox.getValue().equals("TOP"))
            return ContentDisplay.TOP;
        else if (myComboBox.getValue().equals("BOTTOM"))
            return ContentDisplay.BOTTOM;
        else if (myComboBox.getValue().equals("LEFT"))
            return ContentDisplay.LEFT;
        else
            return ContentDisplay.RIGHT;
    }

    public static void main(String[] args) {
        launch(args);
    }
}