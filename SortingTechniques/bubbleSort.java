public class bubbleSort{
public static void bubble(int arr[]){
    int swap=0;
    for(int i=0;i<arr.length -1;i++){
        
        for(int j=0;j<arr.length - 1 - i; j++){
    //Ascending Sorting
            // if(arr[j]>arr[j+1]){
            //     int k =arr[j];
            //     arr[j]=arr[j+1];
            //     arr[j+1]=k;
            //     swap++;
            // }
            //Descending Sorting
            if(arr[j]<arr[j+1]){
                int k =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=k;
                swap++;
            }
            }
            if(swap==0){
                System.out.println("Array is already sorted");
                break;
        }
        
    }
}
//best case time complexity - O(n)--when array is already sorted
//worst case time complexity - O(n^2)
public static void print(int arr[]){
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}
public static void main(String args[]){
    // int arr[]={34,22,55,2,22,34,6,22,78};
    int arr[]={1,2,3,4,5,6};
    
    bubble(arr);
    print(arr);
    
}
}