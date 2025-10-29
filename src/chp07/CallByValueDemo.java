package chp07;

public class CallByValueDemo {

    public static void main(String[] args) {
        CallByValue ob = new CallByValue();

        int a = 15, b = 20;

        System.out.println("a and b before call :" + a + " " + b);

        ob.meth(a,b);

        System.out.println("a and b after call: " + a + " "+ b);
    }
}
