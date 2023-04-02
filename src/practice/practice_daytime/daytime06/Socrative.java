package practice.practice_daytime.daytime06;

public class Socrative {
    public static void main(String[] args) {

//2)
        short arr[] = new short[4];
       // arr[10,11,0,13];

        arr[0] = 10;

        arr[1] = 11;

        arr[3] = 13;

       // arr[10,11,0,13];==>4

   /* Yukaridaki kod ile ilgili asagidakilerden hangileri dogrudur?

    A) System.out.println(arr);

    Kodu ekrana {10,11,13} yazdirir.

    B.) System.out.println(arr[2]);

    Kodu ekrana 0 yazdirir.

    C.) System.out.println(arr[1] + arr[3]);11+13=24

    Kodu ekrana 24 yazdirir.

    D) System.out.println(arr.length());

    Kodu ekrana 4 yazdirir.
    */


        //20)

        int brr[] = {1, 3, 5, 7, 9};

        for (int w : brr) {

            System.out.print(w + " ");

            if (w > 4) {

                break;

            }
        }
    }
}


       /* Output nedir?
    A)    1 3 5.

    B)    1 3

    C)    1 3 5 7 9

    D)    None

        */