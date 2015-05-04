package ch.hsluw.mangelmanager.client.intern.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ch.hsluw.mangelmanager.client.intern.ClientRMI;
import ch.hsluw.mangelmanager.client.intern.Main;
import ch.hsluw.mangelmanager.model.Projekt;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

/**
 * The ProjektDetailController handles all interaction with projects * 
 * 
 * @author sritz
 * @version 1.0
 *
 */

public class ProjektDetailController implements Initializable {
	//RMI Client to interact
	ClientRMI client = null;
	Projekt projekt = null;
	
	@FXML
	public BorderPane rootLayout;
	
	@FXML
	public TextField txtProjektId;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		
	}


	public void init(int projektId) {
		// TODO Auto-generated method stub
		System.out.println("in Init: Projekt ID: " + projektId);
		projekt = client.getProjektById(projektId);
		//txtProjektId.setText(projekt.getId().toString());
		
		
	}
	
		
	

}
