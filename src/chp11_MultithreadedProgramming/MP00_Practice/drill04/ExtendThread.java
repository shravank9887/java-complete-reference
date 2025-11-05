package chp11_MultithreadedProgramming.MP00_Practice.drill04;

class ExtendThread {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();
        try{
            for(int i =5; i >0 ; i--){
                System.out.println("Main Thrad: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main Thread exiting");
    }
}
