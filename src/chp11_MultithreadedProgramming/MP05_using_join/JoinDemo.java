package chp11_MultithreadedProgramming.MP05_using_join;

class JoinDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is isAlive: " + nt1.t.isAlive());
        System.out.println("Thread Two is isAlive: " + nt2.t.isAlive());
        System.out.println("Thread Three is isAlive: " + nt3.t.isAlive());

        try{
            System.out.println("Waiting for Threads to finish");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch(InterruptedException e){
            System.out.println("Maint Thread Interrupted");
        }
        System.out.println("Thread One is isAlive: " + nt1.t.isAlive());
        System.out.println("Thread Two is isAlive: " + nt2.t.isAlive());
        System.out.println("Thread Three is isAlive: " + nt3.t.isAlive());
        System.out.println("Exiting Main Thread");
    }
}
