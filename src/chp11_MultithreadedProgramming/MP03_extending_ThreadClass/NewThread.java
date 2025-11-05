package chp11_MultithreadedProgramming.MP03_extending_ThreadClass;

class NewThread extends Thread{

    NewThread(){
        super("Demo Thread");
        System.out.println("Child Thread : " + this);
    }

    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Exiting child Thread");
    }
}
