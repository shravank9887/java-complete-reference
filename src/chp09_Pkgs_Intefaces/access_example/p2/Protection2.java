package chp09_Pkgs_Intefaces.access_example.p2;

public class Protection2 extends chp09_Pkgs_Intefaces.access_example.p1.Protection{
    Protection2(){
        System.out.println("Derived from other package constructor");

        //default - class or package only
        //System.out.println("n = " + n);
        // private - class onl
        //System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = "+ n_pro);
        System.out.println("n_pub = "+ n_pub);
    }
}
