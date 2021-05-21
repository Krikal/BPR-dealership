package hu.unideb.inf.view;

import hu.unideb.inf.DBConnection.DatabaseConn;
import hu.unideb.inf.model.Car;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class bprDealershipCarDeatailsScreenController  implements Initializable {


    @FXML
    private GridPane carGrid;

    private int id;

    public void setId(int id) {
        this.id = id;
    }
    private Car car = null; // üres car model

    public void transferData(String id) {
        this.id = Integer.parseInt(id);
    }

    public void mysqlCall(){
        DatabaseConn databaseConn = new DatabaseConn();
        Connection connection = databaseConn.getConnection();
        System.out.println(id);
        System.out.println("!!----gyereeee");

        try {
            String query = "SELECT * FROM car WHERE id = " + id;
            Statement statement = connection.createStatement();
            ResultSet qResult = statement.executeQuery(query);;

            car = new Car(); //nullázás
            //adatok feltöltése
            qResult.next();
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
            System.out.println(car);
            valami(car);


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }

    private void valami(Car car){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/bpr_dealership_car_select_item.fxml"));
            AnchorPane box =  fxmlLoader.load();
            bprCarSelectItemController itemController = fxmlLoader.getController();
            itemController.setData(car);
            System.out.println("valami");
            carGrid.add(box, 1, 1);

        }catch (IOException e) {
            e.printStackTrace();
        }

    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }




}
