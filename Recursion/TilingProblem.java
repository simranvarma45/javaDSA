public class TilingProblem{
public static int ways(int n){
    if(n==0||n==1){
        return 1;
    }
    // int vertical = ways(n-1);
    // int horizontal= ways(n-2);
    // int totalways=vertical + horizontal;
    // return totalways;
    return ways(n-1)+ ways(n-2);
}
public static void main (String args[]){
    System.out.println("Total number of ways are : " + ways(5));
}

}