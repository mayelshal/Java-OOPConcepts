package InterfaceDemo;


interface Shape
{
    int length = 10;  //final & static
    int width = 20;  //final & static

    void cirlce();  //abstract method as it is without body (implementation)
    default void square()
    {
        System.out.println("this is default method");
    }

    static void recatngle()
    {
        System.out.println("this is static method");
    }

}

public class InterfaceDemo implements Shape{
    @Override
    public void cirlce() {
        System.out.println("this is abstract method");

    }
    public static void main (String args[])
    {
        InterfaceDemo idobj =new InterfaceDemo();
        idobj.cirlce();
        idobj.square();



    }


}
