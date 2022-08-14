package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AppController {

    // TextFields IDs:

        @FXML
        private TextField num1Field;

        @FXML
        private TextField num2Field;

        @FXML
        private TextField num3Field;

        @FXML
        private TextField resultField;

    // Button IDs:

        @FXML
        private Button calculateBtn;


    // eventHandling methods:

        @FXML
        protected void onButtonClick() {

                double result = Double.parseDouble(num1Field.getText()) + Double.parseDouble(num2Field.getText()) + Double.parseDouble(num3Field.getText());
                resultField.setText(String.format("%.2f", result));

        }


}