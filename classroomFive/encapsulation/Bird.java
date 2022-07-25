package classroomFive.encapsulation;

public class Bird {

    //public String color;
    private String color;
    private String name;

    public void setKrasa(String krasa){
        this.color = krasa;
    }

    public String getKrasa(){
        return  color;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }

    //varam piekļūt no citām klasēm
    public void printText(){
        System.out.println("šī ir publiska metode");
        System.out.println("Printēju putnu");

    }
    //varam piekļūt no šīs klasēm
private void printTextSpecial(){
    System.out.println("šī ir privāte metode");
}
    //varam piekļūt pakotnes ietvaros
void defaultMethodExample(){
    System.out.println("šī ir default metode");
}

}
