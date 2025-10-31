package chp08_Inheritance.simple_method_overriding;

class C extends A{
    int k ;
    C(int a, int b, int c){
        super(a,b);
        k =c;
    }

    //access show() from A
    void show(){
        super.show(); //this call's show from A
        System.out.println("k : " + k);
    }
}
