package classroomFive.inheritance;

public class Dog extends Animal {

    public Dog(int legCount, String name) {
        super(legCount, name);
    }

//    public void printLegCount(){
//        System.out.println(legCount);
//    }

//


    @Override
    public void makeSound() {
        //super.makeSound();
        System.out.println("Es esmu suns. Vauu, vauu");
    }
}
