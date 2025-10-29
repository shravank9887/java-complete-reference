package chp08.local_var_type_inference_simple;

public class inferenceDemo {
    public static void main(String[] args) {
        // Example 1: Initializer is Dog type
        var pet1 = new Dog();        // Initializer: "new Dog()"
        pet1.makeSound();             // Works: prints "Woof!"
        pet1.wagTail();               // Works: Dog method is accessible

        // Example 2: Initializer is Animal type (superclass reference)
        Animal myAnimal = new Dog();  // Dog object, but Animal reference
        var pet2 = myAnimal;         // Initializer: "myAnimal" (type Animal)
        pet2.makeSound();            // Works: prints "Woof!"
        // pet2.wagTail();           // ERROR! pet2 is inferred as Animal type

        // Example 3: Method returning Animal type
        var pet3 = getAnimal();      // Initializer: "getAnimal()" returns Animal
        pet3.makeSound();            // Works
        // pet3.wagTail();           // ERROR! pet3 is inferred as Animal type
    }

    static Animal getAnimal() {
        return new Dog();  // Returns Dog object but as Animal type
    }
}
