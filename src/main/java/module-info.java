module com.brh.uebung_vorb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.brh.uebung_vorb to javafx.fxml;
    exports com.brh.uebung_vorb;
}