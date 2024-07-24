package com.exception.java;

import java.util.Scanner;

public class ExampleException {

    // here we create String name for null exception
    public static String name;

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("enter the first value:");
        int value = scanner.nextInt();
        System.out.println("enter the second  value:");
        int value2 = scanner.nextInt();
        try {


            /*
            when evere we declare value 2 is "0" it gives arithematic exception
            and we handle the exception by using try catchj block
             */
            int result = value / value2;
            /*
            here we create anothe exception for Array bound
             */
            int arry[] = {1, 2, 3};
            System.out.println(name.equalsIgnoreCase("vasu naaidu"));
            System.out.println("the array was:" + arry[1]);
            System.out.println("the result :" + result);
//        } catch (ArithmeticException a) {
//            System.out.println("here the exception is handled ");
//            valid();
//        } catch (ArrayIndexOutOfBoundsException A) {
//            System.out.println("this is an array bounds Exception");
//            valid();
//        } catch (NullPointerException E) {
//            System.out.println("this is a null point exception handling");
            /*
            this Exception is a parent for all other exception
            so it calls all the exceptions or stores
             */
        } catch (Exception e) {
            System.out.println("this exception block for any exception");
            valid();
            // this method declares or shows which exception had occur
            e.printStackTrace();
            // this method shows the can not invoke "String"
            System.out.println(e.getMessage());
        }
        System.out.println("exception handling");
    }

    // normal method for method calling
    private static void valid() {
        System.out.println("this is a method calling");
    }
}
