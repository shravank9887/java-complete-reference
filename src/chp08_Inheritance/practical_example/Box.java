package chp08_Inheritance.practical_example;

public class Box {

    double width;
    double height;
    double depth;

    //Box2 type as parameter
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //All Dimensions
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //no Dimensions
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //cube constructor
    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }

}
