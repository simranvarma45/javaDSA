public class FirstOccArray{
    public static int searchFirstOccurence(int [] arr,int n , int element){
    //   if(n== arr.length-1 && arr[n]!= element){
        if(n==arr.length){
        return -1;
      }
      if(arr[n]== element){
        return n;
      }
      return searchFirstOccurence(arr,n+1,element);

    }
    //   public static int searchLastOccurence(int [] arr,int n , int element){
    //   if(n== 0 && arr[n]!= element){
    //     return -1;
    //   }
    //   if(arr[n]== element){
    //     return n;
    //   }
    //   return searchLastOccurence(arr,n-1,element);

    // }
    public static int searchLastOccurence(int [] arr,int n , int element){
      if(n==arr.length){
        return -1;
      }
      int isFound=searchLastOccurence(arr,n+1,element);
      if(isFound== -1 && arr[n]== element){
        return n;
      }
      return isFound;

    }
    
    public static void main(String args[]){
        int arr[]={23,1,27,77,65,89,65,77,77,43,90};
        int a=searchFirstOccurence(arr,0,43);
        System.out.println("First occurence is : " + a);
        //  int b=searchLastOccurence(arr,arr.length-1,43);
        int b = searchLastOccurence(arr,0,77);
        System.out.println("Last occurence is : " + b);
    }
}