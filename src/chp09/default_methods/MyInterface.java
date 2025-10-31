package chp09.default_methods;

public interface MyInterface {
    //normal interface method
    int getNumber();

    //default method
    default String getString(){
        return "Default String";
    }
}
