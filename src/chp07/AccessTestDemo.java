package chp07;

public class AccessTestDemo {

    public static void main(String[] args) {
        AccessTest ob = new AccessTest();

        ob.a = 10;
        ob.b = 20;

        // ob.c = 100; --> incorrect since c is private member

        ob.setc(100);

        System.out.println("a, b and c : " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
