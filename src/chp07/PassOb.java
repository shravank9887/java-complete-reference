package chp07;

public class PassOb {
    public static void main(String[] args) {
        PassObTest ob1 = new PassObTest(100, 22);
        PassObTest ob2 = new PassObTest(100, 22);
        PassObTest ob3 = new PassObTest(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
