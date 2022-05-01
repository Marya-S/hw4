package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\r\n");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.print("\r\n");
        System.out.println("*****Задание 2******");

        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница," + friday + " число. Необходимо подготовить отчет.");
            friday += 7;
        }

        System.out.println("*****Задание 3******");
        int start = 2022 - 200;
        int finish = 2022 + 100;
        int k = 0;
        while (k <= finish) {
            if (k >= start) {
                System.out.println(k);
            }
            k += 79;
        }
        System.out.println("*****Задание 4******");
        for (int l = 1; l<=30; l++){
            System.out.print(l+":");
            if(l%3==0 || l%5==0){
                if(l%3==0 && l%5==0){
                    System.out.print("ping pong");
                }
                else if(l%3==0){
                    System.out.print("ping");
                }
                else {
                    System.out.print("pong");
                }
            }
            System.out.print("\r\n");
        }
        System.out.println("*****Задание 5******");
        int m =0;
        int n = 1;
        System.out.print(m + " ");
        System.out.print(n + " ");
        for (int p = 0; p<=7;p++){
            int newInt = m+n;
            m = n;
            n = newInt;
            System.out.print(newInt + " ");
        }
    }
}
