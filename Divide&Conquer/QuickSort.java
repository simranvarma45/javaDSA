public class QuickSort{
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
int pivotIndex= partition(arr,si,ei);
        quickSort(arr,si,pivotIndex-1);
        quickSort(arr,pivotIndex+1,ei);
    
    }
    public static int partition(int arr[], int si, int ei){
        int pivot =arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
                
                arr[ei]=arr[i];
                arr[i]=pivot;

        return i;
    }
    public static void print(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={34,22,13,-1,13,67,89,56,43,27};
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}