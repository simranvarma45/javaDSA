import java.util.Scanner;

public class Ternary {
 public static void main(String args[]){
int a= (5>3)? 5:3;
System.out.println(a);
int x=45;
String s = (x%2==0)? "even": "odd";
System.out.println(s);
Boolean c= ((6 & 7)!=7)? true: false;
System.out.println(c);
Scanner sc = new Scanner(System.in);
int marks= sc.nextInt();
String result= (marks>= 33)?"pass" : "fail";
System.out.println(result)  ;  

 }
}
