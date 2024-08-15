package DataTypes;

public class TernaryOperators {
    public static void main(String[] args)
    {
        //synrax: var=expression ? result1:result2; lw true hyakhod result1 else result2
        //ternary=conditional

        int a =200,b=50;
        int x = (a>b)? a:b;
        System.out.println(x);

        int person_age= 30;
        String res = (person_age >18) ? "eligible":"Not eligible";
        System.out.println(res);



        int num1 = 10;
        int num2 = 20;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }


}
