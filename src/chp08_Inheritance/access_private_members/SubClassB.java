package chp08_Inheritance.access_private_members;
/*
In class hierarchy, private member remain private to their class
This will not execute.*/
public class SubClassB extends SuperClassA{

    int total;

    void sum(){
        //total = i + j; //ERROR j is not accessible here
    }
}
