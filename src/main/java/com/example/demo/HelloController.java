package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    ImageView myImageView;
    Image myImage = new Image(getClass().getResourceAsStream("1276993.jpg"));

}