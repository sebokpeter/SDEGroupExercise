/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdegroupexercise.GUI.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import sdegroupexercise.GUI.Model.Model;
import sdegroupexercise.GUI.Model.ModelException;

/**
 *
 * @author sebok
 */
public class MainWindowController implements Initializable
{
    @FXML
    private TextArea txtAreaJoke;
    
    private Model model = new Model();
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    private void btnClickGetJoke(ActionEvent event)
    {
        try
        {
            txtAreaJoke.setText(model.getJoke());
        } 
        catch (ModelException ex)
        {
            Alert a = new Alert(Alert.AlertType.ERROR, "An error occured: " + ex.getMessage(), ButtonType.OK);
            a.show();
        }
    }

    @FXML
    private void btnClickSaveToDB(ActionEvent event)
    {
    }
    
}
