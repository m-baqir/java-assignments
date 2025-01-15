package Assignment7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ColorChange extends Application {
	protected Text myText = new Text("Show Colors");
	protected Slider redSlider = new Slider();
	protected Slider greenSlider = new Slider();
	protected Slider blueSlider = new Slider();
	protected Slider opacitySlider = new Slider();

	@Override
	public void start(Stage mainStage) {
		StackPane myTextPane = new StackPane(myText);
		myTextPane.setPadding(new Insets(20, 10, 5, 10));

		redSlider.setMin(0.0);
		redSlider.setMax(1.0);
		greenSlider.setMin(0.0);
		greenSlider.setMax(1.0);
		blueSlider.setMin(0.0);
		blueSlider.setMax(1.0);
		opacitySlider.setMin(0.0);
		opacitySlider.setMax(1.0);

		redSlider.valueProperty().addListener(ov -> setColor());
		greenSlider.valueProperty().addListener(ov -> setColor());
		blueSlider.valueProperty().addListener(ov -> setColor());
		opacitySlider.valueProperty().addListener(ov -> setColor());
		opacitySlider.setValue(1);

		GridPane sliderPane = new GridPane();
		sliderPane.setAlignment(Pos.CENTER);
		sliderPane.setVgap(5);
		sliderPane.setHgap(5);
		sliderPane.add(new Label("Red"), 0, 0);
		sliderPane.add(redSlider, 1, 0);
		sliderPane.add(new Label("Green"), 0, 1);
		sliderPane.add(greenSlider, 1, 1);
		sliderPane.add(new Label("Blue"), 0, 2);
		sliderPane.add(blueSlider, 1, 2);
		sliderPane.add(new Label("Opacity"), 0, 3);
		sliderPane.add(opacitySlider, 1, 3);

		BorderPane myBorderPane = new BorderPane();
		myBorderPane.setTop(myTextPane);
		myBorderPane.setCenter(sliderPane);

		Scene myScene = new Scene(myBorderPane, 250, 150);
		mainStage.setTitle("Sliders");
		mainStage.setScene(myScene);
		mainStage.show();
	}

	private void setColor() {
		myText.setFill(new Color(redSlider.getValue(), greenSlider.getValue(),
				blueSlider.getValue(), opacitySlider.getValue()));
	}

	public static void main(String[] args) {
		launch(args);
	}
}