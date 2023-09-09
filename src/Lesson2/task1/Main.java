package Lesson2.task1;
public class Main {
    public static void main(String[] args) {
        Lesson2.task1.Cat barsik = new Cat("Barsik", 8);
        Lesson2.task1.Owner galina = new Owner("Galina");
        barsik.Greet(galina);

        barsik.makeSound();
        barsik.goToKitchen();
        barsik.feedMeSound();
        barsik.naghtTygydyk();
    }
}
