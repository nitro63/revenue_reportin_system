package com.ekow_nyenku.revenue_reportin_system.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class LoginController implements Initializable {
    public JFXTextField txtUsername;
    public AnchorPane paneLogIn;
    public JFXPasswordField txtPassword;
    public JFXCheckBox chkPasswordMask;
    public JFXButton btnLogIn;
    public JFXTextField txtPasswordShown;
    public AnchorPane topPane;
    public Label lblWarnUsername;
    public Label lblWarnPassword;
    public JFXCheckBox chkSaveCredentials;
    public Label warnlabel;
    public JFXButton btnConnectionConfiguration;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (warnlabel.isVisible()){
            btnLogIn.setOnMouseClicked(e -> warnlabel.setVisible(false));}
        txtPasswordShown.setVisible(false);
        txtUsername.setOnMouseClicked(event -> lblWarnUsername.setVisible(false));
        txtPasswordShown.setOnMouseClicked(event -> lblWarnPassword.setVisible(false));
        txtPassword.setOnMouseClicked(event -> lblWarnPassword.setVisible(false));
    }
    @FXML
    void chkPasswordMaskAction(ActionEvent event) {

    }

    @FXML
    void ctrlLogInCheck(ActionEvent event) {

    }

    @FXML
    void onEnterKey(KeyEvent event) {

    }

    @FXML
    void showConnectionConfiguration(ActionEvent event) {

    }

}
