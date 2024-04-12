// // //Brute Force Approach -- TC = O(n^2)
// // // public class InversionCount{
// // //     public static int count(int arr[]){
// // //         int count=0;
// // //         for (int i=0;i<arr.length;i++){
// // //             for(int j=i+1;j<arr.length;j++){
// // //                 if(arr[i]>arr[j]){
// // //                     count++;
// // //                     System.out.println("(" + arr[i] + ","+ arr[j]+ ")");
// // //                 }
// // //             }
// // //         }
// // //         return count;
// // //     }
// // //     public static void main(String args[]){
// // //         int arr[]={4,3,2,5,6,4,6};
// // //         System.out.println(count(arr));
// // //     }
// // // }
// // //Inversion Count using modified merge sort TC= O(nlogn)
// public class InversionCount{
//     private static int merge(int arr[],int left ,int mid ,int right){
//         int invCount=0;
//         int i=left;
//         int j=mid;
//         int k=0;
//         int temp[]=new int [right-left+1];
//         while(i<mid && j<=right){
//             if(arr[i]<=arr[j]){
//                 temp[k]=arr[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 temp[k]=arr[j];
//                 invCount += mid-i;
//                 System.out.println("Inversion Count in merge "+ invCount);
//                 k++;
//                 j++;

//             }
//         }
//         while(i<mid){
//             temp[k++]=arr[i++];
//         }
//         while(j<=right){
//             temp[k++]=arr[j++];
//         }
//         for(i=left,k=0;i<=right;k++,i++){
//             arr[i]=temp[k];
//         }
//         return invCount;
//     }
// private static int mergeSort(int arr[],int left,int right){
//     int invCount=0;
//     if(right>left){
//     int mid = (left + right)/2;
//    invCount=mergeSort(arr,left,mid);
//    System.out.println("inversion count after applying on left "+ invCount);
//    invCount+=mergeSort(arr,mid+1,right);
//     System.out.println("inversion count after applying on right "+ invCount);
//     invCount+=merge(arr,left,mid+1,right);
//     }
// return invCount;

// }
// public static int getInversionCount(int arr[]){
//     int n = arr.length-1;
//     return mergeSort(arr,0,n);
// }
// public static void main(String args[]){
//     int arr[]={9,8,7,6,5};
//     System.out.println("Inversion Count = " + getInversionCount(arr));
// }
// }
public class InversionCount{
    private static int merge(int arr[], int lo, int mid ,int hi){
int temp[]=new int [hi-lo + 1];
int invCount=0;
int i=lo;
int j=mid;
int k =0;
while(i<mid && j<=hi){
    if (arr[i]<=arr[j]){
        temp[k]=arr[i];
        i++;
        k++;
    }
    else{
        invCount+=mid -i;
        temp[k]=arr[j];
        k++;
        j++;
    }
}
while(i<mid){
    temp[k++]=arr[i++];
}
while(j<=hi){
    temp[k++]=arr[j++];
}
for(i=lo,k=0;i<=hi;i++,k++){
    arr[i]=temp[k];
}
return invCount;
    }
    private static int mergeSort(int arr[],int lo,int hi){
        int invCount=0;
        if(hi>lo){
            int mid = (hi + lo) /2; 
            invCount=mergeSort(arr,lo , mid);
            invCount+= mergeSort(arr,mid+1,hi);
            invCount+= merge(arr,lo,mid+1,hi);
        }
return invCount;
    }
    public static int getInversionCount(int arr[]){
        int n = arr.length;
        return mergeSort(arr,0,n-1);
    }
    public static void main(String args[]){
        int arr[]={3,6,4,5,2,7,8,1};
        System.out.println("Inversion count is : " + getInversionCount(arr));
    }
}