public class diagonalSum{
    public static void sum(int arr[][]){
        int sum=0,n=arr.length -1;
for(int i=0;i<arr.length;i++){
    //optimised code 
    sum+=arr[i][i];
    
        // if(i==n){
        //     n--;
        //      continue;
        // }
        if(i!= (arr.length-1-i)){
            sum+=arr[i][arr.length-1-i];
        }
            
            // n--;
            
    
        
    }
    //This code give time complexity of O(n^2)
    //calculate sum in first diagonal
    // for(int j=0;j<arr[0].length; j++){
    //     if(i==j){
    //         sum+=arr[i][j];
    //     }
        // calculate sum in secondary diagonal
//         else if(i+j == arr.length-1){
//         sum+=arr[i][j];
//     }
    
//     }
// }
    // int r=-1;
    // int c=arr[0].length;
    //calculate sum in secondary diagonal
    // while(n>0){
    //     n--;
    //     r++;
    //     c--;
    //     if(r==c){
    //         System.out.println(r + ", "+ c + "continue");
    //         continue;}
    //     sum+=arr[r][c];
        
        
    // }


System.out.println("Sum is : "+ sum);
    }
    
public static void main(String args[]){
    int arr[][]={{1,2,4,3,1},
    {5,6,2,7,1},
    {9,10,8,11,1},
    {13,14,1,15,1},
    {1,2,3,4,5}};
    sum(arr);

}

}