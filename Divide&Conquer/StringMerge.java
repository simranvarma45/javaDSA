public class StringMerge{
public static String[] mergeSort(String arr[], int si ,int ei){
    if(si==ei){
        String A[]={arr[si]};
        return A;
    }
    int mid =si+(ei-si)/2;
    String arr1[]= mergeSort(arr,si,mid);
    String arr2[]= mergeSort(arr,mid+1,ei);
    String arr3[]=merge(arr1,arr2);
    return arr3;
}
  public static String[] merge(String arr1[],String arr2[])   {
    int m= arr1.length;
    int n= arr2.length;
    String temp[]=new String[m+n];
    int i=0;
    int j=0;
    int k=0;
    while(i<m && j<n){
        if(isTrue(arr1[i],arr2[j])){
            temp[k]=arr1[i];
            i++;
            k++;
        }
        else{
            temp[k]=arr2[j];
            j++;
            k++;
        }
                }
                while(i<m){

           temp[k++]= arr1[i++];

       }
               while(j<n){
                    temp[k++]=arr2[j++];
               }
               return temp;
           }
  
  public static boolean isTrue(String arr1, String arr2){
if(arr1.compareTo(arr2) < 0){
    return true;

}
return false;

  }
public static void print(String[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
}
public static void main(String args[]){
    String arr[]={ "sun", "mars", "jupiter","earth","mercury"};
    String a[]=mergeSort(arr,0,arr.length-1);
    print(a);
}

}
// public class StringMerge{
//     public static void mergeSort(String [] arr, int si,int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid = si + (ei-si)/2;
//         mergeSort(arr,si,mid);
//         mergeSort(arr,mid+1,ei);
//         merge(arr,si,mid,ei);
//     }
//     public static void merge(String arr[],int si,int mid,int ei){
//         String temp[]=new String [ei-si+1];
//         int i=si;
//         int j=mid+1;
//         int k=0;
//         while(i<=mid && j<=ei){
//             if (isTrue(arr[i],arr[j])){
// temp[k]=arr[i];
// i++;
// k++;
//             }
//             else {
//                 temp[k]=arr[j];
//                 k++;
//                 j++;
//             }
//         }
//         while(i<=mid){
//             temp[k++]=arr[i++];
//         }
//         while(j<=ei){
//             temp[k++]=arr[j++];
//         }
//         for(i=0,k=0;k<temp.length;k++,i++){
//             arr[i]=temp[k];
//         }
//     }
//     public static boolean isTrue(String arr1, String arr2){
// if(arr1.compareTo(arr2) < 0){
//     return true;

// }
// return false;
// }
// public static void print (String arr[]){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
// }
// public static void main(String args[]){
//     String arr[]={"sun","mars","earth","jupiter"};
//     mergeSort(arr,0,arr.length-1);
//     print(arr);
// }
// }