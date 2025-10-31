package chp08_Inheritance.simple_method_overriding;

public class Override2 {
    public static void main(String[] args) {
        C subOb = new C(1,2,3);
        subOb.show(); //This calls show in B
    }
}

