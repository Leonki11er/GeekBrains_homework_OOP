package Lesson2.task1;

public interface ISpeak {
    void feedMeSound();
    default void makeSound(){
        System.out.println("Meow");
    }
}
