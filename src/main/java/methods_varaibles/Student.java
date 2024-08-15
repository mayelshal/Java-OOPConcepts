package methods_varaibles;
//variables class
public class Student {

    //class variables access through the class
    int id;
    String name;
    char grade;
    void printStudentData()
    {
        System.out.println(id+" "+name+" "+grade);
    }

    //local variables access through the method only
    void setStudentData(int sid,String Sname,char sgrade)
    {
        id=sid;
        name=Sname;
        grade=sgrade;
    }

    //Constructor to initialize the data
    Student(int sid,String Sname,char sgrade)
    {
        id=sid;
        name=Sname;
        grade=sgrade;
    }
}
