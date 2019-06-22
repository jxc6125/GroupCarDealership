package Dealership;
import java.util.Scanner;
import java.util.ArrayList;
public class SalesLead {
    private String SalesLeadName;
    private String SalesLeadPhoneNumber;
    private int SalesLeadId;
    private static int SLcount = 1;

    private int CarModelId;
    private String CarModelItem;
    public static int SlCount = 1;

    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args){


        int CarChoice;

        Main main = new Main();
        final char EXIT_CODE = 'E';
        final char New_SLead = 'S';
        final char SLead_List = 'P';
        final char Car_Choice = 'C';

        char userAction;

        final String PROMPT_ACTION = "Add 'S'ales Lead, 'P'rint Sales Lead List, 'C'ar Choice, or 'E'xit: ";

        ArrayList<SalesLead> SLlist = new ArrayList();


        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE){
            switch (userAction){
                case New_SLead:
                    SalesLead sl = SalesLead.addSalesLead(SLlist);
                    if (sl.getSalesLeadId() < SLlist.size()) {
                        SLlist.remove(sl.getSalesLeadId());
                    }
                    SLlist.add(SalesLead.addSalesLead(SLlist));


                    break;
                case SLead_List:
                    printSalesLead(SLlist);
                    break;
                case Car_Choice:
                    System.out.println("If you almost purchased a car, please select the number corresponding to that vehicle\n 1. Pilot\n 2. Passport\n 3. CR-V\n 4. HR-V\n 5. Civic\n 6. Accord\n 7. Fit\n 8. Ferrari 488\n");
                    CarChoice = scnr.nextInt();
                    if(CarChoice == 1)
                    {
                        printSalesLead(SLlist);
                        System.out.println("Vehicle being looked at: Honda Pilot");
                    }
                    else if(CarChoice == 2){
                        printSalesLead(SLlist);
                        System.out.println("Vehicle being looked at: Honda Passport");
                    }
                    else if(CarChoice == 3){
                        printSalesLead(SLlist);
                        System.out.println("Vehicle being looked at: Honda CR-V");
                    }
                    else if(CarChoice == 4){
                        printSalesLead(SLlist);
                        System.out.println("Vehicle being looked at: Honda HR-V");
                    }
                    else if(CarChoice == 5){
                        printSalesLead(SLlist);
                        System.out.println("Vehicle being looked at: Honda Civic");
                    }
                    else if(CarChoice == 6){
                        printSalesLead(SLlist);
                        System.out.println("Vehicle being looked at: Honda Accord");
                    }
                    else if(CarChoice == 7){
                        printSalesLead(SLlist);
                        System.out.println("Vehicle being looked at: Honda Fit");
                    }
                    else if(CarChoice == 8){
                        printSalesLead(SLlist);
                        System.out.println("Vehicle being looked at: Ferrari 488");
                    }

                    break;
            }
            userAction = getAction(PROMPT_ACTION);
        }

    }
    public SalesLead(int SalesLeadId){
        this.SalesLeadId = SalesLeadId;
    }
    public static char getAction(String prompt) {
        //removed scanner object from here
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }
    public static SalesLead addSalesLead(ArrayList<SalesLead> SLlist) {
        SalesLead SL = null;

        {
            SL = new SalesLead(SLcount++);
            //removed scanner object from here
            System.out.println("Please Enter your Name: ");
            SL.setSalesLeadName(scnr.nextLine());
            System.out.println("Please Enter your Phone: ");
            SL.setSalesLeadPhoneNumber(scnr.nextLine());
        }
        return SL;
    }
    // Setters and Getters
    public int getSalesLeadId() {
        return SalesLeadId; }
    public void setSalesLeadId(int _SalesLeadId) {
        this.SalesLeadId = _SalesLeadId;}

    public String getSalesLeadName() {
        return SalesLeadName; }
    public void setSalesLeadName(String _SalesLeadName) {
        this.SalesLeadName = _SalesLeadName;}

    public String getSalesLeadPhoneNumber() {
        return SalesLeadPhoneNumber; }
    public void setSalesLeadPhoneNumber(String _SalesLeadPhoneNumber) {
        this.SalesLeadPhoneNumber = _SalesLeadPhoneNumber;}


    public static void printSalesLead(ArrayList<SalesLead> SLlist){
        for (SalesLead SL: SLlist){
            System.out.println("Sales Lead Id:" + SL.getSalesLeadId());
            System.out.println("Sales Lead Name:" + SL.getSalesLeadName());
            System.out.println("Sales Lead Phone Number:" + SL.getSalesLeadPhoneNumber());
        }
    }
}
