/**
 * Created by fish-Xiang on 2016/9/10.
 */
interface Singer {
    public void sing();
    public void sleep();
}

interface Painter {
    public void paint();
    public void eat();
}

class Student implements Singer {

    private String name;

    Student(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println("studying");
    }

    public String getName() {
        return name;
    }

    @Override
    public void sing() {
        System.out.println("singing");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}


class Teacher implements Singer, Painter {

    private String name;
    Teacher(String name) {
        this.name = name;
    }
    public String getString() {
        return name;
    }

    @Override
    public void sing() {
        System.out.println("teacher is sing");
    }

    @Override
    public void sleep() {
        System.out.println("teacher is sleeping");
    }

    @Override
    public void paint() {
        System.out.println("teacher is painting");
    }

    @Override
    public void eat() {
        System.out.println("teacher is eating");
    }
}


public class Person {
    public static void main(String[] args) {
        Singer s1 = new Student("name1");
        s1.sleep();
        s1.sing();
        Singer s2 = new Teacher("name2");
        s2.sing();
        s2.sleep();
        Painter p1 = (Painter) s2;
        p1.paint();
        p1.eat();


    }


}
