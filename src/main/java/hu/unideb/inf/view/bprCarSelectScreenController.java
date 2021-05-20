package hu.unideb.inf.view;


import hu.unideb.inf.DBConnection.DatabaseConn;
import hu.unideb.inf.model.Car;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class bprCarSelectScreenController implements Initializable {

    @FXML
    DatePicker startOfLeasingDatePicker;

    @FXML
    DatePicker endOfLeasingDatePicker;

    @FXML
    ComboBox locationOfParkedCars;

    @FXML
    GridPane carsGrid;

    private List<Car> cars;


    private ArrayList<Car> cars() throws Exception{
        DatabaseConn databaseConn = new DatabaseConn();
        Connection connection = databaseConn.getConnection();
        ArrayList<Car> cs = new ArrayList<>();


        try {
            String query = "SELECT * FROM car WHERE placeOfParked='" + locationOfParkedCars.getValue().toString() + "' AND dateOfParked < '"+ startOfLeasingDatePicker.getValue().toString() +"'";
            Statement statement = connection.createStatement();
            ResultSet qResult = statement.executeQuery(query);;


            Car car = new Car(); // üres car model



            while (qResult.next()){
                car = new Car(); //nullázás
                //adatok feltöltése
                car.setId(Integer.parseInt(qResult.getString(1)));
                car.setBrand(qResult.getString(2));
                car.setModel(qResult.getString(3));
                car.setFuel(qResult.getString(4));
                car.setAvailable(Boolean.parseBoolean(qResult.getString(5)));
                car.setDateOfPickup(LocalDate.parse(qResult.getString(6)));
                car.setDateOfParked(LocalDate.parse(qResult.getString(7)));
                car.setPlaceOfPickup(qResult.getString(8));
                car.setPlaceOfParked(qResult.getString(9));
                car.setCountOfPerson(Integer.parseInt(qResult.getString(10)));
                car.setCountOfDoors(Integer.parseInt(qResult.getString(11)));
                car.setDateOfManufacture(LocalDate.parse(qResult.getString(12)));
                car.setGearShitf(qResult.getString(13));
                car.setPrice(Integer.parseInt(qResult.getString(14)));
                car.setAirCondition(Integer.parseInt(qResult.getString(15)));
                //

                cs.add(car);
            }


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return cs;

    }




    public void transferData(LocalDate startDate, LocalDate endDate, ObservableList places, Object selectedPlace){
        startOfLeasingDatePicker.setValue(startDate);
        System.out.println(startOfLeasingDatePicker.getValue().toString());
        endOfLeasingDatePicker.setValue(endDate);
        locationOfParkedCars.setItems(places);
        locationOfParkedCars.setValue(selectedPlace);


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    public void listCars(ActionEvent actionEvent) {

        carsGrid.getChildren().clear();
        try {
            cars = cars();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(cars.toString());
        int colums = 0;
        int rows = 1;
        try{
            for (int i = 0; i < cars.size(); i++){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/bpr_dealership_car_select_item.fxml"));


                AnchorPane box =  fxmlLoader.load();
                bprCarSelectItemController itemController = fxmlLoader.getController();
                itemController.setData(cars.get(i));

                if (colums == 1){
                    rows++;
                    colums = 0;
                }
                carsGrid.add(box, colums++, rows);

            }


        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
