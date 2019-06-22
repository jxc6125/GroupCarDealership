package Dealership;
import java.util.Scanner;

public class SalesmenMain{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = in.next();
        System.out.print("Enter last name: ");
        String last = in.next();
        System.out.print("Enter company name: ");
        String company = in.next();
        System.out.print("Enter pay rate: ");
        double payRate = in.nextDouble();
        System.out.print("Enter rank: ");
        double rank = in.nextDouble();

        System.out.println("Name: " + first + " " + last);
        System.out.println("Company: " + company);
        System.out.println("Pay rate: " + payRate);
        System.out.println("Rank: " + rank);
    }
}