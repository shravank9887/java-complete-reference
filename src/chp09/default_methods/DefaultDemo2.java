package chp09.default_methods;

class DefaultDemo2 {
    public static void main(String[] args) {

        MyInterfaceImp obj = new MyInterfaceImp();

        //method implemented in MyInterfaceImp
        System.out.println(obj.getNumber());

        //default method is used
        System.out.println(obj.getString());

        MyIFImp2 ob2 = new MyIFImp2();

        System.out.println(ob2.getString());

    }
}
