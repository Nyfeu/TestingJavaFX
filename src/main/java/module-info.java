module app.testingjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.testingjavafx to javafx.fxml;
    exports app.testingjavafx;
}