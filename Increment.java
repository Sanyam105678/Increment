package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Increment {
    public void incre(int a, int b, int c)
    {
        if(c>0 && a<b) {
            for(int i=a;i<=b;i+=c) {
                System.out.print(i+" ");

            }
        }
        else
            System.out.println("Error");


    }
//write the logic to remove all the vowels from the supplied input string
//and return that string
//if somebody calls this method with a null value then return the null


}
