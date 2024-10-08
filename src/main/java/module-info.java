module com.example.figmatocode2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.figmatocode2 to javafx.fxml;
    exports com.example.figmatocode2;
}