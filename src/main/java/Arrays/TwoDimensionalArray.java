package Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        //1-declaration
        //first approach
        int a[][] = new int[3][2];
        a[0][0] = 1;  //first row
        a[0][1] = 2;

        a[1][0] = 3;  //second row
        a[1][1] = 4;

        a[2][0] = 5;
        a[2][1] = 6;   //third row


        //second approach
        int b[][] =
                {
                        {30, 60}, //first row
                        {50, 70}  //second row
                };

        System.out.println("rows "+a.length);
        System.out.println("columns "+a[0].length);
        System.out.println(b[0][1]);

        //read values
        //nested for loop
        for (int i=0;i<b.length;i++)
        {
            for (int y=0;y<b[i].length;y++)
            {
                System.out.print(b[i][y]+" ");
            }
            System.out.println();
        }

        //object array

        Object x []={0,true,"welcome",10.5}; //store different types of data

    }
}
