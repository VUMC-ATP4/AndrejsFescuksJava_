package classroomFour;

public class Velosipeds {
    int atrums = 0;
    int atrumi = 21;
    String nosaukums = "Velo";
    String krasa = "Zaļa";
    int svarsGrammos;
    double rataIzmers;
    String bremzuTips = "";

    public void bremze(){
        if(bremzuTips.equals("V-veida")){
            atrums = atrums - 1;
        }else if(bremzuTips.equals("Disku")){
            atrums = atrums - 3;
        }else {
            atrums = atrums - 1;
        }

       // atrums--;
        //atrums = atrums - 2;
    }
    public void spiedPedalus(){
        atrums++;
    }


}
