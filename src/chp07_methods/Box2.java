package chp07_methods;

public class Box2 {
    double width;
    double height;
    double depth;

    //Box2 type as parameter
    Box2(Box2 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //All Dimensions
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //no Dimensions
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //cube constructor
    Box2(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
