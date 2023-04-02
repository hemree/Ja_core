package practice.practice_daytime.daytime08;

public abstract class TSE {
    public static void main(String[] args) {
      String malzeme = "Undan yapilir";

    }
   abstract void gramaj500();//childlari uymak zorunda
   abstract  void hijyenikOlma();

    void odunAtesindePiser(){
        System.out.println("TSE ekmekler odun atesinde piser");
    }
    void fiyat(){
        System.out.println("15 TL");
    }

}
