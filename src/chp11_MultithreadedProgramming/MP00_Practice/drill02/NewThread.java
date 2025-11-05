package chp11_MultithreadedProgramming.MP00_Practice.drill02;

class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this, "demoThrad");
        System.out.println("Child Thread " + t);
    }

    public void run(){
        try{
            for(int i =5; i > 0; i--){
                System.out.println("Child Thread " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}
