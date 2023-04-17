/*

1.- Write a program that reads an initial investment balance and and annual interest rate, then prints the number of years it takes for the investment to reach one million dollars.

*/

class Investment {

    private double balance;
    private double rate;
    private int year;

    public Investment(double aBalance, double aRate) {
        balance = aBalance;
        rate = aRate;
        year = 0;
    }

    public int waitForBalance(double targetBalance) {
        while (balance < targetBalance) {
            year++;
            double interest = balance * rate / 100;
            balance += interest;
        }
        return year;
    }

}


public class InvestmentRunner {
    public static void main(String[] args)  {

        double INVESTMENT = 1234;
        double RATE = 10;
        double TARGET = 1000000;
        Investment oneMillion = new Investment(INVESTMENT, RATE);
        System.out.println(oneMillion.waitForBalance(TARGET));
        System.exit(0);

    }

}
