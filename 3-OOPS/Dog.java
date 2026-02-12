class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println(name + " says Woof");
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        Dog d = new Dog("Max", 3);
        d.bark();
        d.sound();
    }
}
