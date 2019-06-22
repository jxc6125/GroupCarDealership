package Dealership;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> iList = new ArrayList<>();
        ArrayList<CarDealerships> cList = new ArrayList<>();
        ArrayList<CarDealerships> eList = new ArrayList<>();

        CarDealerships carDealerships1 = new CarDealerships("A1111", "StateCollege,PA", "John Doe",
                "Honda", "SUV");
        CarDealerships carDealerships2 = new CarDealerships("A1111", 10, 100000, 50000);


        cList.add(carDealerships1);
        eList.add(carDealerships2);


        Scanner in = new Scanner(System.in);

        //accessor's info
        System.out.println("Are you a 'C'ustomer, or a 'E'mployee or 'I'nventory: ");
        String input = in.nextLine();

        //print out results
        if (input.equals("C")) {
            CarDealerships.printForCustomer(cList);
        } else if (input.equals("E")) {
            CarDealerships.printForEmployee(eList);
        }else if (input.equals("I")){
            Car.listCars(iList);
        } else {
            System.out.println("Invalid input");
        }






                Car car1 = new Car(1, "Honda","Pilot",2014,"Orange",28000.00,
                        22, 30000);
                Car car2 = new Car(2,"Honda","Fit",2012,"Red",18000.00,32,
                        5000);
                Car car3 = new Car(3,"Honda","CRV",2013,"Green",20000.00,25,
                        7000);
                Car car4 = new Car(4,"Honda","Civic",2014,"Blue",18000.00,28,
                        1000);

                iList.add(car1);
                iList.add(car2);
                iList.add(car3);
                iList.add(car4);


            }
        }



