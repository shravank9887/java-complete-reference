package chp07;

public class BoxConsOveloadDemo {

    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is : " + vol);

        System.out.println("Volume of mybox2 is "+ mybox2.volume());

        System.out.println("Volume of mybox3 is "+ mybox3.volume());
    }

}
