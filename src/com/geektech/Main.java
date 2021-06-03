package com.geektech;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String name ="Isken";
        int temp = 25;
        int age = 14;
        if ((age >= 20 && age > 45) && temp < +30 && temp > -20
                && temp > 0 && temp < 28) {
            System.out.println(name + " Можно идти гулять");
        }else if  (age < 20 && temp > 0 && temp < 28) {
            System.out.println(name + ", Можно гулять");
            if (age < 45 && temp > -10 && temp < 25){
                System.out.println(name + " То можно гулять");
            }


        }


    }

//    public static int  generateRandomAge(){}{
//
//        Random chislo = new Random();
//
//    }



}
