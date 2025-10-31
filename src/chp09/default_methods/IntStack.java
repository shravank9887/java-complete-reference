package chp09.default_methods;

interface IntStack {

    void push(int item);
    int pop();

    default void clear(){
        System.out.println("clear() not implemented");
    }
}
