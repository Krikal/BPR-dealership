package hu.unideb.inf.view;



import hu.unideb.inf.DBConnection.DatabaseConn;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;



import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.*;


public class bprController implements Initializable {



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





    private void getDateValues(){
        LocalDate startDate = datePickerOfStart.getValue();
        LocalDate endDate = datePickerOfEnd.getValue();
        String pickupPlace = comboBoxOfPlaces.getValue().toString();
        if (startDate.isAfter(endDate)){
            startOfRental.setStyle("-fx-text-inner-color: red;"); // nem megy
            System.out.printf("Helytelen időpont!");
        }


        System.out.println(startDate + " --- " + endDate + " --- " + pickupPlace);


    }
    public void confirmButton() {
        //System.out.println(model.getCar().toString());
        getDateValues();


    }

    private ArrayList<String> getData() throws Exception{
        DatabaseConn dbconn = new DatabaseConn();
        Connection connection = dbconn.getConnection();
        ArrayList<String> places = new ArrayList<String>();
        try {
            Statement statement = connection.createStatement();
            ResultSet qResult = statement.executeQuery("SELECT * FROM bpr.car");

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


       //comboBoxOfPlaces.getItems().addAll("valami","gyere rám", "WOW", "csicska Geci Mindenki!");
    }
}
