package KeyWords;

public class KeyWords {
    int x,y;  //class variable


   void ThisKeyword(int a, int b)   //a,b local variables access only through method
    {
        x=a;
        y=b;

    }

    void sum (int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public static void main (String[]args )
    {

    }

}
