package chp07_methods;

public class StringDemo2 {

    public static void main(String[] args) {
        String strob1 = "Frist String";
        String strob2 = "Second String";
        String strob3 = strob1 ;

        System.out.println("Length of strob1 is :" + strob1.length());
        System.out.println("Char at index 3 of strob1 is : " + strob1.charAt(3));

        if(strob1.equals(strob2)){
            System.out.println(" strob1 == strob2");
        } else {
            System.out.println(" strob1 != strob2");
        }

        if(strob1.equals(strob3)){
            System.out.println(" strob1 == strob3");
        } else {
            System.out.println(" strob1 != strob3");
        }

    }

}
