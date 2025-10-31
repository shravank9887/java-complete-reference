package chp09.access_example.p2;

import chp09.access_example.p1.Protection;

public class OtherPackage {

    OtherPackage(){
        Protection p = new Protection();
        System.out.println("Other package costructor");

        //default - class or package only
        //System.out.println("n = " + p.n);
        // private - class onl
       // System.out.println("n_pri = " + p.n_pri);
        // Class, sub-class/other pacakage sub-class or package only
       // System.out.println("n_pro = "+ p.n_pro);
        System.out.println("n_pub = "+ p.n_pub);
    }


}
