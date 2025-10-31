package chp09_Pkgs_Intefaces.interfacedemo.improved_stack;

public class InterfaceTest2 {
    public static void main(String[] args) {
        DynamicStack mystack1 = new DynamicStack(5);
        DynamicStack mystack2 = new DynamicStack(8);

        //push some numbers onto th stack
        for(int i=0; i<12; i++){
            mystack1.push(i);
        }
        for(int i =0; i<20; i++){
            mystack2.push(i);
        }

        //Pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for(int i =0; i<12; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for(int i =0; i<20; i++)
            System.out.println(mystack2.pop());
    }
}
