package OOP;

public class Employee {

    //employee is a class that has variables and methods
    //group of objects

    //variables
    int eid;
    String ename;
    String job;
    int sal;

    //methods
    //you should spicfy the output type (return type) if it does not return anything then void
    void display() {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }


    public static void main(String[] args) {
        Employee emp1 = new Employee();   //this is an object has same variables and methods of the class
        emp1.eid=101;
        emp1.ename="john";  //assign data to the variables
        emp1.job="engineer";
        emp1.sal=1000;
        emp1.display(); //method

        System.out.println("the second object");


        Employee emp2 = new Employee();
        emp2.eid=102;
        emp2.ename="mona";
        emp2.job="dr";
        emp2.sal=2000;
        emp2.display();
    }
}
