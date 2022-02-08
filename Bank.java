package Week3;

import java.util.Scanner;
import java.util.Date;

public class Bank {
    public static void main(String[] args) {

        Date date = new Date();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate for example,8.25: ");
        double InterestRate  = input.nextDouble();
        System.out.println("Enter number of years as an integer: ");
        int NumberofYears  = input.nextInt();
        System.out.println("Enter loan amount, for example, 120000.95: ");
        double LoanAmount  = input.nextDouble();

        Loan loan = new Loan(InterestRate , NumberofYears , LoanAmount);
        System.out.println("New loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + loan.getMonthlyPayment());
        System.out.println("The total payment is " + loan.getTotalPayment());



    }
    }

