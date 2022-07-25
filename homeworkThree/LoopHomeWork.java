package homeworkThree;
import java.util.Scanner;
public class LoopHomeWork {

    public static void main(String[] args){
        //First task
        Scanner scanner = new Scanner(System.in);

        int summa = 0;
        while (summa <= 100){

            System.out.println("Ieraksti veselu skaitli");
            int number = scanner.nextInt();
            summa = summa + number;
            System.out.println("Summa ir" + summa);


        }

        System.out.println("Gatavs, summa ir" + summa);

        //Second task

        System.out.println("Ieraksti skaitli");
        int skaitlis = scanner.nextInt();
        int i, m = 0, flag = 0;
        m = skaitlis / 2;
        if(skaitlis==0||skaitlis==1){
            System.out.println(skaitlis + "nav pirmskaitlis");
        }else{
            for (i = 2; i <= m; i++) {
                if(skaitlis % i == 0){
                    System.out.println(skaitlis + "nav pirmskaitlis");
                    flag = 1;
                    break;
                }

            }
            if (flag == 0){
                System.out.println(skaitlis + "ir pirmskaitlis");
            }
        }

        //Third task

        int[] vecums = {14, 41, 77, 48};
        String[] cars = {"Audi", "Opel", "Audi", "Skoda"};
        char[] simboli = {'!', '@', '#', '$'};


        int a = 0;
        while (a < cars.length){
            System.out.println(cars[a]);
            a++;
        }

        int q = 0;
        while (q < vecums.length){
            System.out.println(vecums[q]);
            q++;
        }

        int f = 0;
        while (f < simboli.length){
            System.out.println(simboli[f]);
            f++;
        }

        System.out.println("****************************");
        int a2 = 0;
        do {
            System.out.println(cars[a2]);
            a2++;
        }
            while (a2 < cars.length);


        int q2 = 0;
        do {
            System.out.println(vecums[q2]);
            q2++;
        }
        while (q2 < vecums.length);



        int f2 = 0;
        do {
            System.out.println(simboli[f2]);
            f2++;
        }
        while (f2 < simboli.length);

        System.out.println("**********************");

        int a3;
        int q3;
        int f3;

        for (a3 = 0; a3 < cars.length ; a3++) {
            System.out.println(cars[a3]);
        }

        for (q3 = 0; q3 < vecums.length; q3++) {
            System.out.println(vecums[q3]);
        }

        for (f3 = 0; f3 < simboli.length; f3++) {
            System.out.println(simboli[f3]);
        }

        System.out.println("*****************************");
        for (String a4 : cars) {
            System.out.println(a4);
        }

        for (int q4 : vecums) {
            System.out.println(q4);
        }

        for (char f4 : simboli) {
            System.out.println(f4);

        }
        //Fourth task
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        for (int l = 1; l < 100; l++) {
            if (l % 2 == 0){
                System.out.println(l);
            }

        }

        //Fifth task
        System.out.println("Ievadi skaitli");
        int cipars = scanner.nextInt();
        int fact = 1;
        int value = 1;

        while (value <= cipars) {
            fact = fact * value;
            value++;
        }
        System.out.println("Faktoriālā vērtiba skaitlim" + cipars + "ir" + fact);



        // Sixth task
        final  int pinKods = 2022;
        int usersPinkods;
        int enteredNumberTimes = 0;

        while (enteredNumberTimes <= 3){
            enteredNumberTimes++;
            System.out.println("Ievadi PIN");
            usersPinkods = scanner.nextInt();
            if (usersPinkods == pinKods){
                System.out.println("PIN ir pieņemts");
                break;
            } else if (enteredNumberTimes == 3 && usersPinkods != pinKods) {
                System.out.println("Atvainojiet, bet jūs esat blokēts");
                break;
            } else {
                System.out.println("Nepareizs PIN, mēginiet vēlreiz");

            }
        }





    }

}
