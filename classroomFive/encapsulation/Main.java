package classroomFive.encapsulation;

public class Main {

    public static void main(String[] args) {

        Bird putns = new Bird();
        putns.setKrasa("Zila");
        System.out.println(putns.getKrasa());
       // putns.color = "Zila";// var izmantot, var piekļut, var izmainit arpus klases, jo public
        //putns.name = "Pollija";
        //System.out.println(putns.name); nevar izmantot, nevar piekļut, nevar izmainit arpus klases, jo private
        putns.printText();
        //putns.printTextSpecial(); nevar izsaukt jo privata metode
        putns.defaultMethodExample();

        Human cilveks = new Human();
//        int vecums = -1;
//        if(vecums<=0){
//            System.out.println("vecums nedrīkst būt negattīvs");
//        }else{
//            cilveks.setAge(-1);
//            System.out.println(cilveks.getAge());
//        }
        //cilveks.age =1;
        cilveks.setAge(28);
        System.out.println(cilveks.getAge());

        cilveks.setHeight(154);
        System.out.println(cilveks.getHeight());

        cilveks.setName("Jhon");
        System.out.println(cilveks.getName());


        cilveks.setSurname("No");
        System.out.println(cilveks.getSurname());

        Matematika matematika = new Matematika();
        matematika.add(30, 20);
        System.out.println(matematika.add(30, 20));
        matematika.add(1.3, 3.5);
        System.out.println(matematika.add(1.3, 3.5));
        matematika.paraiditTekstu("Juris");
        matematika.paraiditTekstu("Juris", true);
        matematika.paraiditTekstu("Anna", false);




    }


}
