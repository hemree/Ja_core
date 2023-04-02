package main.java.day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        // LinkedHashSet Olusturma

        LinkedHashSet<String> stars = new LinkedHashSet<>();

        stars.add("ajda");
        stars.add("tom");
        stars.add("brad");
        stars.add("angelina");
        System.out.println(stars);
//linkedHashset lerde index yok, cunku rastgele yerlestiriyor
//set'ler takrarli elemani kabul etmez, fakat siz ayni elamani tekrar tekrar koyarsaniz hata vermez
//ayni elemanin ustune yazar, yani birlestirir, sen onu ir tane gorursun. buna "overrid" etmek deniyor
//istersen 1000 kere ekle set onu bir kere gosterir. buna override denir

        LinkedHashSet<String> actress = new LinkedHashSet<>();

        actress.add("angelina");
        actress.add("ajda");

        stars.removeAll(actress);
        System.out.println(stars);


    }
}
