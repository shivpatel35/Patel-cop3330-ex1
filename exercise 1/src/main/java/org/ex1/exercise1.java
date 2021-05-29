package org.ex1;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //Scanner Declaration
        Scanner name = new Scanner(System.in);

        //Asks for users name
        System.out.println("What is your name? ");

        //String declaration for input
        String str;

        //takes in user input and outputs into statement
        str = name.next();
        System.out.print("Hello, "+str);
        System.out.print(", nice to meet you!");

    }

}
