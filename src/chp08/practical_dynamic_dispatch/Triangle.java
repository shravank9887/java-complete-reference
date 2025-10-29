package chp08.practical_dynamic_dispatch;

 class Triangle extends Figure {

     Triangle(double a, double b){
         super(a,b);
     }

     double area(){
         System.out.println("Inside Area for Triangle");
         return dim1 * dim2 / 2;
     }
}
