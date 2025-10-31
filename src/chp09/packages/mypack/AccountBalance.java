package chp09.packages.mypack;

class AccountBalance {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];

        current[0] = new Balance("S Kumar", -123.43);
        current[1] = new Balance("K Shankar", -13.69);
        current[2] = new Balance("P Manoj", -123.43);

        for(int i =0; i<3 ; i++) current[i].show();

    }
}
