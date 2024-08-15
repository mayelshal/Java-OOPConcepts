package methods_varaibles;

//here we will create different methods and call them in the main class
public class Greetings {

    //1) no param- no return value
   void m1()
    {
        System.out.println("Hello");
    }

    //2)no params - return some value
    String m2()
    {
        return ("Hello how are you?");
    }

    //3)takes params- no return value
    void m3(String name)
    {
        System.out.println("hello"+name);
    }

    //4)takes params-returns value

    String m4(String name)
    {
        return ("hello"+name);
    }
}
