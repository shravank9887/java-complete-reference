package chp07_methods;

public class RetOb {

    public static void main(String[] args) {
        ReTest ob1 = new ReTest(2);
        ReTest ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increment : " + ob2.a);
    }
}
