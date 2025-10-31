package chp07_methods;

public class CallByValue {
    void meth(int i, int j){
        i *= 2;
        j /= 2;

        System.out.println("a and b inside the method call as i and j :" + i + " " + j);
    }
}
