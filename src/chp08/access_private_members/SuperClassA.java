package chp08.access_private_members;

public class SuperClassA {
    int i; // default access
    private int j ; // private to A

    void setij(int x, int y){
        i = x;
        j = y;
    }
}
