package main.java.day03scanner;

public class Car {
    // Class ==> Variable (Pasif Ozellikler) ==> Object
                //Method (Aktif Ozellikler)
    public String model= "Corolla";//pasif ozellikler Variable
    public int fiyat = 200000;

    public static void main(String[] args) {

    //Class ismini yazin #Objeye isim verin   =   new keywordunu kullanin  Class ismini ()
        Car                myCorolla          =   new                        Car();

        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();

    }//main'in  bodysi
    public void hareket(){//Aktif ozellikler Methodlar
        System.out.println("Toyota hizli hareket eder...");
    }
    public void dur(){//Aktif ozellikler Methodlar
        System.out.println("Toyota guvenle durur...");
    }

}//Class body'si
