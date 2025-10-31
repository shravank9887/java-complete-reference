package chp09.interfacedemo.firstdemo;

class AnotherClient implements Callback {

    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("P suquared is " + (p*p));
    }
}
