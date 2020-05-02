#!/bin/bash

java --module-path=$PATH_TO_FX --add-modules=javafx.controls,javafx.fxml,com.jfoenix --add-exports javafx.controls/com.sun.javafx.scene.control=com.jfoenix --add-exports javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix -cp $SNAP/jar/SaudeFX-0.2.0.jar br.com.saudefx.App