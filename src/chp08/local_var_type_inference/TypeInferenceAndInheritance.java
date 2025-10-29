package chp08.local_var_type_inference;

class TypeInferenceAndInheritance {

    //Return some type of MyClass Object
    static MyClass getObj(int which) {
        switch (which) {
            case 0:
                return new MyClass();
            case 1:
                return new FirstDerivedClass();
            default:
                return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        /*
        * Even though getObj() returns different types of objects
        * within the MyClass Inheritance Hierarchy, its declared return type is MyClass.
        * As a result, in all the three cases shown here, the type of the variables is inferred
        * to eb MyClass, even though, different derived types of objects are obtained.
        * */

        //Here, getObj() returns a MyClass Object
        var mc = getObj(0);

        //A FirstDerivedClass object is returned
        var mc2 = getObj(1);

        //A SecondDerivedClass object is returned
        var mc3 = getObj(2);

        /*
        * Because the types of both mc2 and mc3 are inferred as MyClass,
        * (because the return type of getObj() is MyClass), neither mc2 nor mc3
        * can access the fields declared by FirstDerivedClass or SecondDerivedClass
        * * */
        //mc2.x = 10;  // Compile time error - MyClass does not have an x field.
        //mc3.y = 11;  // Compile time error - MyClass does not have a y field.

    }

}
