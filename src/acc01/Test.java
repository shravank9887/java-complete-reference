package acc01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String key = "Coding on CodeChef";
        String[] arr = key.split(" ");
        for(String k : arr){
            System.out.println(k + " - " + k.length());
        }
        System.out.println(key + " - " + key.length());

        Scanner scanner = new Scanner(System.in);
    }
}
