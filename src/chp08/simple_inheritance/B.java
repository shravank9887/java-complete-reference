package chp08.simple_inheritance;

public class B extends A{
    int k;

    void showk(){
        System.out.println("K: " + k);
    }

    void sum(){
        System.out.println("i + j + k :" + (i+j+k));
    }
}
