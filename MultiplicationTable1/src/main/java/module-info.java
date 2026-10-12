module com.example.multiplicationtable1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multiplicationtable1 to javafx.fxml;
    exports com.example.multiplicationtable1;
}