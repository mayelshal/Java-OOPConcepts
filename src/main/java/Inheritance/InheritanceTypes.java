package Inheritance;
class A //parent
{
    int a = 10;
    void display()
    {
        System.out.println(a);
    }
}

class B  extends  A//child
{
    int b = 30;
    void Show()
    {
        System.out.println(b);
    }


}
class C extends B // multilevel inheritance
{
    int c = 300;
    void print()
    {
        System.out.println(c);
    }
}
public class InheritanceTypes {

    public static void main(String args[])
    {
        B bobj = new B();
        bobj.display();
        bobj.Show();

        C cobj = new C();

        cobj.a=45;
        cobj.display();
        cobj.Show();
        cobj.display();



    }
}
