package methods_varaibles;

public class ConstructorDemo {
    int x,u;
    ConstructorDemo()  //default no params
    {
        x=1;
        u=2;
    }

        ConstructorDemo(int a ,int b)  //paramterized constructor

        {
            x=a;
            u=b;
        }

        void sum()
        {
            System.out.println(x+u);
        }
        public static void main(String[] args)
        {
            ConstructorDemo s1 = new ConstructorDemo(3,7);
            s1.sum();
        }
}
