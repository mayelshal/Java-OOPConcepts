package methods_varaibles;

public class StudentMain {
    public static void main(String[] args)
    {
        //Student s1 = new Student();
        //1)using object reference variables
      /*  s1.id=101;
        s1.name="may";
        s1.grade='A';
        s1.printStudentData();*/

        //2)using method
    /*    s1.setStudentData(102,"mona",'B');
        s1.printStudentData();*/

        //3)using constructor
        Student s1 = new Student(101,"lila",'A');
        s1.printStudentData();
    }
}
