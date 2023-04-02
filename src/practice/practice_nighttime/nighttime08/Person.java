package practice.practice_nighttime.nighttime08;

public abstract class Person {
    public void Person() {
        long humanPopulation=80000;
        System.out.println(humanPopulation);
    }
    abstract void learn();

    void eat(){
        System.out.println("Insanlar yer");
    }
    void drink(){
        System.out.println("Insanlar icer");
    }

}
