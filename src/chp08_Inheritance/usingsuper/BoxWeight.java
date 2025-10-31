package chp08_Inheritance.usingsuper;

public class BoxWeight extends Box {

    double weight; //weight of the box

    //Constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d); //call Superclass constructor
        weight = m;
    }
}
