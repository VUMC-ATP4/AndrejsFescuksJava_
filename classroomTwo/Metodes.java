package classroomTwo;

import java.util.Scanner;

public class Metodes {
    public static void main(String[] args) {
        System.out.println("Sakas koda izpilde");
        printetText();
        System.out.println("bridzās koda izpilde");
   //     printetText();
   //     printetText();
   //     printetText();
        switchPiemers();
   //     checkPersonAge();
   //     checkPersonAge();
   //     checkPersonAge();
   //     checkPersonAge();
  //      checkPersonAge();

   //     calculateArea(5,10);
   //     calculateArea(10, 10);
   //     calculateArea(3, 10);
   //     calculateArea(4, 10);
  //      calculateArea(303,10);

        int a = 10;
        int b = 50;
       // int laukums = calculateArea(305, 10);
        int laukums = calculateArea(a,b);
        System.out.println(laukums);

      //  int a =5;
      //  int b = 10;

      //  System.out.println("Kvadrāta laukums ir:" + (a * b));




    }

    static int calculateArea(int a, int b){
        //System.out.println("Kvadrāta laukums ir:" + (a * b));
        return a*b;

    }


    static void checkPersonAge(){
        Scanner scanner = new Scanner(System.in);
        int vecums;
        boolean canVote = false;
        System.out.println("Paskaties cilvēka pasē&");
        vecums = scanner.nextInt();
        if(vecums >= 18){
            canVote = true;

        }
        if (canVote){
            System.out.println("cilveks var balsot");
        }
        else{
            System.out.println("cilveks nevar balsot");
        }
    }

    static void switchPiemers(){
        int skaitlisBB = 343;
        switch (skaitlisBB) {
            case 10:
                System.out.println("skaitlis  = 10");
                break;
            case 15:
                System.out.println("skaitlis = 15");
                break;
            case 20:
                    System.out.println("skaitlis = 20");
                    break;
            default:
                System.out.println("skaitlis nezināms");
        }
    }





    static void printetText(){

        System.out.println("šī ir mana metode sākums");
        System.out.println("Es izsausu šo metodi beigas");
    }


}
