/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysdetect;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Elvis
 */
public class FXMLScanningController implements Initializable {
    
    @FXML
    private Label labelzada;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        
       
            
        
    }

    @FXML
    public void clickB(Event event) throws IOException, InterruptedException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLData.fxml"));
        Scene cenaPerfil = new Scene(root);
        Stage palco = (Stage) ((Node) event.getSource()).getScene().getWindow();
        palco.setScene(cenaPerfil);
    }
    
   
}
