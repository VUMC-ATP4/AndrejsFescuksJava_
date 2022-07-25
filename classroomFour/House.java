package classroomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
    int cena;


    boolean irStavvieta;
    char valuta;
    int skatijumuSkaits;

    public double cenaKvadratMetra(){
        return cena/platiba;
    }

    public void printetAdresi(){
        System.out.println("Mājas adrese ir:" + ielasNosaukums + "" + majasNumurs);

    }

    public void printetVisu(){
        printetAdresi();
        System.out.println("Māja:" +
                "stavuSkaits=" + stavuSkaits +
                ", ieejuSkaits=" + ieejuSkaits +
                ", istabuSkaits=" + istabuSkaits +
                ", platiba=" + platiba +
                ", cena=" + cena + valuta +
                ", irStavvieta=" + irStavvieta +
                ", cena kvadratmetrā ir=" + cena/platiba + valuta +
                '}');







    }


}







