package com.mycompany.mothibeli;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {
    
    @FXML
    private Button derease;

    @FXML
    private Button irease;

    @FXML
    private Label label;

    @FXML
    private ProgressBar progress;
    double progresse;

    @FXML
    void derease(ActionEvent event) {
        
        progress.setStyle("-fx-accent: red");
        progresse -=0.01;
        progress.setProgress(progresse);
        label.setText(Double.toString(progresse*100));


    }

    @FXML
    void irease(ActionEvent event) {
        progress.setStyle("-fx-accent: green");
        progresse +=0.01;
        progress.setProgress(progresse);
        label.setText(Double.toString(progresse*100));

    }


    }


  
