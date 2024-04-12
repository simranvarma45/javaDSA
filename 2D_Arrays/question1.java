public class question1{
public static int count(int arr[][],int num){
int count=0;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]==num){
            count++;
        }
    }
}
return count;
}
public static void main(String args[]){
    int arr[][]={{1,2,7,5},
    {4,8,7,5},
    {23,56,8,9},
    {4,3,5,7}};
    System.out.println(count(arr,7));
}
}