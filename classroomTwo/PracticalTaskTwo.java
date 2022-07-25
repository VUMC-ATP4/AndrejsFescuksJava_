package classroomTwo;

//import java.util.Scanner;

import java.util.Scanner;

public class PracticalTaskTwo {

    //Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {

        // tips nosaukums     deklaracias
        Scanner scanner = new Scanner(System.in);
//        int vecums;
//        boolean drikstBalsot = false;
//
//        System.out.println("Paskaties cilvēka pasē&");
//        vecums = scanner.nextInt();
//        if(vecums >= 18){
//            System.out.println("Drikst balsot");
//         //   drikstBalsot = true;
//        }
//        System.out.println("Nedrikst balsot");
//
//        System.out.println("Vai drikst balsot?" + drikstBalsot);

        int vecums;
        boolean canVote = false;

        System.out.println("Paskaties cilvēka pasē&");
        vecums = scanner.nextInt();
        if(vecums >= 18){
            canVote = true;

            //   drikstBalsot = true;
        }
        if (canVote){
            System.out.println("cilveks var balsot");
        }
        else{
            System.out.println("cilveks nevar balsot");
        }
        //if(true){
       //    System.out.println("true");

       // }


        int month = 1;

        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 12:
                System.out.println("Decembris");
            default:
                System.out.println("Menesis" + month + "nav definets");




        }


        int x = 10;
        int y = 20;

       // if (y > x)
        if(y > x && x > 5) {
           // System.out.println(true);
            System.out.println("y ir lielaks par x");
        }

        if (y > x || y > 25){
            System.out.println("šis izpildas!");//true or false
        }

   //     int skaitlis = 5;
   //     if (skaitlis > 0){
   //         System.out.println( skaitlis + "ir pozitivs");
   //     }else {
   //         System.out.println(skaitlis + "ir negativs");
   //     }

   //     int skaitlis = 0;
  //      if (skaitlis > 0){
   //         System.out.println( skaitlis + "ir pozitivs");
   //     }else if (skaitlis <0){
   //         System.out.println(skaitlis + "ir negativs");
   //     } else {
   //         System.out.println(skaitlis + "ir NULLE");
   //     }

        int skaitlisB = 19;

        switch (skaitlisB){
            case 10:
                System.out.println( "skaitlis = 10");
                break;
            case 15:
                System.out.println("skaitlis = 15");
                break;
            case 20:
                System.out.println("skaitlis = 20");
                break;
            default:
                System.out.println("skaitlis ir nezinams");
        }

        if (skaitlisB == 10)
        {
            System.out.println( "skaitlis = 10");
        }
        else if (skaitlisB == 15)
        {
            System.out.println("skaitlis = 15");
        }
        else if (skaitlisB == 20)
        {
            System.out.println("skaitlis = 20");
        }
        else {
            System.out.println("skaitlis ir nezinams");
        }

        int q = 10;
        if (q > 1)
        {
            System.out.println("skaitlis ir lielaks par nulli");
        }

        int cilvekaVecums  = 65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if (dzimums == 'V' && cilvekaVecums >= 65)
        {
            drikstDoties = true;

        } else if(dzimums == 'S' && cilvekaVecums >= 60)
        {
            drikstDoties = true;
        }
        System.out.println("Cilveks drikst doties pensija" + drikstDoties);

        int diena = 7;
        switch (diena){
            case 1:
                System.out.println("Pirmdiena");
                break;
            case 2:
                System.out.println("Otrdiena");
                break;

        }

        // 12 % 2 = 0
        // 13 % 2 = 1
        // 15 % 2 = 1

        int skaitlisX = 14;
        if (skaitlisX%2==0){
            System.out.println("Skaitlis ir pāra");
        } else{
            System.out.println("Skaitlis ir nepāra");
        }



       // System.out.println(false);

       // System.out.println("Tālākās darbības");

        //    if(6>3){
        //   System.out.println("6 ir lielāks par 3");
        //   }

   //     if(2>3){
   //         System.out.println("6 ir lielāks par 3");
   //         }

   //     System.out.println("Ievadi savu vārdu");

       // String name = scanner.nextLine();

        //System.out.println("Labdien" + name + "!");
        //System.out.println("Esi sveicinats calculatora programmā!");

        //int a;
        //int b;
        //int summa;

        //char operator;
        //String name = "Juris";
        //System.out.println("Ievadi skaitli a");
        //a = scanner.nextInt();
        //System.out.println("Ievadi skaitli b");
        //b = scanner.nextInt();
        //System.out.println(a > b);
   //     System.out.println("šeit jabUt nepatiesan" + (5>10));
   //     System.out.println(5==5);
   //     System.out.println(3==5);
   //     System.out.println(6!=5);
   //     System.out.println(5!=5);
   //     int age = 18;
   //     System.out.println(age >= 18);
   //     int childage = 5;
   //     System.out.println(childage <= 5);
   //     System.out.println(age > childage);
   //     boolean isEligbleToVote = age >= 18;
   //     System.out.println("vai cilvēks drikst balsot?" + isEligbleToVote);

   //     String name = "Juris";
   //     String nameTwo = "Juris";
   //     //System.out.println(name == nameTwo);
   //     System.out.println(name.equals(nameTwo));
   //     System.out.println(false == false);
   //     System.out.println(true != false);
   //     System.out.println(false !=false);

   //     System.out.println("Ievest x");
        //int x = scanner.nextInt();
   //     int x = 4;

   //     boolean vaiIrPatiess = ((x < 5) && (x < 10) && 1 != 1); //true
   //     x = 5;

        //System.out.println(vaiIrPatiess);
   //     System.out.println(x < 5 && x <10); //false
   //     System.out.println(x < 5 || x <10); //true

   //     System.out.println(vaiIrPatiess);










      //  summa = a + b;
      //  System.out.println(String.format("%s, %s + %s = %s", name, a, b, summa));




        //a = scanner.nextInt();

//

    //    System.out.println("ši ir otrā Java lekcija");
    //    String teksts;
    //    String name = "Juris";
    //    String surname = "Kreilis";
    //    String role = "pasniedzējs";
    //    double videjaAtzime = 7.3214;

    //    teksts = String.format("Mani sauc %s", name);

    //    double a = 100.25;
        //double b = 10.32;
    //    int b = 10;

    //    System.out.println("a - b" + (a - b) );
    //    System.out.println("b / a" + (b / a) );
    //    String.format( "%.2f", (b/a) );
    //    System.out.println( String.format( "%.2f", (b/a) ) );


    //    String concatTeikums = "Mani sauc" + name + " Mans uzvards ir" + surname + " Es esmu" + role;
    //    String teikums = String.format ("Mani saus %s. Mans uzvārds ir %s. Es esmu %s. Man vid atz ir %f", name, surname, role, videjaAtzime);

    //    System.out.println(teksts);
    //    System.out.println(teikums);
    //    System.out.println(concatTeikums);


        //  int a = 10;
        //  int b = 20;
        //  int c = 20;
        //  int d = 0;
        //  System.out.println((a < b) && (b == a));
        //  System.out.println(a > b || c == d);

        //  System.out.println(!(a>b));


    }
}
