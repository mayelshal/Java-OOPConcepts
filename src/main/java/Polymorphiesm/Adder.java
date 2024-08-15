package Polymorphiesm;

// one thing has many forms
//polymorphism can be achieved through overloading in methods and constructors
//overloading >> create multiple methods with the same name but different params
public class Adder {
    int a = 2,b=4;
    void sum() //1
    {
        System.out.println(a+b);

    }

    void sum (int x,int y) //2
    {
        System.out.println(x+y);
    }
    void sum (double x,int y) //3
    {
        System.out.println(x+y);
    }
    void sum (int x,double y) //3
    {
        System.out.println(x+y);
    }
}
