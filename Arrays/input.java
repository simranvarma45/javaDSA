import java.util.Scanner;
public class input{
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int marks[]=new int[5];
marks[0]=sc.nextInt();
marks[1]=45;
marks[2]=9;
for(int i=3;i<5;i++){
    marks[i]=sc.nextInt();
}
for(int i=0;i<5;i++){
   System.out.println ("Marks at index " + i + " is " + marks[i]);
}
marks[2]=marks[2]+10;
System.out.println(marks[2]);
System.out.println("The length of the array is "+ marks.length);

    }
}