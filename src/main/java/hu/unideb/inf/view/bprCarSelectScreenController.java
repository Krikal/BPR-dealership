package hu.unideb.inf.view;

import hu.unideb.inf.model.Car;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


import java.awt.*;
import java.io.IOException;
import java.net.URL;
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


    private ArrayList<Car> cars(){
        ArrayList<Car> cs = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            Car car = new Car();
            car.setBrand("Audi");
            car.setAvailable(true);
            car.setModel("A8");
            car.setDateOfManufacture(LocalDate.of(2020,11,12));
            car.setGearShitf("Váltó");
            car.setFuel("benzin");
            car.setCountOfDoors(5);
            car.setPrice(20000);

            cs.add(car);
        }
        System.out.println("megjön?");

        return cs;


    }




    public void transferData(LocalDate startDate, LocalDate endDate, ObservableList places, Object selectedPlace){
        startOfLeasingDatePicker.setValue(startDate);
        endOfLeasingDatePicker.setValue(endDate);
        locationOfParkedCars.setItems(places);
        locationOfParkedCars.setValue(selectedPlace);


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cars = cars();
        System.out.println(cars.toString());
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
