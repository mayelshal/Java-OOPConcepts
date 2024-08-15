package Statements;

public class IfConditionDemo {
    public static void main(String[] args){
        int age = 13;
        if (age<=15)
            System.out.println("valid");

        int num = 15;
        if(num%2==0)
            System.out.println("num is even");
        else
            System.out.println("num is odd");
        if (num==0)
        {
            System.out.println("num is zero");
        }
        else if (num>0)
        {
            System.out.println("num is positive");


        }
        else
            System.out.println("num is negative");


        int a=10,b=20,c=60;
        if(a>b && a>c)
        {
            System.out.println("a is largest num" +a);
        } else if (b>a && b>c) {
            System.out.println("b is largest" +b);


        }
        else
            System.out.println("c is largest" +" "+ c);

//switch case8//

        int weekno = 4;
        switch (weekno) {
            case 1 :
                System.out.println("sunday");
                break;
            case 2 :
                System.out.println("monday");
                break;
            default:
                System.out.println("invalid");
        }

    }





}
