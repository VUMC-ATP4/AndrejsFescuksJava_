package classroomFive.inheritance;

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog(4, "Reksis");
        Animal dog2 = new Dog(4, "Lesija");
        //Dog dog1 = new Animal(4, "random name");
        Octopus octopus1 = new Octopus(8, "Astoņkājis");
        Chicken vista = new Chicken(2, "Baltā vista");
        Chicken vistaArVienuKaju = new Chicken(1, "Melnā vista ar vienu kāju");




//        dog1.legCount = 4;
//        octopus1.legCount = 8;
        dog1.printLegCount();
        octopus1.printLegCount();
        vista.printLegCount();
        vistaArVienuKaju.printLegCount();
        Animal dzivnieks = new Animal(4, "Dzivnieks");
        System.out.println(octopus1.waterType);
        octopus1.printWaterType();

        Fox lapsa = new Fox("Kūmiņš", 4);


        int[] ieluNumuri = {1, 2, 3, 4, 5, 6};
        Animal[] dzivnieki = {dog1, octopus1, vista, vistaArVienuKaju};

        for (int i = 0; i < dzivnieki.length; i++) {

            dzivnieki[i].printLegCount();
        }
        dog1.makeSound();
        vista.makeSound();
        octopus1.makeSound();



    }
}
