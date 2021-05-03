package hu.unideb.inf.model;


import java.time.LocalDate;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String fuel;
    private Boolean isAvailable;
    private LocalDate dateOfPickup;
    private LocalDate dateOfParked;
    private String placeOfPickup;
    private String placeOfParked;
    private int countOfPerson;
    private int countOfDoors;
    private LocalDate dateOfManufacture;
    private String gearShitf;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public LocalDate getDateOfPickup() {
        return dateOfPickup;
    }

    public void setDateOfPickup(LocalDate dateOfPickup) {
        this.dateOfPickup = dateOfPickup;
    }

    public LocalDate getDateOfParked() {
        return dateOfParked;
    }

    public void setDateOfParked(LocalDate dateOfParked) {
        this.dateOfParked = dateOfParked;
    }

    public String getPlaceOfPickup() {
        return placeOfPickup;
    }

    public void setPlaceOfPickup(String placeOfPickup) {
        this.placeOfPickup = placeOfPickup;
    }

    public String getPlaceOfParked() {
        return placeOfParked;
    }

    public void setPlaceOfParked(String placeOfParked) {
        this.placeOfParked = placeOfParked;
    }

    public int getCountOfPerson() {
        return countOfPerson;
    }

    public void setCountOfPerson(int countOfPerson) {
        this.countOfPerson = countOfPerson;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getGearShitf() {
        return gearShitf;
    }

    public void setGearShitf(String gearShitf) {
        this.gearShitf = gearShitf;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(){

    }
    public Car(int id, String brand, String model, String fuel, Boolean isAvailable, LocalDate dateOfPickup, LocalDate dateOfParked, String placeOfPickup, String placeOfParked, int countOfPerson, int countOfDoors, LocalDate dateOfManufacture, String gearShitf, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.isAvailable = isAvailable;
        this.dateOfPickup = dateOfPickup;
        this.dateOfParked = dateOfParked;
        this.placeOfPickup = placeOfPickup;
        this.placeOfParked = placeOfParked;
        this.countOfPerson = countOfPerson;
        this.countOfDoors = countOfDoors;
        this.dateOfManufacture = dateOfManufacture;
        this.gearShitf = gearShitf;
        this.price = price;
    }
}
