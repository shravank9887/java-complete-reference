package chp09_Pkgs_Intefaces.default_methods;

class MyInterfaceImp implements MyInterface {

    public int getNumber(){
        return 100;
    }
    //only getNumber is implemented,
    // getString() is allowed to default;
}
