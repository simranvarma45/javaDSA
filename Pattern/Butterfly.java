import java.util.Scanner;
public class Butterfly{
public static void pattern(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++)
{
    System.out.print("*");
}
for(int k=1;k<=2*(n-i);k++){
System.out.print(" ");
}
for(int l=1;l<=i;l++){
    System.out.print("*");
}
System.out.println();
}
for(int i=n;i>=1;i--){
// for(int j=i;j>=1;j--){
// System.out.print("*");
// }
// for(int k=1;k<=2*(n-i);k++){
//     System.out.print(" ");
// }
// for(int l=i;l>=1;l--){
//     System.out.print("*");
// }
// System.out.println(" ");
// }
for(int j=1;j<=i;j++)
{
    System.out.print("*");
}
for(int k=1;k<=2*(n-i);k++){
System.out.print(" ");
}
for(int l=1;l<=i;l++){
    System.out.print("*");
}
System.out.println();
}
}
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n= sc.nextInt();
    pattern(n);
}
}