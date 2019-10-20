/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysdetect;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Elvis
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }

    @FXML
    public void click(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLScanning.fxml"));
        Scene cenaPerfil = new Scene(root);
        Stage palco = (Stage) ((Node) event.getSource()).getScene().getWindow();
        palco.setScene(cenaPerfil);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

}
