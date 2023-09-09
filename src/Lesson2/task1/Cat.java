package Lesson2.task1;
public class Cat implements IMove,ISpeak {
    private String name;
    private Integer age;
    Cat(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void Greet(Owner owner ){
        if (owner == null) System.out.println("Meow! My name is "+ name+ " .Im "+ age+" years old. Im homeless :'(");
        else System.out.println("Meow! My name is "+ name+ " .Im "+ age+" years old. My owner is "+owner.getName());
    }
    @Override
    public void goToKitchen(){
        System.out.println("something fluffy ran into the kitchen and stared at you with eyes full of hope");
    }

    @Override
    public void feedMeSound() {
        System.out.println("M-e-e-o-o-o-o-w! M-e-e-o-o-o-o-w! M-e-e-o-o-o-o-w! M-e-e-o-o-o-o-w!");
    }
}
