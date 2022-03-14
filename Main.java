package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Create a scanner class object to take input from the user
        Scanner sc= new Scanner(System.in);

        int a= Integer.parseInt(sc.nextLine());
        int b= Integer.parseInt(sc.nextLine());
        int c= Integer.parseInt(sc.nextLine());
//prompt the user to enter a valid String.
        Increment obj = new Increment();
        obj.incre(a,b,c);
//call the removeVowels method by creating an object of StringManipulator class.
//print the result
    }
}
