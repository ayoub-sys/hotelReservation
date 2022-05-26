package controller;

import dbModel.dbCustomer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import sample.Main;
import User.*;
import java.io.IOException;


public class add_customer {
    @FXML
    TextField prenom;
    @FXML
    TextField nom;
    @FXML
    TextField sexe;
    @FXML
    TextField ville;
    @FXML
    TextField telephone;
    @FXML
    TextField username;
    @FXML
    TextField password;
    @FXML
    Button ajouter;
    @FXML
    Button retour;
    dbCustomer dbc = new dbCustomer();
    public void initialize(){
        ajouter.setOnAction(e->
        {
         manager mg = new manager();
         dbc.addCustomer(prenom.getText(),nom.getText(),ville.getText(),sexe.getText(),telephone.getText());
         customer current = new customer();
         current.assignData(prenom.getText(),nom.getText(),ville.getText(),sexe.getText(),telephone.getText());
         mg.addCustomer(current);
         Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
         alert.setContentText(prenom.getText() + "is added SUCCESFULLY");
        alert.show();
        });
        retour.setOnAction(e->{
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../view/review_customer.fxml"));
                Main.st.close();
                Main.st.setScene( new Scene(root));
                Main.st.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        });
    }
}
