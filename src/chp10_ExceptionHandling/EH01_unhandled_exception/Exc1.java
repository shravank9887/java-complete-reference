package chp10_ExceptionHandling.EH01_unhandled_exception;

class Exc1 {

    static void subroutine(){
        int d = 0;
        int a = 42/d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}
