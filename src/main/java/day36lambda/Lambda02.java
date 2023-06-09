package main.java.day36lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        List<Double>myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);

        List<Double>half = getHalfOfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println(half);//[19.2, 13.4, 6.0, 3.5]

        List<String>list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);//AJDA ANGELİNA BRAD CUNEYT JOHN TOM
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);//tom john cuneyt brad angelina ajda
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);//TOM JOHN AJDA BRAD CUNEYT ANGELİNA
        System.out.println();
        printAllSortWithLastCharUpperDistinct(list);//AJDA ANGELİNA BRAD TOM JOHN CUNEYT
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);


    }
    //Example 1: Create a method to find the half of the elements greater than 5, distinct, in reverse order, in a list.

    public static List<Double>getHalfOfElementsGraterThanFiveDistinctReversed(List<Double>myList){
        return myList.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    //Example 2: Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyUpperDistinct(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print(t + " "));
    }

    //Example 3: Tum list elemanlarini kucuk harfle alfabetik siranin tersinde ve tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyLowerDistinct(List<String>list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));
    }

    //Example 4: Tum list elemanlarini buyuk harfle, uzunluklarina artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLengthUpperDistinct(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t + " "));
    }

    //Example 5: Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct(List<String>list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 6: Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada, tekrarsiz olarak yazdiriniz
    //           Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    // "method reference" class'in icindeki methodu adresle demek
    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String>list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).//String::toUpperCase yapisina "method reference" denir.
                sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);


    }

}
