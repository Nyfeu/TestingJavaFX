package app;

import gui.util.Alerts;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;

public class AppView extends Application {

    @Override
    public void init() {

        /* The init() method does something before the app starts! */

        System.out.println("Initializing!");
    }

    @Override
    public void start(Stage stage) throws IOException {

        /* Everything here will happen when the app get starts! */

        // Initializing the Scene:

            FXMLLoader fxmlLoader = new FXMLLoader(AppView.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Sum - Calculator");
            stage.setScene(scene);
            stage.show();

        // Showing a INFORMATION alert:

            Alerts.showAlert("Test","Testing","Testing JavaFx!", AlertType.INFORMATION);

            // There are some types of alerts (pre-defined): INFORMATION, CONFIRMATION, ERROR, NONE and WARNING.

    }

    public void stop() {

        /* The stop() method does something before the app finalizes! */

        System.out.println("Finalizing!");

    }

    public static void main(String[] args) {

        // It starts the app:

            launch();

    }

}