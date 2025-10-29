package chp07;

public class VarArgs2 {

    static void vaTest(String msg, int ...v){
        System.out.print(msg + v.length + " Contents: ");

        for(int x: v){
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        vaTest("one arugment",10);
        vaTest("four argumnets ",1, 2,3,4);
        vaTest("No args");
    }

}
