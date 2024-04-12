import java.util.Scanner;
public class DecToBin{
 public static void decbin(int n) {
int pow=0;
int num=0,r;
int mynum=n;
while(n>0){
r=n%2;
num=num+(int)(r*Math.pow(10,pow));
n=n/2;
pow++;

}
System.out.println("The decimal of "+ mynum + " is "+ num);

 }  
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
decbin(n);


 }
}