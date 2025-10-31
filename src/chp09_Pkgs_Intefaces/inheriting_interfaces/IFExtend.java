package chp09_Pkgs_Intefaces.inheriting_interfaces;

class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
        //meth1 and meth2 is inherited by interfac B
        //so they are implemented by MyClass
        //and available for MyClass to call
    }
}
