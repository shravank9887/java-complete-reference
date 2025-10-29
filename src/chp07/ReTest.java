package chp07;

public class ReTest {
    int a;

    ReTest(int i){
        a = i;
    }

    ReTest incrByTen(){
        ReTest temp = new ReTest(a + 10);
        return temp;
    }
}
