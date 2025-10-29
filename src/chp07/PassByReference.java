package chp07;

public class PassByReference {
    int a , b;

    PassByReference(int i, int j){
        a = i;
        b = j;
    }

    //pass an object
    void meth(PassByReference o){
        o.a *= 2;
        o.b /= 2;
        System.out.println("a and b inside the method call as o.a and o.b :" + o.a + " " + o.b);
    }
}
