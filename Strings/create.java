import java.util.Scanner;
public class create{
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="simran verma";
        System.out.println(str.charAt(0));
        print(str);
        // System.out.println(str);
        // String str1=new String("simmi verma");
        // System.out.println(str1);
        // String str2=sc.next();
        // System.out.println(str2);
        // String str3=sc.nextLine();
        // System.out.println(str3);
        // System.out.println(str3.length());
        //concatenation
        // String name=str+str1;//string concatenation
        // System.out.println(name);
        // String fullname=str+ " "+ str1;//here we have three strings to concatenate
        // System.out.println(fullname);
    }
}