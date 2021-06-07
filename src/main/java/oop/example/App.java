package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String first, sec;
        System.out.print("What is the first number? ");
        first = input.nextLine();
        System.out.print("What is the second number? ");
        sec = input.nextLine();
        int x = Integer.parseInt(first);
        int y = Integer.parseInt(sec);
        System.out.printf("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d", x, y, (x+y), x, y, (x-y), x, y,( x*y), x, y, (x/y));

    }//end main method
}//end classB