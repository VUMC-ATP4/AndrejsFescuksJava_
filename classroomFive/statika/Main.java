package classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car("BMW", "melns");
        System.out.println("Auto skaits sistēma:" + auto1.countOfCarsCreatedInSystem);
        System.out.println("Auto skaits sistēma:" + Car.countOfCarsCreatedInSystem);
        Car auto2 = new Car("Mersedes", "balts");
        System.out.println("Auto skaits sistēma:" + auto2.countOfCarsCreatedInSystem);
        Car auto3 = new Car("Mersedes", "balts");
        System.out.println("Auto skaits sistēma:" + auto3.countOfCarsCreatedInSystem);

        auto1.klasesApraksts = "šī ir auto klase";

//        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName());
//        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName());
//        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName() + auto1.klasesApraksts);
//        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName() + auto2.klasesApraksts);
        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName() + Car.klasesApraksts);
        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName() + Car.klasesApraksts);


        auto2.klasesApraksts = "šī ir auto klaseXXXXXXX";
//        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName() + auto1.klasesApraksts);
//        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName() + auto2.klasesApraksts);
        System.out.println("auto1:" + auto1.getColor() + " " + auto1.getName() + Car.klasesApraksts);
        System.out.println("auto2:" + auto2.getColor() + " " + auto2.getName() + Car.klasesApraksts);
        Car.makeSound();
        auto1.makeSound();
        auto2.makeSound();
    }
}
