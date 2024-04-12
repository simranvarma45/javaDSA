import java.util.Scanner;

class Two_four_pattern{
     static void pattern(int n){
    for(int i=1;i<=n;i++){
        if(i%2==0){
            System.out.print(" ");
            System.out.print("*");
            System.out.println("");
        }
        if(i%4==1){
            System.out.print("*");
            System.out.println("");
        }
        if(i%4==3){
            System.out.print("  ");
            System.out.print("*");
            System.out.println();
        }
        
    }
}

    public static void main(String args []){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        pattern(n);

    }
}