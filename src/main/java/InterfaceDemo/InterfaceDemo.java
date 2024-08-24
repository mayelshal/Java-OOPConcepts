package InterfaceDemo;


interface Shape {
    int length = 10;  //final & static
    int width = 20;  //final & static

    void cirlce();  //abstract method as it is without body (implementation)

    default void square() {
        System.out.println("this is default method");
    }

    static void recatngle() {
        System.out.println("this is static method");
    }

}

public class InterfaceDemo implements Shape {
    @Override
    public void cirlce() {
        System.out.println("this is abstract method");

    }

    void triangle()
    {
        System.out.println("this is triangle");
    }

    public static void main(String args[]) {
        //scenario 1
        InterfaceDemo idobj = new InterfaceDemo(); // object of child class stored in class variable
        idobj.cirlce();
        idobj.square();
        idobj.triangle();

        Shape.recatngle();



        //scenario 2
        Shape sh = new InterfaceDemo();  //object of child class stored in interface variable
        sh.cirlce(); //abstract
        sh.square(); //default

        //sh.triangle(); // you can not access from interface as it is not exist in interface


        Shape.recatngle(); //static method can directly access from interface without object
        System.out.println(Shape.length*Shape.width);

    }


}
