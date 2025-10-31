package chp07_methods;

public class TestStack2 {
    public static void main(String[] args) {

        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

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

        // mystack1.tos=2;
        //  mystack2.stck[3] = 100;

    }
}
