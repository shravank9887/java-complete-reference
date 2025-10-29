package b01classbasics;

public class Box6 {

    double width;
    double height;
    double depth;

    //set dimension of box
     Box6() {
         System.out.println("Constructing Box");
         width = 10;
         height = 10;
         depth = 10;
    }

    double volume(){
        return width * height * depth;
    }

}
