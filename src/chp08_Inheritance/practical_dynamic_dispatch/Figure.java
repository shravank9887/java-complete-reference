package chp08_Inheritance.practical_dynamic_dispatch;

 class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("Area of Figure is undefined");
        return 0;
    }
}
