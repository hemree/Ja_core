package practice.practice_daytime.daytime08;

public class BagetEkmek extends TSE{

    public static void main(String[] args) {

        BagetEkmek baget = new BagetEkmek();
        baget.fiyat();//15
        baget.odunAtesindePiser();//TSE ekmekler odun atesinde piser
        baget.hijyenikOlma();
        baget.gramaj500();
    }
    @Override
    void gramaj500() {
        System.out.println("Baget ekmek 500gr olmali");
    }

    @Override
    void hijyenikOlma() {
        System.out.println("Baget ekmek hijyenik olmali");
    }
}
