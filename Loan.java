package Week3;

import java.util.*;
import java.sql.*;
import java.util.Date;
import java.lang.Math.*;

public class Loan {
    double monthlyPayment;
    private double annualInterestRate;
    private int numberofYears;
    private double loanamount;
    private Date loanDate;

    Date date = new Date();
    public Loan(){
        monthlyPayment = 0;
        annualInterestRate = 0;
        numberofYears = 0;
        loanamount = 0;
    }

    public Loan(double AIR, int NOY, double LA){
        annualInterestRate = AIR;
        numberofYears = NOY;
        loanamount = LA;
        loanDate = date;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public int getNumberofYears(){
        return numberofYears;

    }

    public double getLoanAmount(){
        return loanamount;

    }

    public Date getLoanDate(){
        return loanDate;
    }

    public void setAnnualInterestRate(double AIR){
        annualInterestRate = AIR;
    }

    public void setNumberofYears(int NOY){
        numberofYears = NOY;
    }

    public void setLoanamount(double LA){
        loanamount = LA;
    }

    public double getMonthlyPayment(){
        double rate , totalYears;
        totalYears = 12 * numberofYears;
        monthlyPayment = (loanamount * ((annualInterestRate/100)/12))
                /(1 - (1/ Math.pow((1 + ((annualInterestRate/100)/12)), totalYears)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalpayment;
        totalpayment = monthlyPayment * (numberofYears * 12);
        return totalpayment;
    }






}
