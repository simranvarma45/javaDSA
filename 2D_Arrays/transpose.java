public class transpose{
    public static void transposematrix(int arr[][]){
        int trans[][]=new int [arr[0].length][arr.length];
// for(int j=0;j<arr[0].length;j++){
//     for(int i=0;i<arr.length;i++){
//       trans[j][i]=arr[i][j];  
//     }
// }
for(int i=0;i<trans.length;i++){
     for(int j=0;j<trans[0].length;j++){
       trans[i][j]=arr[j][i];  
    }
}

    for(int j=0;j<arr[0].length;j++){
    for(int i=0;i<arr.length;i++){
      System.out.print(trans[j][i]+" ") ;
    }
   System.out.println(); 
}

    }
    public static void main(String args[]){
        int arr[][]={{2,4,3},
        {4,5,6},
        {7,8,9},
        {10,11,12}};
        transposematrix(arr);
    }
}