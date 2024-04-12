class Student{
    String name;
    int roll;
    static String clgName="KNMIET";
    static int counter=0;
    Student (String name){
        this.name=name;
        this.roll=setRoll();
    }
    static  int setRoll(){
        counter++;
        return counter;
    }
    // static void setclgName(String name){
    //     clgName=name;
    // }
    
    void getStudentInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll no :" + this.roll);
        System.out.println("College Name : " + this.clgName);
    }
    }
    public class StaticDemo{
        public static void main(String args[]){

            Student s1=new Student("Simran");
            Student s2= new Student("khushi");
            Student s3= new Student("Muskan");
            // Student.setclgName("KNMIET");
            s1.getStudentInfo();
            s2.getStudentInfo();
            s3.getStudentInfo();
        }
    }
