package chp08.local_var_type_inference_simple;

public class InferenceDemo2 {
    public static void main(String[] args) {
        System.out.println("=== Example 1: Initializer is Dog type ===");
        var pet1 = new Dog();        // Initializer: "new Dog()"
        System.out.println("pet1 compile-time type: Dog (inferred by var)");
        System.out.println("pet1 runtime type: " + pet1.getClass().getSimpleName());
        System.out.println("pet1 instanceof Dog: " + (pet1 instanceof Dog));
        System.out.println("pet1 instanceof Animal: " + (pet1 instanceof Animal));
        pet1.makeSound();             // Works: prints "Woof!"
        pet1.wagTail();               // Works: Dog method is accessible
        System.out.println();

        System.out.println("=== Example 2: Initializer is Animal type ===");
        Animal myAnimal = new Dog();  // Dog object, but Animal reference
        var pet2 = myAnimal;         // Initializer: "myAnimal" (type Animal)
        System.out.println("pet2 compile-time type: Animal (inferred by var)");
        System.out.println("pet2 runtime type: " + pet2.getClass().getSimpleName());
        System.out.println("pet2 instanceof Dog: " + (pet2 instanceof Dog));
        System.out.println("pet2 instanceof Animal: " + (pet2 instanceof Animal));
        pet2.makeSound();            // Works: prints "Woof!"
        // pet2.wagTail();           // ERROR! pet2 is inferred as Animal type
        System.out.println("Can't call wagTail() - pet2 is Animal type at compile-time");
        System.out.println();

        System.out.println("=== Example 3: Method returning Animal type ===");
        var pet3 = getAnimal();      // Initializer: "getAnimal()" returns Animal
        System.out.println("pet3 compile-time type: Animal (inferred by var)");
        System.out.println("pet3 runtime type: " + pet3.getClass().getSimpleName());
        System.out.println("pet3 instanceof Dog: " + (pet3 instanceof Dog));
        System.out.println("pet3 instanceof Animal: " + (pet3 instanceof Animal));
        pet3.makeSound();            // Works
        // pet3.wagTail();           // ERROR! pet3 is inferred as Animal type
        System.out.println("Can't call wagTail() - pet3 is Animal type at compile-time");

        // Demonstrating the difference with explicit casting
        System.out.println("\n=== Casting to access Dog methods ===");
        if (pet2 instanceof Dog) {
            ((Dog) pet2).wagTail();  // This works with explicit cast
        }
        if (pet3 instanceof Dog) {
            ((Dog) pet3).wagTail();  // This works with explicit cast
        }
    }

    static Animal getAnimal() {
        return new Dog();  // Returns Dog object but as Animal type
    }
}
