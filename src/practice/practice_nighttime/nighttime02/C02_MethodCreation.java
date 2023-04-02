package practice.practice_nighttime.nighttime02;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //protokol tribunu == vip ==static
        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz
        System.out.println("Dikdortgenin Alani : "+dikdortgenAlani(10, 5));
        System.out.println("Dikdortgenin Cevresi : "+dikdortgeninCevresi(12, 45));
        kareninAlani(25);
    }//main

    /*
            Access      static    datatype methodismi( parametreler)
            modifier
     */
            public     static       int dikdortgenAlani(int a,int b){
                return a*b;//carpmanin sonucunu kulaniciya verdim
    }//methodBody

    //Dikdortgenin cevresini hesaplayan kodu yaziniz ve kullaniniz

    public static int dikdortgeninCevresi(int a,int b){
            return 2*(a+b);
    }//methodBody
    //Karenin alanini hesaplata kodu yaziniz
    public static void kareninAlani(int a){
        System.out.println("Karenin Alani : "+(a*a));
    }

}//class
