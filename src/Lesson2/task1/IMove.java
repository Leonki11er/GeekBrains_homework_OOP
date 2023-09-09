package Lesson2.task1;

public interface IMove {
    void goToKitchen();
    default void naghtTygydyk() {
        System.out.println("sounds of terrible noise in the night");
    }

}
