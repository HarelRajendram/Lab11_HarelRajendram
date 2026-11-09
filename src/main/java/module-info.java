module com.mycompany.lab11_harelrajendram {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab11_harelrajendram to javafx.fxml;
    exports com.mycompany.lab11_harelrajendram;
}
