package HomeWorkTwo;

import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        System.out.println("First task - true/false");

        int x = 7;

        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5) && (x < 10));
        System.out.println(x == 0 || x == 10);
        System.out.println(x*x > 10);

        System.out.println("Second task - print month name");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month");

        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
            default:
                System.out.println("The month" + "" + month + "" + "is not defined");

        }

        System.out.println("Third task - print the biggest value");

        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter third number");
        int c = scanner.nextInt();

        if(a > b && a > c){
            System.out.println(a + "" + "is the largest number");
        }
        else if (b > a && b > c) {
            System.out.println(b + "" + "is the largest number");
        }
        else {
            System.out.println(c + "" + "is the largest number");
        }

        System.out.println("Forth task - print allowed action");

        String color = "Green";
        if (color.equals("Green")){
            System.out.println("Can continue to walk when it's a" + "" + color + "" + "color");
        }
        else if (color.equals("Red")){
            System.out.println("Have to wait when it's a" + "" + color + "" + "color");
        }
        else if (color.equals("Yellow")) {
            System.out.println("Have to stop when it's a" + "" + color + "" + "color");

        }
        else{
            System.out.println("If traffic light doesn't work pass road carefully");
        }

    }


}
