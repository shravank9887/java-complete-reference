package chp09_Pkgs_Intefaces;

public interface IFStaticMethod {

    int getNumber();

    default String getString(){
        return "Default String";
    }

    static int getDefaultNumber(){
        return 0;
    }

}
