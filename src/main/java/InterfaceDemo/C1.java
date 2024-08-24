package InterfaceDemo;
// this is an example of multiple inheritance
public class C1 implements I1, I2 {
    public static void main(String args[]) {
        C1 obj = new C1();
        obj.m1();
        obj.m2();

    }

    @Override
    public void m1() {
        System.out.println(x);
    }

    @Override
    public void m2() {
        System.out.println(y);
    }
}
