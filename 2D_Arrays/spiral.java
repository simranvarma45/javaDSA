import java.util.Scanner;
public class spiral{
    public static void spiralprint(int arr[][]){
    int sr=0,er=arr.length - 1,sc=0,ec=arr[0].length - 1;
    //top
    // while((sc<=ec)&& ( sr<=er)){
    while((sc<=ec)&&(sr<=er)){
    for(int j=sc;j<=ec;j++){
        System.out.print(arr[sr][j]+ "   ");
    }
    //right
    for(int i=sr+1;i<=er; i++){
        System.out.print(arr[i][ec]+ "  ");
    }
    //end
    for(int j=ec-1;j>=sc;j--){
        if(sr==er){break;}
System.out.print(arr[er][j]+ "   ");
    }
    //left
    for(int i= er-1;i>sr;i--){
        if(sc==ec){break;}
        System.out.print(arr[i][sc]+ "   ");
    }
    sr++;ec--;sc++;er--;
    }
    
    }
    public static void main(String args[]){
        // Scanner sc =   new Scanner(System.in);
//         int m,n;
//         m=sc.nextInt();
// n= sc. nextInt();
//         int arr[][]=new int [m][n];

// for(int i=0;i<arr.length;i++){
//     for(int j=0;j<arr[0].length;j++){
//         arr[i][j]=sc.nextInt();
//     }
// }
// for(int i=0;i<arr.length;i++){
//     for(int j=0;j<arr[0].length;j++){
//         System.out.print(arr[i][j] + " ");
//     }
//     System.out.println();
// }
int arr[][]={{1,2,3,4,},
{6,7,8,9},
{11,12,13,14},
{16,17,18,19},
{21,22,23,24}};
// int arr[][]={{1,2,3,4},
//  {5,6,7,8,},
//  {9,10,11,12},
//  {13,14,15,16},
//  {17,18,19,20}};

spiralprint(arr);
    }
}