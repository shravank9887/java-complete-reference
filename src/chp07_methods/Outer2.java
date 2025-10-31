package chp07_methods;

public class Outer2 {

    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10; // y is local to Inner class

        void display(){
            System.out.println("Display: outer_x = " + outer_x);
        }
    }

    void showy(){
       // System.out.println(y); // shows error y is not access to outer class
    }

}
