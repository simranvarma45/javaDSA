public class insertionSort{
    public static void insertion(int arr[]){
int key,prev;
       for(int i=1;i<arr.length; i++) {
        
key=arr[i];
prev=i-1;
//  while(prev>=0 && arr[prev]<key){
while(prev>=0 && arr[prev]>key){
    arr[prev+1]=arr[prev];
    prev--;
    
}

arr[prev+1]=key;
}

       }
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[]={34,22,21,20,19,18,17};
        insertion(arr);
        print(arr);
    }
}
