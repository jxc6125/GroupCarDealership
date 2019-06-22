package Dealership;
import java.util.ArrayList;
import java.util.Scanner;
public class customerMain {
    private static Customer cust1;
    private static int cCount;

    public static void main(String[] args) {
        Dealership.Main main = new Dealership.Main();

        final char CUST_CODE = 'C';
        final char CUST_PRNT = 'P';
        final char EXIT_CODE = 'E';
        char userAction;

        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customer, 'E'xit Program";
        ArrayList<Customer> cList = new ArrayList<>();

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : cList.add(customerMain.addCustomer());
                    break;
                case CUST_PRNT : Customer.printCustomer(cList);
                    break;
            }
            userAction = getAction(PROMPT_ACTION);
        }
    }
    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }

    public static Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter their Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please enter their Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        System.out.println("Please enter their Credit Card Number: ");
        cust.setCustomerCreditCardNumber(scnr.nextLine());
        return cust;
    }
}