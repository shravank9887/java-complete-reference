package chp08_Inheritance.method_overloading;
public class Overload {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show("This is K : "); //This calls show in B
        subOb.show(); //This calls show in A
    }
}
