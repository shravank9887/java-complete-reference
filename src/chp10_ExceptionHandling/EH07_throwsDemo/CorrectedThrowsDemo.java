package chp10_ExceptionHandling.EH07_throwsDemo;

class CorrectedThrowsDemo {
        static void throwone() throws IllegalAccessException {
            System.out.println("Inside throwOne");
            throw new IllegalAccessException("Demo");
        }

        public static void main(String[] args) {
            try{
                throwone();
            }catch(IllegalAccessException e){
                System.out.println("Caught " + e);
            }

        }
}


