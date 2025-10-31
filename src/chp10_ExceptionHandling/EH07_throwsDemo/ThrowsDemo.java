package chp10_ExceptionHandling.EH07_throwsDemo;

class ThrowsDemo {
    static void throwone(){
        System.out.println("Inside throwOne");
       // throw new IllegalAccessException("Demo");
    }

    public static void main(String[] args) {
        throwone();
    }
}
