package methods_varaibles;
//contains main method
public class GreetingsMain {
    public static void main(String[] args)
    {
        //first create an object to call/invoke the method
        Greetings gr =new Greetings();
        gr.m1();  // no params no return value
        String s =gr.m2(); //variable required as it returns value
        System.out.println(s);

        gr.m3("  Ahmed"); //passing the param

        String var=gr.m4("Ahmed");
        System.out.println(var);
    }
}
