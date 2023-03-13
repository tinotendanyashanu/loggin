module com.example.loggin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loggin to javafx.fxml;
    exports com.example.loggin;
}