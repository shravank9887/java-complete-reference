package chp10_ExceptionHandling.EH06_ThrowDemo;

class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("demo");  // create new throwable object using new
        } catch(NullPointerException e){
            System.out.println("Caught inside demoproc");
            throw e; // rethrow exception by obtaining throwable object using parameter in catch clause
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.println("Recaught: " + e);
        }
    }
}
