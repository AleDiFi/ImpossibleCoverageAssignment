module com.example.impossiblecoverageassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.impossiblecoverageassignment to javafx.fxml;
    exports com.example.impossiblecoverageassignment;
}