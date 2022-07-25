package homeworkFour_;

public class Triangle {

    int a;
    int b;
    int c;
    double area;

    boolean ifEquilateral;
    boolean ifIsosceles;

    public Triangle(){
        System.out.println("Creating a triangle...");
    }

    public Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Triangle area: " + Area());
        this.area = Area();
    }

    public double Area (){
        return (Math.sqrt(((a*a+b*b+c*c)*(a*a+b*b+c*c))-2*(a*a*a*a+b*b*b*b+c*c*c*c)))/4;
    }

    public boolean TriangleEquilateral() {
        if ((a == b) && b == c) {
            ifEquilateral = true;
        } else {
            ifEquilateral = false;
        }
        return ifEquilateral;
    }

    public boolean TriangleIsosceles() {
        if (a == b && b != c) {
            ifIsosceles = true;
        } else if (a != b && b != c && c == a) {
            ifIsosceles = true;
        }else if (a != b && b == c) {
            ifIsosceles = true;
        }else {
            ifIsosceles = false;
        }
        return ifIsosceles;
    }

//    int a;
//    int b;
//    int c;
//    double area;
//
//    Triangle(){
//        System.out.println("veidoju trisstūri");
//    }
//
//
//        Triangle(int a, int b, int c){
//            this.a = a;
//            this.b = b;
//            this.c = c;
//        }
//        public double Area(){
//            System.out.println("Trīsstūra laukums:");
//            return (Math.sqrt((((a^2)+(b^2)+(c^2))^2)-2*((a^4)+(b^4)+(c^4)))/4);
//        }
//
//        public boolean isEquilateral(){
//            if (a==b && b==c & c==a) {
//                return true;
//            }else {
//                return false;
//            }
//        }
//
//        public boolean isIsosceles(){
//            if (a==b && b!=c){
//                return true;
//            }else {
//                return false;
//            }
//        }

    }

