 import java.util.Scanner;
 public class reverseNum{ 
public static void main(String args[]) { 
Scanner sc = new Scanner (System.in);
int num=sc.nextInt();
System.out.println("The original number is : "+ num);
int rev=0;
int rem;
for(int i =0; num!=0;i++){
rem=num%10;
System.out.print(rem);
// rev=rev*10 + rem;
num=num/10;
}
// System.out.println("Reverse of the number is : " + rev);
} 
}