public class countingsort{
    public static void counting(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
largest=Math.max(largest,arr[i]);
        }
        int a[]=new int[largest+1];
        for(int i=0; i<arr.length;i++){
            a[arr[i]]++;
        }
        int j=0;
        // int j=a.length-1; for descending sorting - method 1
        for(int i=0;i<a.length;i++){
            // for(int i=a.length-1;i>=0;i--){ - method 2 for descending sorting


 while(a[i]!=0){
    
    arr[j]=i;
    j++;
    // j--; for descending sorting - method 1
    a[i]--;
}

            }
        }
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        counting(arr);
        print(arr);
    }
}