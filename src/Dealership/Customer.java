package Dealership;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String customerName;
    private String customerPhoneNumber;
    private String customerCreditCardNumber;

    //Constructor Method
    public Customer(int _customerId) {
        this.customerId = _customerId;  //Increments the ID count
    }

    //Customer ID
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int _customerId) {
        this.customerId = _customerId;
    }
    // Customer Name
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String _customerName) {
        this.customerName = _customerName;
    }
    // Customer Phone number
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String _customerPhoneNumber) {
        this.customerPhoneNumber = _customerPhoneNumber;
    }
    // Customer Credit Card number
    public String getCustomerCreditCardNumber() {
        return customerCreditCardNumber;
    }
    public void setCustomerCreditCardNumber(String _customerCreditCardNumber) {
        this.customerPhoneNumber = _customerCreditCardNumber;
    }

    public static void printCustomer(ArrayList<Customer> cList) {
        for (Customer cust : cList) {
            System.out.println("Customer Id:" + cust.getCustomerId());
            System.out.println("Customer Name:" + cust.getCustomerName());
            System.out.println("Customer Phone:" + cust.getCustomerPhoneNumber());
            System.out.println("Customer Credit Card Number: " + cust.getCustomerCreditCardNumber());
        }
    }
}
