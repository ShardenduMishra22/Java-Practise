class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}

class Wolf extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Big Woof");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow(),
            new Wolf(),
        };

        for (Animal animal : animals) {
            animal.sound();
        }

    }
}