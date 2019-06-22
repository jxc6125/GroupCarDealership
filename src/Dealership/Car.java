package Dealership;

import java.util.ArrayList;

public class Car {

    //Class Level Variables
    private int carId;
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    private double mpg;
    private int mileage;

    //Constructor
    public Car(int _carId, String _make, String _model, int _year, String _color, double _price, double _mpg, int _mileage) {
        this.carId = _carId;
        this.make = _make;
        this.model = _model;
        this.year = _year;
        this.color = _color;
        this.price = _price;
        this.mpg = _mpg;
        this.mileage = _mileage;
    }

    //Setters and Getters
    public int getCarId() { return carId; }

    public void setCarId(int _carId) { this.carId = _carId;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String _make) {
        this.make = _make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String _model) {
        this.model = _model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int _year) { this.year = _year; }

    public String getColor() {
        return color;
    }

    public void setColor(String _color) {
        this.color = _color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double _price) {
        this.price = _price;
    }

    public double getMPG() { return mpg; }

    public void setMPG(double _mpg) {
        this.mpg = _mpg;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int _mileage) {
        this.mileage = _mileage;
    }

    public static void listCars(ArrayList<Car> cList) {
        for (Car car : cList) {
            System.out.println(car.getCarId());
        }
    }

}