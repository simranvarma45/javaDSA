public class staircaseSearch{
public static boolean search(int arr[][],int key){
    // int i=0;int j=arr[0].length-1;
// while(i<arr.length && j>=0){

// if(key==arr[i][j]){
//     System.out.println("found at index ("+ i +","+j+")");
//     return true;
// }
// else{
// if(key>arr[i][j]){
//     i++;
// }
// else {
//     j--;
// }
// }
// }
// return false;

// }
int j=0;int i=arr.length-1;
while(i>=0 && j<arr[0].length){

if(key==arr[i][j]){
    System.out.println("found at index ("+ i +","+j+")");
    return true;
}
else{
if(key>arr[i][j]){
    j++;
}
else {
    i--;
}
}
}
return false;

}
public static void main(String args[]){
int arr[][]={{10,20,30,40},
{15,25,35,45},
{27,29,37,48},
{32,33,39,50}};
search(arr,33);
}
}