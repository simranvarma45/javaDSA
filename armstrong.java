import java.util.Scanner;
 public class armstrong{
    public static boolean armstng(int a){
int b=a;
int c=0,r,count=0;
while(a!=0){
    a=a/10;
    count++;
}
a=b;
while(a!=0){
    r=a%10;
    c=c+(int) (Math.pow(r,count));
    a=a/10;
}
if(c==b)
{
    return true;
}
return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(armstng(a)){
            System.out.println(a + " is a armstrong number");
        }
        else 
        System.out.println(a +" is not a armstroong number");
    }
 }