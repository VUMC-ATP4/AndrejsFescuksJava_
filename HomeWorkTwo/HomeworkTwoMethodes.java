package HomeWorkTwo;



import java.util.Scanner;

public class HomeworkTwoMethodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Fifth task - print bussines card 3 times
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();



        //Sixth task - print new bussiness card with arguments 2 times.


        //String card = printBusinessCardTwo("Līga", "Kalniņa", "+371 12312313", 1965);
        //String card1 = printBusinessCardTwo("Juris", "Vītols", "+371 5142431", 1930);
        printBusinessCardTwo("Līga", "Kalniņa", "+371 12312313", 1965);
        printBusinessCardTwo("Juris", "Vītols", "+371 51424313", 1930);


        // Seventh task

        int summa = sum(4, 10);
        System.out.println(summa);

        //Eighth task

        //double average (10, 2, 4);
        System.out.println(average(10, 2, 4));

    }




        static void printBusinessCard(){
            System.out.println("Vizītkarte");
            System.out.println("************");
            System.out.println("Vārds: Jānis");
            System.out.println("Uzvārds: Bērziņš");
            System.out.println("Telefona numurs: +371 12345678");
            System.out.println("Dzimšanas gads: 1990");
            System.out.println("*************");
        }

        static void printBusinessCardTwo (String name, String surname, String phoneNumber, int year){
            System.out.println("Vizītkarte");
            System.out.println("************");
            System.out.println("Vārds:" + name);
            System.out.println("Uzvārds:" + surname);
            System.out.println("Telefona numurs:" + phoneNumber);
            System.out.println("Dzimšanas gads:" + year);
            System.out.println("*************");
        }
        //
        static int sum (int a, int b){
        return a+b;
        }

    static double average (double q, double w, double e){
        return (q+w+e)/3;
    }




}


