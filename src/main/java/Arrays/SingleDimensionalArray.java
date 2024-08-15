package Arrays;

public class SingleDimensionalArray {
    public static void main(String []args){

        //1-declare the array
        int a[]=new int[5];

        //2-add(store) value into array
        //first approach  fixed size of array
         a[0]=30;   //starts from zero index
         a[1]=40;
         a[2]=50;
         a[3]=60;
         a[4]=70;  //n-1  5-1=4

        //second approach
        int b[]={2,3,4,8,9,10};

        //3-size or length of array
        System.out.println("length is " + b.length);
        //4-read single value of an array
        System.out.println(a[4]);  // 4 id an index

        for (int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);

        }

        //enhanced for loop
        /*for (int x:a)
        {
            System.out.println(x);
        }*/





    }
}
