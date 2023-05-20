module com.mukhortov.graph1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.mukhortov.graph1 to javafx.fxml;
    exports com.mukhortov.graph1;
}