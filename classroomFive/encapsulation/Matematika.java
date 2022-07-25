package classroomFive.encapsulation;

public class Matematika {
    public int add(int a, int b) {
        return a + b;
        //System.out.println(a+b);
    }
    public double add(double a, double b) {
        return a + b;
    }

    public void paraiditTekstu(String a){
        System.out.println("Tekst ir:" + a);
    }

    public void paraiditTekstu(String a, boolean isMan) {
        if (isMan == true) {
            System.out.println("Mr" + a);
        } else {
            System.out.println("Ms" + a);
        }
    }

}
