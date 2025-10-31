package chp08_Inheritance.simple_method_overriding;

class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show(); //This calls show in B
    }
}
