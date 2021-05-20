package hu.unideb.inf.view;

import hu.unideb.inf.model.Car;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

public class bprCarSelectItemController {

    @FXML
    private Label brand;
    @FXML
    private Label model;
    @FXML
    private Label yearOfManufacture;
    @FXML
    private Label countOfPeople;
    @FXML
    private Label shitfGear;
    @FXML
    private Label fuel;
    @FXML
    private Label countOfDoors;
    @FXML
    private Label airCondition;
    @FXML
    private Label price;


    public void setData(Car car){
        brand.setText(car.getBrand());
        model.setText(car.getModel());
        yearOfManufacture.setText(car.getDateOfManufacture().toString());
        countOfPeople.setText(String.valueOf(car.getCountOfPerson()));

        shitfGear.setText(car.getGearShitf());
        fuel.setText(car.getFuel());
        countOfDoors.setText(String.valueOf(car.getCountOfDoors()));

        if (car.getAirCondition() == 1){
            airCondition.setText("Van");
        }else{
            airCondition.setText("Nincs");
        }

        price.setText(String.valueOf(car.getPrice()));
    }

}
