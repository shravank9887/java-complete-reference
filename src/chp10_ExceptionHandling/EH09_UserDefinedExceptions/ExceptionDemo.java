package chp10_ExceptionHandling.EH09_UserDefinedExceptions;

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Called Compute(" + a +")");
        if(a > 10)
            throw new MyException(a);
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        } catch(MyException e){
            System.out.println("Caught " + e);
        }
    }
}
