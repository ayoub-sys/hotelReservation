package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import sample.Main;

import java.io.IOException;

public class Main_Employee {
    @FXML
    Button facture;
    @FXML
    Button serviceChambre;
    @FXML
    Button client;
    @FXML
    Button reservation;
    @FXML
    Button logout;
    public void initialize() {
        facture.setOnAction(e -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../employee_view/InvoiceDetails_emp.fxml"));

                Main.st.close();
                Main.st.setScene(new Scene(root));
                Main.st.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        serviceChambre.setOnAction(e ->
                {
                    try {
                        Parent root = FXMLLoader.load(getClass().getResource("../employee_view/RoomService_emp.fxml"));

                        Main.st.close();
                        Main.st.setScene(new Scene(root));
                        Main.st.show();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        );
        client.setOnAction(e->{
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../employee_view/cust_emp.fxml"));
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
                        Parent root = FXMLLoader.load(getClass().getResource("../employee_view/res_emp.fxml"));
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
