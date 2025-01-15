package lab8;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import java.io.*;

public class Part2 extends Application {
    private TextArea myTextArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) {
        mainStage.setTitle("Save Data");

        VBox myVBox = new VBox(10);
        myVBox.setPadding(new Insets(10));
        Label myLabel = new Label("Enter the data:");
        myTextArea = new TextArea();

        Button mySaveButton = new Button("Save Data");
        mySaveButton.setOnAction(e -> saveToFile());

        myVBox.getChildren().addAll(myLabel, myTextArea, mySaveButton);

        Scene myScene = new Scene(myVBox, 400, 300);
        mainStage.setScene(myScene);
        mainStage.show();
    }

    private void saveToFile() {

        FileChooser myFileChooser = new FileChooser();
        myFileChooser.setTitle("Save Data");
        File myFile = myFileChooser.showSaveDialog(null);

        if (myFile != null) {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(myFile))) {

                String[] myLines = myTextArea.getText().split("\n");
                int gradeTotal = 0;
                int studentNum = 0;

                for (String myLine : myLines) {

                    String[] parts = myLine.split(" ");
                    if (parts.length >= 2) {
                        String name = parts[0];
                        int grade = Integer.parseInt(parts[1]);

                        dos.writeUTF(name);
                        dos.writeInt(grade);
                        gradeTotal += grade;
                        studentNum++;
                    }
                }
                if (studentNum > 0) {

                    double gradeAvg = (double) gradeTotal /
                            studentNum;
                    dos.writeDouble(gradeAvg);
                } else {
                    ErrorDialog("Not valid.");
                }
                InfoDialog("Data saved.");
            } catch (IOException | NumberFormatException ex) {
                ex.printStackTrace();
                ErrorDialog("Error saving data.");
            }
        }
    }

    private void ErrorDialog(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    private void InfoDialog(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}