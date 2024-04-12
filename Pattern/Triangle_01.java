import java.util.Scanner;
public class Triangle_01{
public static void pattern(int n){
int k=1;
for(int i=1;i<=n;i++){
for (int j=1;j<=i;j++){
if((i+j)%2==0){
    System.out.print(1);
}
else 
System.out.print(0);
}

System.out.println();
}

}
public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    pattern(n);
}

}