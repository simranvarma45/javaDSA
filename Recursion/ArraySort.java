public class ArraySort{
    public static boolean check(int arr[],int n){
        if(n== arr.length-1){
            return true;
        }
        // if(arr[n]>=arr[n+1]) -- for ascending sorting
        if(arr[n]>=arr[n+1]){
            return check(arr,n+1);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]= {4,4,3,2,1};
        System.out.println(check(arr,0));

    }
}