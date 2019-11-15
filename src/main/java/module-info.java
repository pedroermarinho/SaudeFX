
module SaudeFX {
//    requires com.jfoenix;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires com.jfoenix;


    opens br.com.saudefx to javafx.fxml, javafx.controls,com.jfoenix;
    exports br.com.saudefx;
}