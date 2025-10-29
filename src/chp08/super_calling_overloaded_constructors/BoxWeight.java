package chp08.super_calling_overloaded_constructors;

public class BoxWeight extends Box {

    double weight; // specific to this subclass

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(double len, double m ){
        super(len);
        weight = m;
    }
}
