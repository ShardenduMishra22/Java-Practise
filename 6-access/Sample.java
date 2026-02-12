class Animal {
    public String species;          // PUBLIC: accessible everywhere
    protected void eat() {          // PROTECTED: accessible in same package & subclasses
        System.out.println("eat");
    }
    @SuppressWarnings("unused")
    private void sleep() {          // PRIVATE: accessible only within Animal class
        System.out.println("sleep");
    }
}

class Dog extends Animal {
    public String breed;            
    private String name;            

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public void demonstrateAccess() {
        eat();
        species = "Canine";
    }
}

public class Sample {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.breed = "Labrador";
        d.species = "Canine";
        
        d.setName("Max");
        d.printName();
        d.eat();
        
        d.demonstrateAccess();
    }
}
