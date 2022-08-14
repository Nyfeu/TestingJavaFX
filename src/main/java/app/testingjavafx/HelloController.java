package app.testingjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label testLabel;

    @FXML
    private Button testBtn;

    @FXML
    protected void onButtonClick() {
        testLabel.setText("Testing JavaFX!");
    }
}