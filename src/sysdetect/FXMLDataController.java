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
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Elvis
 */
public class FXMLDataController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    public void clickB(ActionEvent event) throws IOException {
        System.out.println("You clicked me! tela scanning");
        Stage palco = (Stage) ((Node) event.getSource()).getScene().getWindow();
        palco.close();
    }
    
    @FXML
    public void clickR(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLScanning.fxml"));
        Scene cenaPerfil = new Scene(root);
        Stage palco = (Stage) ((Node) event.getSource()).getScene().getWindow();
        palco.setScene(cenaPerfil);
    }
}
