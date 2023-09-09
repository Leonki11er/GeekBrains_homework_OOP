package Lesson1.task1;

public class Cat {
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
}


