package chp08_Inheritance.practical_example;

public class RefDemo {

    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5,7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is: " + vol);
        System.out.println("Weight of weightbox is: " + weightbox.weight);
        System.out.println();

        //assign weightbox object reference to plainbox reference variable
        plainbox = weightbox;

        vol = plainbox.volume(); // works, since volume() is defined in Box superclass
        System.out.println("Volume of plainbox is: "+ vol);
        System.out.println("Width of plainbox is: " + plainbox.width);
        System.out.println("Height of plainbox is: " + plainbox.height);
        System.out.println("Depth of plainbox is: " + plainbox.depth);
        // Will not compile since weight instance variable is not known or defined in Box superclass
        //System.out.println("Depth of plainbox is: " + plainbox.weight);

    }

}
