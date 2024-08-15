package DataTypes;

public class DataTypes {
    public static void main(String[] args)
    {
        //numeric data types
        int a=10,b=50;
        System.out.println("the value of a is : " + a);
        System.out.println("the value of b : " + b  );
        System.out.println("the sum is "+(a+b));

        byte c =125;
        System.out.println(c);

        Short d = 3535;
        System.out.println(d);


        long v = 1325364748366l;   //for float and long you must put literal im the end of the value l or L F or f
        System.out.println(v);


        //Decimal numbers
        float g = 15.5f;    //literal is needed F or f
        System.out.println(g);

        double x = 11551515151.666666;
        System.out.println(x);

        char grade ='A';
        System.out.println(grade);

        String name = "May";
        System.out.println(name);

        boolean b1 =true;
        System.out.println(b1);


        final long z= 333335555l;  //not changed in the future because of final or constant


        // relational operators less than , equal not equal between two data types
        //logical operators && ,||,! between only two boolean types

        int s =10;
        int res=s++; //post increment
        System.out.println(res);
        int ress=++s;
        System.out.println(ress); //pre-increment
        System.out.println(s);
        int f =9;                  //same for decrement
        int w= f++;
        System.out.println(w);
        System.out.println(f);





    }

}
