public class Question1{
    public static void occcurence(int arr[],int n ,int key){
        if(n== arr.length){
            return;
        }
        if(key==arr[n]){
            System.out.println(n);
        }
        occcurence(arr,n+1,key);
    }
    public static void main(String args[]){
        int arr[]={3,4,5,2,3,56,3,7,3,32,3};

        occcurence(arr,0,3);
    }
}