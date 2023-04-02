package practice.practice_daytime.daytime04;

import java.util.Scanner;

public class C01_ForLoop {

    /*
    Kullanicidan aldiginiz bir String degerde 'c' den onceki 'a'
    harfinin String deger icerisinde kac kez gectigini bulan kodu yaziniz

     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen String bir ifade veriniz ");
        String str =input.nextLine().toLowerCase();
        int sayac=0;



        int counter = 0;
        for (
                int i = 0; i < str.indexOf("c"); i++) {
            if (str.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("c'den onceki a'larin sayisi : "+counter);//'c' bulamaz ise 'a' olsada yok der 0 verir


        /////////////////************** 2.Yol **************\\\\\\\\\\\\\\\\\\\\\\\\
        for (int i = 0;i <str.length();  i++) {
            if(str.charAt(i)=='a'){
                sayac++;
            }else if(str.charAt(i)=='c'){
                break;
            }
        }
        System.out.println(" c oncesi 'a' larin sayisi = " + sayac);

    }
}
