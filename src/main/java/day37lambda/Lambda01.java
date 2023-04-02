package main.java.day37lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList= new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumofAllElements(myList));
        System.out.println(getSumAllNumbers());
        System.out.println(getSumAll());
        System.out.println(getFactoriel(-5));
        
    }




    // 1) Verilen list'teki tüm sayıların toplamını veren sayıların methodunu olusturunuz.

    public static int getSumofAllElements(List<Integer>myList){

       return myList.stream().reduce(Math::addExact).get();

    }

    //2) 7'den 70 e kadar tüm tamsayıların toplamını veren kodu yazınız.


    public static int getSumAllNumbers(){

       return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }

    // 3) 3 den 9 a kadar tüm tamsayıların çarpımını veren methodu olusturunuz.

    public static int getSumAll(){

       return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();

    }

    // 4) size verilen sayinin faktöriyelini hesaplayınız.

    public static int getFactoriel(int x){

        if (x==0){
            return 1;
        } else if (x<0) {
            System.out.println("faktöriyel islemi negatif sayilari yazamaz");
            return -1;
        }else{
            return   IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }


        // 5) size verilen iki tamsayı arasındaki tum cıft sayıların toplamını veren kodu yazınız.

    }

    public static void getSumevensBetweentwoInt(int a, int b){

        IntStream.range(a+1,b).filter(t->t%2==0).sum();
    }



}
