package chp09.default_methods;

class DefaultMethodDemo {
    public static void main(String[] args) {

        MyInterfaceImp obj = new MyInterfaceImp();

        //method implemented in MyInterfaceImp
        System.out.println(obj.getNumber());

        //default method is used
        System.out.println(obj.getString());

    }
}
