package homeworkFour_;

public class Main {

    public static void main(String[] args) {


        Triangle triangle1 = new Triangle();
        triangle1.a = 3;
        triangle1.b = 3;
        triangle1.c = 3;
        System.out.println("Triangle area = " + triangle1.Area());
        System.out.println("If triangle is Equilateral: " + triangle1.TriangleEquilateral());
        System.out.println("If triangle is Isosceles: " + triangle1.TriangleIsosceles());


        System.out.println("\n");
        Triangle triangle2 = new Triangle(3, 4, 3);
        System.out.println("If triangle is Equilateral: " + triangle2.TriangleEquilateral());
        System.out.println("If triangle is Isosceles: " + triangle2.TriangleIsosceles());
    }

//    public static void main(String[] args){
//        Triangle.triangle1 = new Triangle();
//        triangle1.a =3;
//        triangle1.b =5;
//        triangle1.c =3;
//
//        System.out.println("Trisstūra laukums ir:" + triangle1.Area());
//        System.out.println("Vai trīsstūris ir vienadmalu?" + triangle1.isEquilateral());
//        System.out.println("Vai trīsstūris ir vienādsānu?" + triangle1.isEquilateral());
//
//        Triangle.triangle2 = new Triangle(4,4, 4);
//        System.out.println("Vai trīsstūris ir vienadmalu?" + triangle2.isEquilateral());
//        System.out.println("Vai trīsstūris ir vienādsānu?" + triangle2.isEquilateral());
    }

