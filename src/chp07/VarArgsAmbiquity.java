package chp07;

public class VarArgsAmbiquity {



    static void vaTest(int ...v){
        System.out.print("VaTest(int ...v) : "+"Number of args: " + v.length + " Contents: ");

        for(int x: v){
            System.out.print(x + " ");
        }
        System.out.println();

    }

    static void vaTest(boolean ...v){
        System.out.print("VaTest(boolean ...v) : "+"Number of args: " + v.length + " Contents: ");

        for(boolean x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int ...v){
        System.out.print("VaTest(String, int ...v) : "+ msg + v.length + " Contents: ");

        for(int x: v){
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        vaTest(1,2,3);
        vaTest("four Arguments", 1,2,3,4);
        //vaTest(); // this methos will no compile
    }

}
