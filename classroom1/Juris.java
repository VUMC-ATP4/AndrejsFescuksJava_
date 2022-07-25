package classroom1;

public class Juris {

    static int timeout = 10;

    public static void main(String[] args) {
        System.out.println("Hello cat");
        System.out.println("x");
        System.out.println(timeout);

        // Intenger - LV: Vesels skaits
        int x = 5;
        int y = 10;
        int q = -10;



        double lowestTemperature = -20.4;
        float highestTemperature = 40.65512312F;
        System.out.println("Augstaka temp ir" + highestTemperature + "zemaka temp ir" + lowestTemperature);



        System.out.println("x ir vienads ar:");
        System.out.println(x);
        System.out.println("y ir vienads ar:");
        System.out.println(y);
        System.out.println("x+y ir vienads ar:");
        System.out.println(x+y);
        //[Mainīga tips] [Msinīgā nosaukums]=[Vērtība];
        //vārdi un teikumi JAVA valodā tiek saglabāti mainigā tipā 'String'
        //
        String dogName = "Reksis";
        //Veseli skaitli tirk definēti ar mainīgā tipu 'int'
        //int dogAge = 10;
        byte dogAge = 10;
        //Daiskaitli  tiek definēti ar mainīga tipu 'double' vai 'float'
        double dogWeight = 15.5;
        String dogBreed = "VAS";
        //Jā nē jautājums tiek definēts ar mainīga tipu 'boolean'
        boolean isDogHungry = true;
        boolean isDogVaccinated = true;

        char currency = '$';
        int dogPrice = 100;
        char dogGender = 'M';


        //System.out.println("Suņa Vārds:" + dogName + "\n\n\nSuņa Vecums:" + dogAge + "\nSuņa Svars:" + dogWeight + "\nSuņa škirne:" + dogBreed + "\nvai suns ir izxalcis:" + isDogHungry);
        System.out.println("Suņa Vārds:" + dogName);
        System.out.println(dogName);
        System.out.println("Suņa Vecums:" + dogAge);
        System.out.println("Suņa Svars:" + dogWeight);
        System.out.println("Suņa škirne:" + dogBreed);
        System.out.println("vai suns ir izxalcis:" + isDogHungry);
        System.out.println("Suņa dzimums ir:" + dogGender);
        System.out.println("Suņa kucēni maksa:" + dogPrice + currency);
        System.out.println("vai suns ir vakcinēts" + isDogVaccinated);

        byte age = 10;
        short deepestSeaLevel = 11000;
        int highestIntNumber = 2147483647;
        long USACountryDebt = 21474836471232L;


        System.out.println(age);
        System.out.println(deepestSeaLevel);
        System.out.println(highestIntNumber);
        System.out.println(USACountryDebt);

        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;

        int starpiba = pirmaisSkaitlis - otraisSkaitlis;

        summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;
        //int [] saraksts = {1,2,3,4,5,6,7,8};
        int a = 1;
        int b = 4;
        int c = 7;
        //int vienadojums = -(5 + 5) * 2;


        System.out.println("###" + a/b);


        System.out.println("Ja atlikums ir 0, tad para skaitlis" + a % 2);
        System.out.println("Ja atlikums ir 0, tad para skaitlis" + b % 2);
        //if(b % 2 ==0){
        //    System.out.println("šis ir para skaitlis");
        // } else{
        //    System.out.println("šis nav para skaitlis");
        // }

       // System.out.println(pirmaisSkaitlis + otraisSkaitlis);
        System.out.println(pirmaisSkaitlis + "+" + "(" + otraisSkaitlis + ")" + "=" + summa);
        System.out.println("starpiba" + starpiba);
        System.out.println("summa" + summa);
        System.out.println("dalijums" + dalijums);
        System.out.println("reizinajums" + reizinajums);
        System.out.println("atlikums" + atlikums);

        double aa = 3;
        int bb = 5;
        System.out.println((double) bb);
        System.out.println((int) aa);









    }

    public static void manaMetode() {
        System.out.println(timeout);

    }

}
