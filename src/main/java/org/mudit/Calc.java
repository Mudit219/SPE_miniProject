package org.mudit;

import java.lang.Math;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calc {
    private static final Logger logger = LogManager.getLogger(Calc.class);
    public static double sqrt(double number){
        logger.info("Using square root function");
        double res = Math.sqrt(number);
//        logger.info("Final result on applying square root function " + number + " is: " + res);
        return res;
    }

    public static int factorial(int number){
        logger.info("Using factorial function" );
        int res = 1;
        for(int i=number; i>0; i--){
            res *=i;
        }
//        logger.info("Final result on applying factorial function " + number + " is: " + res);
        return res;
    }

    public static double logbase_e(double number){
        logger.info("Using logarithmic function");
        double res = Math.log(number);
//        logger.info("Final result on applying logarithmic function " + number + " is: " + res);
        return res;
    }

    public static double powerX_y(double number_x, double number_y){
        logger.info("Using power function");
        double res = Math.pow(number_x, number_y);
//        logger.info("Final result on applying power function on  : " + number_x + " of power " + number_y + " is: " + res);
        return res;
    }

    public static void main(String[] args) {
        boolean keep_run=true;
        Scanner in = new Scanner(System.in);


        while(keep_run){
            System.out.println("Welcome to Calculator program, please choose one of the following options");
            System.out.println("Option 1: Square Root of a given number");
            System.out.println("Option 2: Factorial of a given number");
            System.out.println("Option 3: Natural logarithm (base e) of a given number");
            System.out.println("Option 4: Power (X^y) of a given numbers X and y ");
            System.out.println("Option 5: Exit the calculator");

            int option = in.nextInt();
            logger.info("Option " + option);

            if(option == 1){
                System.out.println("Please enter the number");
                double number = in.nextDouble();
                System.out.println("Square root of your given number " + number + " is " + sqrt(number));
                System.out.println();
            }
            else if(option==2){
                System.out.println("Please enter the number");
                int number = in.nextInt();
                System.out.println("Factorial of your given number " + number + " is " + factorial(number));
                System.out.println();

            }
            else if(option==3){
                System.out.println("Please enter the number");
                double number = in.nextDouble();
                System.out.println("Logarithmic value (base e) of your given number " + number + " is " + logbase_e(number));
                System.out.println();

            }
            else if (option==4) {
                System.out.println("Please enter the base number");
                double number_x = in.nextDouble();
                System.out.println("Please enter the exponent number");
                double number_y = in.nextDouble();
                System.out.println("Value of " + number_x + " raised to the power of " + number_y + " is " + powerX_y(number_x, number_y));
                System.out.println();
            }
            else if(option==5){
                System.out.println("Thank you for using the calculator");
                keep_run=false;
                System.out.println();
            }
            else{
                System.out.println("Please enter a correct option!");
            }

        }


    }
}