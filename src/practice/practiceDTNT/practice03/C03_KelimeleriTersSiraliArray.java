package practice.practiceDTNT.practice03;

public class C03_KelimeleriTersSiraliArray {
   /*
   INTERWIEW SORUSU
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
        Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
        tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
                */

    public static void main(String[] args) {

        String str= "       Kemal Can Kuzu         ";
        String arr[] =str.split(" ");
        String tersstr= "";

        for (int i = arr.length - 1; i >= 0;                 i--) {
            tersstr+=arr[i]+" ";

        }

        System.out.print("trim basta ise yaradimi");
        System.out.print(tersstr);
        System.out.println("trim sonda ise yaradimi");

        System.out.print("trim basta ise yaradimi");
        System.out.print(tersstr.trim());
        System.out.println("trim sonda ise yaradimi");







    }//main
}//class
