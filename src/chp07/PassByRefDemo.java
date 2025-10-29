package chp07;

public class PassByRefDemo {

    public static void main(String[] args) {
        PassByReference ob = new PassByReference(15, 20);

        System.out.println("ob.a and ob.b before call : " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call : " + ob.a + " " + ob.b);
    }
}
