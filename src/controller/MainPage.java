package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import sample.Main;

import java.io.IOException;
import java.util.Objects;

public class MainPage {
    @FXML
    Button administrateur;
    @FXML
    Button receptioniste;
    @FXML
    Button client;
    public void initialize(){

        administrateur.setOnAction(e->{
            Parent root = null;
            try {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/manager_login.fxml")));
                Main.st.close();
                Main.st.setScene(new Scene(root));
                Main.st.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        });
        receptioniste.setOnAction(e->{
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("../view/employee_login.fxml"));
                Main.st.close();
                Main.st.setScene(new Scene(root));
                Main.st.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        client.setOnAction(e->{
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("../view/customer_login.fxml"));
                Main.st.close();
                Main.st.setScene(new Scene(root));
                Main.st.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
