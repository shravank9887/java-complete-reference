package chp10_ExceptionHandling.EH08_FinallyDemo;

class FinallyDemo {

    //throw an exception out of this method
    static void procA(){
        try{
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally{
            System.out.println("procA's finally");
        }
    }

    //return within a try blcck
    static void procB(){
        try{
            System.out.println("Inside procB");
            return;
        } finally{
            System.out.println("procB's finally");
        }
    }

    //Execute a Try block normallu
    static void procC(){
        try{
            System.out.println("Inside procC");
        } finally{
            System.out.println("procC's finally");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        } catch(Exception e){
            System.out.println("Exception caught");
        }

        procB();
        procC();

    }
}
