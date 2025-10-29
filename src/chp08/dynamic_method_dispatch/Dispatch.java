package chp08.dynamic_method_dispatch;

public class Dispatch {

    public static void main(String[] args) {
        A a = new A(); // Object of type A
        B b = new B(); // Object of type B
        C c = new C(); // Object of type C

        A r ; // Obtain a reference of type A

        r = a; // r refers to an A type Object
        r.callme(); //calls A's version of callme() method

        r = b; // r refers to a B type object
        r.callme(); // Calls B's version of callme() method

        r = c; // r refers to a C type object
        r.callme(); // Calls C's version of callme() method
    }
}
