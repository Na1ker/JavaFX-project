package org.example.uzash;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;


public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add;
    @FXML
    private Button delete;

    @FXML
    private TableView<users> table;
    @FXML
    private TableColumn<users, String> markaOfCarBD;
    @FXML
    private TableColumn<users, String> modelOfCarBd;
    @FXML
    private TableColumn<users, String> costOfCarBd;
    @FXML
    private TableColumn<users, String> yearOfCarBd;

    @FXML
    private TextField costOfCar;
    @FXML
    private TextField markaOfCar;
    @FXML
    private TextField modelOfCar;
    @FXML
    private TextField yearOfCar;



    @FXML
    void initialize() {

        markaOfCarBD.setCellValueFactory(new PropertyValueFactory<users, String>("marka"));
        modelOfCarBd.setCellValueFactory(new PropertyValueFactory<users, String>("name"));
        costOfCarBd.setCellValueFactory(new PropertyValueFactory<users, String>("cost"));
        yearOfCarBd.setCellValueFactory(new PropertyValueFactory<users, String>("year"));


        //Дейсвтия для кнопки add
        add.setOnAction(event -> {
            users users = new users(markaOfCar.getText(),modelOfCar.getText(),costOfCar.getText(),yearOfCar.getText());
            ObservableList<users> list = table.getItems();
            list.add(users);
            table.setItems(list);
        });

        //Дейсвтия для кнопки delete
        delete.setOnAction(event -> {
            int markaCar = table.getSelectionModel().getSelectedIndex();
            table.getItems().remove(markaCar);
        });

    }

}
