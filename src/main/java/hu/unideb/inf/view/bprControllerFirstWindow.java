package hu.unideb.inf.view;



import hu.unideb.inf.DBConnection.DatabaseConn;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.*;


public class bprControllerFirstWindow  implements Initializable  {



    @FXML
    private Label startOfRental;

    @FXML
    private Label endOfRental;

    @FXML
    private Label placeOfTakeover;

    @FXML
    private DatePicker datePickerOfStart;

    @FXML
    private DatePicker datePickerOfEnd;

    @FXML
    private ComboBox comboBoxOfPlaces;





    private int getDateValues(){
        LocalDate startDate = datePickerOfStart.getValue();
        LocalDate endDate = datePickerOfEnd.getValue();
        String pickupPlace = comboBoxOfPlaces.getValue().toString();
        if (startDate.isAfter(endDate)){
            startOfRental.setStyle("-fx-text-inner-color: red;"); // nem megy
            System.out.printf("Helytelen időpont!");
            return -10;
        }

        System.out.println(startDate + " --- " + endDate + " --- " + pickupPlace);
        return 1;

    }
    public int confirmButton(ActionEvent event) {
        //System.out.println(model.getCar().toString());
        int result = getDateValues();

        if (result == -10){
            datePickerOfStart.setValue(null);
            datePickerOfEnd.setValue(null);
            comboBoxOfPlaces.setValue(null);
            return -10;
        }

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/bpr_dealership_car_select_screen.fxml"));
            Scene scene = new Scene(loader.load());
            bprCarSelectScreenController scene2Controller = loader.getController();
            scene2Controller.transferData(datePickerOfStart.getValue(), datePickerOfEnd.getValue(), comboBoxOfPlaces.getItems(), comboBoxOfPlaces.getValue());

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("List of cars");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return 1;

    }

    private ArrayList<String> getData() throws Exception{
        DatabaseConn dbconn = new DatabaseConn();
        Connection connection = dbconn.getConnection();
        ArrayList<String> places = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet qResult = statement.executeQuery("SELECT DISTINCT placeOfParked FROM car");

            while (qResult.next()){
                //System.out.printf(qResult.getString(2));
                //System.out.println(qResult.getString("placeOfParked"));
                places.add(qResult.getString("placeOfParked"));

            }
            return places;


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return places;

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)  {
        try {
            comboBoxOfPlaces.getItems().addAll(getData());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
