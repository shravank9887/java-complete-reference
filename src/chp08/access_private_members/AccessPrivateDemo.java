package chp08.access_private_members;

public class AccessPrivateDemo {
    public static void main(String[] args) {
        SubClassB subOb = new SubClassB();

        subOb.setij(10,12);

        subOb.sum();
        System.out.println("Total is : "+ subOb.total);
    }

}
