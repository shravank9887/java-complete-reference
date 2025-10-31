package chp09_Pkgs_Intefaces.interfacedemo.firstdemo;

 class Client implements Callback{
     public void callback(int p ){
         System.out.println("callback method called with " + p);
     }

     void nonIfaceMeth(){
         System.out.println("Classes that implement interface " +
                        "may also define other memebers, too.");
     }
}
