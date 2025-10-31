package chp09_Pkgs_Intefaces.interfacedemo.nested;

class B implements A.NestedIF{

    public boolean isNotNegative(int x){
            return x < 0 ? false : true;
    }
}
