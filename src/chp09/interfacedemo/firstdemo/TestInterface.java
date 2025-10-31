package chp09.interfacedemo.firstdemo;

public class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
