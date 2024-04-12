
public class Constructor{
    public static void main(String args[]){
Student s1=new Student();
 Student s2= new Student("simran");
 Student s3= new Student("simmi",23);
    }
}
class Student{
    String name;
    int roll_no;
    Student(){//Non-parameterized constructor
        System.out.println("constructor is called!!");
    }
    Student (String name){//Parameterized constructor
        this.name = name;
        System.out.println("Second constructor is called");

    }
    Student(String name, int roll_no){
        this.name=name;
        this.roll_no=roll_no;
        System.out.println("third constructor invoked");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
    }

}