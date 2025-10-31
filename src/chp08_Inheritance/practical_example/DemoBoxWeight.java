package chp08_Inheritance.practical_example;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2,3, 4, 0.076);
        ColorBox mybox3 = new ColorBox(3,5,6 , "red");
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is : " + vol);
        System.out.println("Weight of mybox1 is : " + mybox1.weight);
        System.out.println("Width of mybox1 is : " + mybox1.width);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is : " + vol);
        System.out.println("Weight of mybox2 is : " + mybox2.weight);
        System.out.println("height of mybox2 is : " + mybox2.height);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is : " + vol);
        System.out.println("Color of mybox3 is : " + mybox3.color);


    }

}
