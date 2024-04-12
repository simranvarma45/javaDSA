public class shortestPath{
    public static void shortpath(String str){
        int x2=0,y2=0,x1=0,y1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y2++;
            }
             else if(str.charAt(i)=='S'){
                y2--;
            }
            else if(str.charAt(i)=='E'){
                x2++;
            }
            else{
                x2--;
            }
        }
        int x=x2-x1;
        int y=y2-y1;
        System.out.println("Shortest path is :"+ Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
    }
    public static void main(String args[]){
        String str="WNEENESENNN";
        String str1="NWES";
        shortpath(str1);
    }
}