import java.util.Scanner;
public class invertedHPnumbers{
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
for(int j=1;j<=(n+1)-i;j++){
System.out.print(j);
   }
// for(int k=1;k<=(i-1);k++){  // not mandatory but can be used 
// System.out.print(" ");
// }
System.out.println();
}
    }
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n =sc.nextInt();
pattern(n);
}
}