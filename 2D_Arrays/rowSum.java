public class rowSum{
    public static void sum(int arr[][],int n){
      int sum=0;
      for(int j=0;j<arr[0].length;j++)  {
        sum+=arr[n][j];
      }
      System.out.println("The sum of "+n+"th row is :"+ sum);
    }
    public static void main(String args[]){
        int arr[][]={{2,4,5,6},
        {5,7,6,4},
        {5,34,55,67},
        {87,56,23,55}
        };
        sum(arr,2);
    }
}