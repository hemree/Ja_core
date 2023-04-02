package main.java.day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
       /*
        1)Lambda "Functional programming" dir, digeri "Structured Programming"
        2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
        3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
        4)Lambda, Java'ya "Java 8"de eklendi.


       "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
"filter()" filtrelemek icin kullanilir.
"map()" u var olan elemani degistirmek icin kullanilir.
"distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
 Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
"reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
 Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
 "u" ise degerlerini her zaman "stream" den alir
    */

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSguareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printCubeOfDistinctEvenElements(nums);
        System.out.println();
        printCubeOfDistinctDistingsElements(nums);
        System.out.println();
        getMaxValue(nums);
        System.out.println();
        getMaxValueNames(nums);
        System.out.println();
        GetMaxValueNames2(nums);


    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums) {
        //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //4)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElements2(List<Integer> nums) {
        nums.//12 9 131 14 9 10 4 12 15
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    // Bir listteki tek sayi olan elemanların karelerini ayni satirda aralarinda bosluk koyarak yazdiran methodu olsuturunuz.

    public static void printSguareOfOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
    }


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                distinct().
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));

    }

    //7) create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static void printCubeOfDistinctEvenElements(List<Integer> nums) {
        Integer sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }

    // 7)  create a method to calculate the "product" of the "cubes" "distings" "even" elements.

    public static void printCubeOfDistinctDistingsElements(List<Integer> nums) {
        Integer Product = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(Product);


    }

    // 8) create method to find the "max value" from the list elements
    public static void getMaxValue(List<Integer> nums) {
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    // 8) create method to find the "min value" from the list elements

    public static void getMinValue(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(min);
    }

    // 9) create method to find the "max value" from the list elements
    public static void getMaxValueNames(List<Integer> nums) {

        Integer max = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    public static void  GetMaxValueNames2(List<Integer>nums){
        Integer max2 = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE,(t,u) ->t<u ? t:u);
        System.out.println(max2);
    }
    public static void getMaxValue2(List<Integer>nums){{
        Integer max3;
        max3 = nums.
                stream().
                distinct().
                reduce(Integer.MAX_VALUE,(t,u) ->t>u ? t:u);
        System.out.println(max3);

    }

    }
}






