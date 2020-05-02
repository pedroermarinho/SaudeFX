# commands


## run jar
```
java --module-path=snap/local/javafx-sdk-11.0.2/lib --add-modules=javafx.controls,javafx.fxml,com.jfoenix --add-exports javafx.controls/com.sun.javafx.scene.control=com.jfoenix --add-exports javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix -cp shade/SaudeFX.jar br.com.saudefx.App
```