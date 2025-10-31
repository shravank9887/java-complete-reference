package chp09_Pkgs_Intefaces.interfacedemo.improved_stack;

public class InterfaceTest1 {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        //push some numbers onto th stack
        for(int i=0; i<5; i++){
            mystack1.push(i);
        }
        for(int i =0; i<8; i++){
            mystack2.push(i);
        }

        //Pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for(int i =0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for(int i =0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}
