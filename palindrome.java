import java.util.Scanner;
public class palindrome{
public static boolean palin(int a){
int b=a;
int c=0,r;
while(a!=0){
r=a%10;
c=c*10+r;
a=a/10;
}
if(c==b){
    return true;
}
return false;
}
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int a= sc.nextInt();
if(palin(a)){
    System.out.println(a + " is a palindrome number");
}
else
System.out.println(a + " is not a palindrome number");
}
}