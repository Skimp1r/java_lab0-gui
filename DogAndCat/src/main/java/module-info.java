module com.mycompany.dogandcat {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.dogandcat to javafx.fxml;
    exports com.mycompany.dogandcat;
}
