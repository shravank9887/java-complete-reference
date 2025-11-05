package chp11_MultithreadedProgramming.MP00_Practice.drill03;

class NewThread implements Runnable {
    Thread t;

    NewThread(){
        t = new Thread(this, "DemoThread");
        System.out.println("Child Thread");
    }

    public void run(){
        try{
            for(int i =5; i >0 ; i--){
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Child Thread interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}
