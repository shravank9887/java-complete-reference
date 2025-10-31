package chp06_classbasics;

public class Box5 {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }

    //set dimension of box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
