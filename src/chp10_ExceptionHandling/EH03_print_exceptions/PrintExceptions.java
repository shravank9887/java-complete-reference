package chp10_ExceptionHandling.EH03_print_exceptions;

import java.util.Random;

class PrintExceptions {
    public static void main(String[] args) {
        int a = 0, b=0, c=0;
        Random r = new Random();

        for(int i =0; i < 10; i++){
            try{
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e){
                System.out.println("Exception: " + e);
                a = 0; //set a to zero and move on
            }

            System.out.println("Normal execution - a: " + a);
        }
    }
}
