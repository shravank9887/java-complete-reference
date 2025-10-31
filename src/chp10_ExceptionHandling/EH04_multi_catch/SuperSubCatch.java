package chp10_ExceptionHandling.EH04_multi_catch;

class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        } catch(Exception e){
            System.out.println("Exception : " + e);
       // } catch(ArithmeticException e){  //this will cause error
            System.out.println("Exception : " + e);
        }
        System.out.println("After try/catch blocks");
    }
}
