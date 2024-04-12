public class CopyCons{
public static void main(String args[]){
Student s1=new Student();
s1.name="simran";
s1.roll=45;
s1.password="abcdef";
s1.marks[0]=99;
s1.marks[1]=87;
s1.marks[2]=65;
Student s2= new Student(s1);
System.out.println(s2.password + " " + s2.name + " "+ s2.roll);
s1.name="simmmi";//not going to change in s2
s1.marks[1]=88;//changes will happen in s2 in case of shallow copy
for(int i=0;i<3;i++){
    System.out.print(s2.marks[i]+ " ");
}
// s1.marks[1]=70; not change in s2
}
}
class Student{
    String name;
    int roll;
    String password;
    int marks[]=new int[3];
    // Student(Student s1){--Shallow copy Constructor - by default cloning or copy constructor is shallow
    //     this.name = s1.name;
    //     this.roll=s1.roll;
    //     this.password="sim444";
    //     this.marks=s1.marks;
    // }
    //Deep copy - applied by programmer as this is not the default behaviour of compiler
    Student(Student s1){
        this.name = s1.name;
        this.roll=s1.roll;
        this.password="sim444";
        for(int i =0; i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }

//Lazy Copy - combination of both deep and shallow copy 
//initially shallow copy approach is followed . later in , 
//deep copy is applied whenever needed
    Student(){
System.out.println("constructor called");
    };
}