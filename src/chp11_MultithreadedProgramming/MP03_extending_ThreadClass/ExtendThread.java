package chp11_MultithreadedProgramming.MP03_extending_ThreadClass;

class ExtendThread {

    public static void main(String[] args) {
        NewThread nt = new NewThread();

        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t);

        nt.start();

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: " +i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Exiting Main Thread");
    }
}
