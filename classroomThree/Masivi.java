package classroomThree;

import java.util.Scanner;

public class Masivi {

    public static void main(String[] args) {
        String[] gadalaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        double[] randomSkaitli = {21.3, 323.23, 412.32};

        System.out.println("Masīva garums ir:" + gadalaiki.length);

        System.out.println(gadalaiki[0]);
        System.out.println(gadalaiki[1]);
        System.out.println(gadalaiki[2]);
        System.out.println(gadalaiki[3]);
        //System.out.println(gadalaiki[4]);
        System.out.println(fibonacciNumbers[4]);

        gadalaiki[1] = "JURIS";
        System.out.println(gadalaiki[1]);

        //Masīvs ar cilvēku vārdiem
        String[] cilveki = {"Juris", "Pēteris", "Anna"};
        int[] vecums = {33, 40, 28};
        System.out.println("Vārds" + cilveki[0] + "\n" + "Vecums" + vecums[0]);
        // printCilveks(cilveki, vecums, 1);

        String[] germanCars = new String[4];
        germanCars[0] = "Mercedes";
        germanCars[1] = "Audi";
        germanCars[2] = "BMW";
        // germanCars [3] = "Opel";
        System.out.println(germanCars[3]);

        int iterators = 0;
        while (iterators < germanCars.length) {
            System.out.println(germanCars[iterators]);
            iterators++;
        }
        printStringArray(germanCars);


        //Ievadi skaitli 1, ievadi skaitli 2, ievadi skaitli 3
        int[] mansMasivs = generateArray();
        System.out.println(mansMasivs[0] + mansMasivs[1] + mansMasivs[2]);
        System.out.println(mansMasivs[0] + "" + mansMasivs[1] + "" + mansMasivs[2]);
        //System.out.println(mansMasivs);

        int[] majasdarbuIesniegumi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        printInArray(majasdarbuIesniegumi);


        int i = 0;
        while (i < 5) {
            System.out.println("I ir :" + i);
            //    i = i + 1; //tas pats kas i++
            i++; //tas pats kas i = i + 1;
        }
        System.out.println("cikla izeja");

        int q = 10;
        while (q > 1) {
            System.out.println("Q ir" + q);
            q--; // tas pats kas q = q - 1;
        }

        //     while(true) {
        //         int r = 0;
        //         r++;
        //         System.out.println(r);
        //     }


        int[] bingoLottoLaimigieSkaitli = {3, 5, 48, 5, 6, 31};
        //     int counter = 0;
        //     while ( counter < bingoLottoLaimigieSkaitli.length ) {
        //         System.out.println(bingoLottoLaimigieSkaitli[counter]);
        //         counter++;

        //     }
        //     System.out.println("Cikla izeja");

        printInArray(bingoLottoLaimigieSkaitli);

        String[] kartis = {"Pīka dūzis", "Ercena kalps", "Kārva dāma"};
        int karts = 0;
        System.out.println(String.format("Man rokā ir %s kārtis", kartis.length));
        while (karts < kartis.length) {
            System.out.println(kartis[karts]);
            karts++;
        }
//        // sumPositiveNumbers();
//        Scanner scanner = new Scanner(System.in);
//        String parole = "Parole123";
//        String lietotajaParolre;
//        do{
//            System.out.println("Ievadi paroli");
//            lietotajaParolre = scanner.nextLine(); // Parole123
//            System.out.println("Pārbaudām paroli");
//
//        }while(lietotajaParolre.equals(parole));
//        System.out.println("Pareiza parole");

        // int number;
        //     do {
        //         System.out.println("Ievadi pozitivu skaitli ");
        //         number = scanner.nextInt();
        //     }while (number<0);


        Scanner scanner = new Scanner(System.in);

//        int number;
//        do {
//            System.out.println("Ievadi pozitivu skaitli lielāku par 0, bet mazāku par 10");
//            number = scanner.nextInt();
//        }while (number<0 && number > 10);

//       
//        for (int j = 0; j <= 10; j=j+2) {
//            System.out.println(j);
//
//        }
//
//        for (int j = 0; j < gadalaiki.length; j++) {
//            System.out.println(gadalaiki[j]);
//        }
//
//        for (int j = 0; j < 10; j++) {
//            System.out.println("es esmu labs students");
//
//        }
        for (int j = 1; j <= 50; j++) {
            if ((j % 3 == 0) || (j % 5 == 0) || (j == 13)) {
                System.out.println("šis numurs mums neder" + j);
            } else {
                System.out.println("šis numurs mums der" + j);
            }

        }

        int[] skaitlos = {1, 3, 4, 6, 1, 2, 3, 5, 1, 2, 5};
        int summa = 0;
        //for each
        for (int skaitlis : skaitlos) {
            System.out.println(skaitlis);
            summa = summa + skaitlis;
        }
        System.out.println(summa);

        String[] vardi = {"ābols", "bumberis", "burkāns"};
        for (String vards : vardi){
        System.out.println(vards);
    }
        for (int j = 0; j < 10; j++) {
            if(j==5){
                break;
            }
            System.out.println(j);


        }
        System.out.println("================================");
        int[]skaitliMasivs = {1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, -3, 5, 4};

        for (int j = 0; j < skaitliMasivs.length; j++) {
            if (skaitliMasivs[j]==-3) {
                System.out.println(skaitliMasivs[j]);
                break;

            }
            System.out.println(skaitliMasivs[j]);
        }
        System.out.println("============================================");
        System.out.println("============================================");

        for (int j = 0; j < 10; j++) {
            if(j>4 && j<8){
                continue;
            }

            System.out.println(j);

        }


    }








       static int sumPositiveNumbers(){
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        int summa = 0;
        while (number>= 0){
            summa = summa + number;
            System.out.println("Ieraksti skaitli");
            number = scanner.nextInt();
        }
           System.out.println("Pozitīvo skaitļu summa ir:" + summa);
        return summa;
       }




    static void printInArray(int[] randomMasivs) {
        int counter = 0;
        while (counter < randomMasivs.length) {
            System.out.println(randomMasivs[counter]);
            counter++;
        }
    }

        static void printStringArray(String[] randomMasivs){
            int counter = 0;
            while(counter < randomMasivs.length){
                System.out.println(randomMasivs[counter]);
                counter++;
            }

    }

    static int[] generateArray (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli...");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli...");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli...");
        int c = scanner.nextInt();
        int[] skaitluMasivs = {a, b, c};
        return skaitluMasivs;
        //return new int[]{a, b, c};
        //return new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

    }

   // private static void printCilveks(String[] cilveki, int[] vecums, int i) {
   // }





    static void printCilvieks(String[] humans, int[] ages, int index){
        System.out.println("Vārds" + humans[index] + "\n" + "Vecums" + ages[index]);
    }
}
