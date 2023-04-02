package practice.practice_daytime.daytime08;

public class Kumanda {

    private double genislik;
    private double yukseklik;
    private double ekranBuyuklugu;
    private int maxVolume= 100;
    private int ses = 10;
    private boolean guc;

    public Kumanda(double genislik, double yukseklik, double ekranBuyuklugu) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.ekranBuyuklugu = ekranBuyuklugu;
    }//const

    // kanalDegistirme()

    public  String kanalDegistirme(String kanal){
        switch(kanal){
            case "A":
            return kanal;//A kanali
             case "B":
             return kanal;
             case "C":
             return kanal;
        }
        return kanal;
    }


    public void gucDugmesi(){
       this.guc =!guc;
        System.out.println(guc);
    }

    public int sesAzaltma(){

        if(ses>0){
            ses--;
        }
        return ses;
    } //sesAzaltma()

    public int sesArtirma(){

        if(ses<maxVolume){
            ses ++;
        }
        return ses;
    }



}//class
