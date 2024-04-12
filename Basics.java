 import java.util.*;
 public class basics { 
public static void main(String args[]) { 
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b = sc.nextInt();
    int sum=a+b;
    System.out.println(sum);
for(int i=0;i<4;i++){
for(int j=4;j>i;j--){
    System.out.print("*");
}
System.out.print("\n");
}
}
 }
