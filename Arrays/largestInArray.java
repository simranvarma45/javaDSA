public class largestInArray{
    public static int largest(int array[]){
        // int n=array[0];
        int n=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
    if(n<array[i]){
        n=array[i];
    }
}
return n;
    }
    public static int smallest(int array[]){
        // int n=array[0];
        int n=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
    if(n>array[i]){
        n=array[i];
    }
}
return n;
    }
    public static void main(String args[]){
int array[]={45,923,45,23,79,88,23,1,78};
System.out.println(largest(array) + " is the largest element");
System.out.println(smallest(array) + " is the smallest element");

    }
}