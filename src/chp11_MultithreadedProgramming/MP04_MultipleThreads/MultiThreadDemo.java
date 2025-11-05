package chp11_MultithreadedProgramming.MP04_MultipleThreads;

class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("one");
        NewThread nt2 = new NewThread("two");
        NewThread nt3 = new NewThread("three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try{
            Thread.sleep(10000);
        } catch(InterruptedException e){
            System.out.println("Main Thread Interrutped");
        }
        System.out.println("Main Thread exiting");
    }
}
