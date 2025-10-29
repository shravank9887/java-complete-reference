package chp08.practical_dynamic_dispatch;

 class Rectangle extends Figure {

    Rectangle(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("Inside Area for Rectange");
        return dim1 * dim2;
    }

}
