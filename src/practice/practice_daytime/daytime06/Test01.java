package practice.practice_daytime.daytime06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {

    static int x = 1000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> products = new ArrayList<>();

        int i=0;

        do {  //[Toy, Lego, Shoes]
            System.out.println("Enter " + (i+1) +  ". product name");

            products.add(scan.nextLine());

            i++;
        }while(i<3);

        System.out.println(products);//[Toy, Lego, Shoes]



        List<String> productId = new ArrayList<>();

        for(String w : products) {//[Toy, Lego, Shoes]

            productId.add( ""+w.charAt(0) + w.charAt(1)+x );//x=1000 idi

          x++;

        }

        System.out.println(productId);
    }
}
/*
    Kullanici Toy, Lego, ve Shoes girerse output ne olur?

A) [Toy, Lego, Shoes].
   [To1000, Le1001, Sh1002]
B)  [Toy, Lego, Shoes]
    [To1000, Le1000, Sh1000]

 C)   [Toy, Lego, Shoes]
     [To, Le, Sh]

D) [Toy, Lego, Shoes]
   [T1000, L1001, S1002]

 */

