class Pet {          // pet is a class name 

    String name;
    String species;
    int age;

    // Constructor
    Pet(String name, String species, int age) {

        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Display details
    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }

    // Human years Calculate
    int calculateHumanYears() {

        return age * 7;
    }
}

// Dog subclass
class Dog extends Pet {

    String favouriteToy;

    Dog(String name, int age, String favouriteToy) {

        super(name, "Dog", age);

        this.favouriteToy = favouriteToy;
    }

    void displayDetails() {

        super.displayDetails();

        System.out.println("Favourite Toy: " + favouriteToy);

        System.out.println("Human Years: " + calculateHumanYears());
    }
}

// Bird subclass
class Bird extends Pet {

    double wingSpan;

    Bird(String name, int age, double wingSpan) {

        super(name, "Bird", age);

        this.wingSpan = wingSpan;
    }
 
    
    void displayDetails() {

        super.displayDetails();

        System.out.println("Wing Span: " + wingSpan + " cm");

        System.out.println("Human Years: " + calculateHumanYears());
    }
}

// Main class
public class PetDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Mark", 3, "Ball");

        Bird bird = new Bird("Parrot", 2, 24.3);

        Pet[] pets = {dog, bird};

        for (Pet p : pets) {

            System.out.println("Pet Details ");

            p.displayDetails();

            System.out.println();
        }
    }
}