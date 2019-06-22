package Dealership;

import java.util.ArrayList;

public class CarDealerships {
        public String carDealershipCode, carDealershipLocation, carDealershipEmployees,
                carDealershipSponsors, carDealershipProduct;
        private int carDealershipStorage, carDealershipRevenue, carDealershipCost;

        public CarDealerships(String _carDealershipCode, String _carDealershipLocation, String _carDealershipEmployees, String _carDealershipSponsors, String _carDealershipProduct){
                this.carDealershipCode = _carDealershipCode;
                this.carDealershipLocation = _carDealershipLocation;
                this.carDealershipEmployees = _carDealershipEmployees;
                this.carDealershipSponsors = _carDealershipSponsors;
                this.carDealershipProduct = _carDealershipProduct;
        }

        //overLoad
        public CarDealerships(String _carDealershipCode, int _carDealershipStorage, int _carDealershipRevenue, int _carDealershipCost){
                this.carDealershipCode = _carDealershipCode;
                this.carDealershipStorage = _carDealershipStorage;
                this.carDealershipRevenue = _carDealershipRevenue;
                this.carDealershipCost = _carDealershipCost;
        }

        public String getCarDealershipCode() {return carDealershipCode;}
        public void setCarDealershipCode(String _carDealershipCode){this.carDealershipCode = _carDealershipCode;}

        public String getcarDealershipLocation () {return carDealershipLocation;}
        public void setCarDealershipLocation (String _CdsL){this.carDealershipLocation =
                _CdsL;}

        public String getcarDealershipEmployees () {return carDealershipEmployees;}
        public void setCarDealershipEmployees (String _CdsE){this.carDealershipEmployees =
                _CdsE;}

        public String getcarDealershipSponsors () {return carDealershipSponsors;}
        public void setCarDealershipSponsors (String _CdsS){this.carDealershipSponsors =
                _CdsS;}

        public String getcarDealershipProduct () {return carDealershipProduct;}
        public void setCarDealershipProduct (String _CdsP){this.carDealershipProduct =
                _CdsP;}

        public int getcarDealershipStorage () {return carDealershipStorage;}
        public void setCarDealershipStorage (int _CdsSg){this.carDealershipStorage =
                _CdsSg;}

        public int getcarDealershipRevenue () {return carDealershipRevenue;}
        public void setCarDealershipRevenue (int _CdsR){this.carDealershipRevenue =
                _CdsR;}

        public int getcarDealershipCost () {return carDealershipCost;}
        public void setCarDealershipCost (int _CdsC){this.carDealershipCost= _CdsC;}

        //for customer info
        public static void printForCustomer(ArrayList<CarDealerships> cList){
                for (CarDealerships CDS: cList){
                        System.out.println("The code of this car dealership is " + CDS.getCarDealershipCode());
                        System.out.println("The location is " + CDS.getcarDealershipLocation());
                        System.out.println("The Sponsor of the store is " + CDS.getcarDealershipSponsors());
                        System.out.println("The employee is " + CDS.getcarDealershipEmployees());
                        System.out.println("The carrying product is " + CDS.getcarDealershipProduct());
                }
        }

        public static void printForEmployee(ArrayList<CarDealerships> eList){
                for (CarDealerships CDS1: eList){
                        System.out.println("The code of this car dealership is " + CDS1.getCarDealershipCode());
                        System.out.println("The Storage for right now is " + CDS1.getcarDealershipStorage());
                        System.out.println("The revenue is for this month " + CDS1.getcarDealershipRevenue());
                        System.out.println("The cost of the store is total " + CDS1.getcarDealershipCost());
                }
        }
}

