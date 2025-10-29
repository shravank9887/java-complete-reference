package chp08.abstract_simple_demo;

abstract class A {
    abstract void callme();

    //concrete method are still allowed in abstract classes
    void callmetoo(){
        System.out.println("This is a concrete method inside abstract superclass A");
    }
}
