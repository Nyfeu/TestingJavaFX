package app;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

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


        @Override
        public void initialize(URL url, ResourceBundle rb) {

                // Adding constraints:

                        // Setting to double:

                                Constraints.setTextFieldDouble(num1Field);
                                Constraints.setTextFieldDouble(num2Field);
                                Constraints.setTextFieldDouble(num3Field);

                        // Setting size:

                                Constraints.setTextFieldMaxLength(num1Field,10);
                                Constraints.setTextFieldMaxLength(num2Field,10);
                                Constraints.setTextFieldMaxLength(num3Field,10);

        }
}