package Statements;

public class LoopStatementsDemo {
    public static void main(String args[]){
        int i=1;   //initialization
        while (i <= 10) //condition
        {
            System.out.println(i);
            i++;        //increment
        }
        int x =1;
        while (x <= 10)
        { if (x%2==0)
            {
                System.out.println(x);
            }
            x++;}


        //do while loop
        int y =1;
        do {
            System.out.println(y);
            y++;
        }
        while (y <=10);

        //for loop
        for (i=1;i<=10;i++)
        {
            System.out.println(i);
        }

}}
