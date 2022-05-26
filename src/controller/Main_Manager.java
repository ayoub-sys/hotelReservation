package controller;

import User.customer;
import User.employee;
import dbModel.dbCustomer;
import dbModel.dbEmployee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Main;

import javax.xml.ws.BindingType;
import java.io.IOException;

public class Main_Manager {
    @FXML
    Button employe;
    @FXML
    Button client;
    @FXML
    Button reservation;
    @FXML
    Button chambre;
    @FXML
    Button typechambre;
    @FXML
    Button roles;
    @FXML
    Button services;
    @FXML
    Button facture;
    @FXML
    Button logout;
    @FXML
    Button serviceChambre;
    public void initialize(){
        facture.setOnAction(e->{
            try {
                Parent  root = FXMLLoader.load(getClass().getResource("../view/InvoiceDetails.fxml"));

                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        serviceChambre.setOnAction(e->
                {
                    try {
                        Parent  root = FXMLLoader.load(getClass().getResource("../view/RoomService.fxml"));

                        Main.st.close();
                        Main.st.setScene( new Scene(root));
                        Main.st.show();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                );
        services.setOnAction(e->{
            try {
              Parent  root = FXMLLoader.load(getClass().getResource("../view/services.fxml"));
                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        typechambre.setOnAction(e->{
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("../view/roomType.fxml"));
                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        chambre.setOnAction(e->{
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../view/rooms.fxml"));
                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        roles.setOnAction(e->{
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../view/roles.fxml"));
                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        client.setOnAction(e->{
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../view/review_customer.fxml"));
                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        employe.setOnAction(e->{
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../view/review_employee.fxml"));
                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        });
        reservation.setOnAction(e->
                {
                    try {
                        Parent root = FXMLLoader.load(getClass().getResource("../view/review_res.fxml"));
                        Main.st.close();
                        Main.st.setScene( new Scene(root));
                        Main.st.show();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                );
        logout.setOnAction(e->{
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../view/MainPage.fxml"));
                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
