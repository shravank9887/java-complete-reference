package chp11_MultithreadedProgramming.MP02_CreateNewThread;

class ThreadDemo {

    public static void main(String[] args) {
        NewThread nt = new NewThread();

        Thread k = Thread.currentThread();

        System.out.println("Current thread: " + k);

        nt.t.start();

        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i) ;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting");
    }

}
