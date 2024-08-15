package StringMethods;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args)
    {
        String s ="hello";
        //1-length() >> returns length of a string (no of characters)
        int l = s.length();
        System.out.println(l);

        //2-concat() + operator >> joining strings
        String s1 = "May ";
        String s2 ="Ahmed";
        System.out.println(s1+s2 );
        System.out.println(s1.concat(s2));
        System.out.println("May "+"Ahmed");

        //3-trim() >> remove spaces right and left side
        String s3 = "   welcome   ";
        System.out.println(s3.trim());

        //4-charAt() >> returns character from string based on index
        System.out.println(s2.charAt(0));

        //5-contains()  >> returns true or false
        System.out.println(s1.contains("a"));

        //6-equals() ,equalsIgnoreCase() >> compare strings
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("may ")); //case sensitive capital,space
        System.out.println(s1.equalsIgnoreCase("may "));

        //7-replace() >>replace single or multiple sequence of characters
        s="welcome to selenium java";
        System.out.println(s.replace('e','x'));
        System.out.println(s.replace("welcome","hello"));

        //8-substring()  >> extract substring from main string
        System.out.println(s.substring(0,3));
        //starting index 0, ending index starts from 1
        System.out.println(s.substring(0,1)); //this is like charAt() returns only one char

        //9-toUpperCase()  toLowerCase()
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //10-split()  >> split string into multiple parts based on delimiter(.,@,space,..)
        s="olamostafa@gmail.com";
        String a[]=s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(Arrays.toString(a));

        //ex1
        String amount ="$15,10,12";
        System.out.println(amount.replace(",","").replace("$",""));










    }
}
