import java.util.Scanner;
public class hollowRect{
public static void pattern(int m,int n)
{
for(int i=1;i<=m;i++){
    //Approach 1 -----

// if(i==1||i==m){
//     for(int j=1;j<=n;j++){
// System.out.print("*");
//     }
//     System.out.println();
    
// }
//     else{
// for(int k=1;k<=n;k++){
// if(k==1||k==n)
// {
//     System.out.print("*");
// }
// else{
//     System.out.print(" ");
//     }
// }
// System.out.println();
// } 

 

//Approach 2-----
for(int j=1;j<=n;j++){
if(i==1||i==m||j==1||j==n){
    System.out.print("*");
}
else{
    System.out.print(" ");
}
}
System.out.println();
}
}
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of m and n ");
int m=sc.nextInt();
int n = sc.nextInt();
pattern(m,n);
}
    }