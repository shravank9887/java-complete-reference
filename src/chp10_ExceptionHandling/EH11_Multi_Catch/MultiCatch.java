package chp10_ExceptionHandling.EH11_Multi_Catch;

class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b=0;
        int[] vals = {1,2,3};

        try{
            int result =  a / b; //generates ArithmeticException

            //vals[10] = 19; // generates ArrayIndexOutOfBoundsException

        }catch(ArithmeticException| ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }
    }
}
