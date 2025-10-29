package chp08.simple_method_overriding;

 class B extends A {

     int k ;

     B(int a, int b, int c){
         super(a,b);
         k = c;
     }

     //display k  - This overrides the show() in A
     void show(){
         System.out.println("k : " + k);
     }

}
