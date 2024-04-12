public class Power{
    //TC=O(n)
    // public static int print(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return x*print(x,n-1);
    // }
    //Optimized code TC=O(log n)
    public static int optimizedPower(int a , int n){
        if(n==0){
            return 1;
        }
        int half = optimizedPower(a,n/2);
        int halfSquare=half*half;
        if(n%2 != 0){
            halfSquare=a*halfSquare;
        }
        return halfSquare;
    }
    public static void main(String args[]){
     System.out.println(optimizedPower(2,5)) ;  
    }
}