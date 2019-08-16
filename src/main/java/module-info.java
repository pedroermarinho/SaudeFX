module SaudeFX {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.saudefx to javafx.fxml;
    exports br.com.saudefx;
}