package app;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AppController {

    // Label IDs:

        @FXML
        private Label testLabel;

    // Button IDs:

        @FXML
        private Button testBtn;


    // eventHandling methods:

        @FXML
        protected void onButtonClick() { testLabel.setText("Testing JavaFX!"); }


}