package hu.unideb.inf.view;

import hu.unideb.inf.model.Car;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
    @FXML
    private Button carId;


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

        carId.setId(String.valueOf(car.getId()));
    }

    public void learnMore(ActionEvent actionEvent) {
        System.out.println(carId.getId());
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/bpr_dealership_car_deatails_screen.fxml"));
            Scene scene = new Scene(loader.load());
            bprDealershipCarDeatailsScreenController controller = loader.getController();
            //controller.transferData(carId.getId());
            controller.setId(Integer.parseInt(carId.getId()) );
            controller.mysqlCall();

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Car details");
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void setData(MouseEvent mouseEvent) {

    }
}
