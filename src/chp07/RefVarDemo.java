package chp07;

public class RefVarDemo {

    public static void main(String[] args) {
        var mc = new MyClass(10); // this kind of use of var is not recommended.
        // it will not make it easy to understand what is the type of the mc

        System.out.println("Value of i in mc is "+ mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc is now " + mc.geti());
    }

}
