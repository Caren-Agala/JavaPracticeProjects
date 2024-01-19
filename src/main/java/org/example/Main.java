/*INVESTMENT EARNING CALC
* enter buying price per share
* enter closing price on subsequent days
* calculate aggregate earnings/ losses after each day
* leave program when closing price is negative*/
package org.example;
import java.util.Scanner;
import java.text.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price:");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice;
        DecimalFormat df = new DecimalFormat("0.00");

        while (true){
            System.out.println("Enter the closing price for the day: " + day
             + ". Any negative value exits the program.");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            if (earnings > 0.0){
                System.out.println("After day: " + day + 
                        ", you earned: " + df.format(earnings) + " per share.");
            } else if (earnings < 0.0) {
                System.out.println("After day: " + day +
                        ", you lost: " + df.format(-earnings) + " per share.");
            }
            else{
                System.out.println("After day: " + day +
                        ", you earned no  earnings per share.");
            }
            day += 1;

        }
        scan.close();

    }
}