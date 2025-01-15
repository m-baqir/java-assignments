package Lab7;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LunchMenu extends Application {

    protected BorderPane getPane() {

        HBox myHbox = new HBox(20);
        Button buttonSubmit = new Button("Submit");
        myHbox.getChildren().add(buttonSubmit);
        myHbox.setAlignment(Pos.CENTER);
        BorderPane pane = new BorderPane();
        pane.setBottom(myHbox);

        VBox myVbox = new VBox(20);
        myVbox.setPadding(new Insets(5, 5, 5, 5));
        Label drink = new Label("Drink");
        RadioButton radioButtonCoffee = new RadioButton("Coffee");
        RadioButton radioButtonTea = new RadioButton("Tea");
        RadioButton radioButtonPop = new RadioButton("Pop");
        myVbox.getChildren().addAll(drink, radioButtonCoffee, radioButtonTea, radioButtonPop);
        pane.setLeft(myVbox);

        ToggleGroup group = new ToggleGroup();
        radioButtonCoffee.setToggleGroup(group);
        radioButtonTea.setToggleGroup(group);
        radioButtonPop.setToggleGroup(group);

        TextArea myTextarea = new TextArea();
        myTextarea.setFont(new Font("Serif", 14));
        myTextarea.setWrapText(true);
        myTextarea.setEditable(false);
        BorderPane textAreaPane = new BorderPane();
        textAreaPane.setCenter(myTextarea);
        pane.setCenter(textAreaPane);
        myTextarea.setText("Total is $0.00");

        ComboBox<String> myComboBox = new ComboBox<>();
        ObservableList<String> myList = FXCollections.observableArrayList("Select an item", "Hot Dog", "Sandwich",
                "Hamburger");
        myComboBox.getItems().addAll(myList);
        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(myComboBox);
        pane.setTop(paneForComboBox);
        myComboBox.setPrefWidth(200);
        myComboBox.setValue("Select an Item");

        // process cost
        buttonSubmit.setOnAction(e -> {
            double first;
            double second;
            if (radioButtonCoffee.isSelected()) {
                first = 1.50;
            } else if (radioButtonTea.isSelected()) {
                first = 2.50;
            } else if (radioButtonPop.isSelected()) {
                first = 3.50;
            } else {
                first = 0;
            }

            if (myList.indexOf(myComboBox.getValue()) == 1) {
                second = 1.50;
            } else if (myList.indexOf(myComboBox.getValue()) == 2) {
                second = 2.50;
            } else if (myList.indexOf(myComboBox.getValue()) == 3) {
                second = 3.50;
            } else {
                second = 0;
            }
            myTextarea.setText(String.format("Total is $%.2f", (first + second)));
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) {

        // Create Scene
        Scene scene = new Scene(getPane(), 300, 300);
        primaryStage.setTitle("Lunch Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}