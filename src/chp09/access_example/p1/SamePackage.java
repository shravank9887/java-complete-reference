package chp09.access_example.p1;

public class SamePackage {

    SamePackage(){
        System.out.println("same package constructor - start");
        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);

        //Private member - can be access in same class only
        //System.out.println("n_pri = " + p.n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);

    }
}
