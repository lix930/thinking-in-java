/**
 * Created by fish-Xiang on 2016/9/9.
 */

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        // eat peeled apple
        System.out.println("Yummy!");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // peel the apple
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
