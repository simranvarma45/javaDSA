 import java.util.Scanner;
public class calculator {

  public static void main(String args[])
  {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the value of a ");
int a= sc.nextInt();
System.out.println("Enter the value of b ");
int b= sc.nextInt();
System.out.println("Enter the operation you want to perform");
char op = sc.next().charAt(0);
switch(op){
case '+': System.out.println("The value of a and b after addition is : " +(a+b) );
break;
case '-': System.out.println("The value of a and b after subtraction is : " +(a-b));
break;
case '*': System.out.println("The value of a and b after multiplication is : " +(a*b));
break;
case '/': System.out.println("The value of a and b after division is : " +(a/b));
break;
case '%' : System.out.println("The value of a and b after modulos is : " +(a%b));
break;
default : System.out .println("cannot calculate !!");
}

  }  
}
