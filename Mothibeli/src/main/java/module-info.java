module com.mycompany.mothibeli {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mothibeli to javafx.fxml;
    exports com.mycompany.mothibeli;
}
