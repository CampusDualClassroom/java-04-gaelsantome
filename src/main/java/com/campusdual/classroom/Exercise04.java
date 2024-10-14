package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        int resultado = sumNum(5);
        System.out.println("Suma de los primeros 5 números : " +resultado);
        int resultado1 = sumEvenNum(20);
        System.out.println("Suma de los primeros 20 números : " +resultado1);
        int resultado2 = factorial(7);
        System.out.println("Obtén el factorial del número 7 → (7!): " +resultado2);
        int resultado3 = recursiveFactorial(7);
        System.out.println("Obtén el factorial del número 7 → (7!): " +resultado3);
        //System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        //System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        //System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
       // System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
       // System.out.println("######################################################################");
       // System.out.println("Ejemplos de cálculos CON estructuras de control:");
       // System.out.println();
    }

    public static int sumNum(int i) {

       int sum = 0;
       for (i = 1; i <=5; i++){
           sum +=i;
       }
        return sum;
    }

    public static int sumEvenNum(int n) {
        int sum = 0;
        int num =2;
        for (int i = 1; i<= n;i++) {
            sum += num;
            num+=2;
        }

        return sum;
    }

    public static int factorial(int num) {

        int fact = 1 ;


        for (int i = 1; i <= num; i++) {
            fact *= i;
        }


        return fact;
    }

    public static int recursiveFactorial(int num) {
        if (num==0  || num == 1) {
            return 1;
        } else {
            return num* recursiveFactorial(num - 1);
        }



    }
}
