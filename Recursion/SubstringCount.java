public class SubstringCount{
    public static int count(String st, int i ,int j,int n){
        if(n<=0){
                return 0;
                }
        if(n==1){
            
            return 1;

        }
        int a= count(st,i,j-1,n-1);
        int b= count(st,i+1,j,n-1);
        int c= count(st,i+1,j-1,n-2);

        int res=a+b+c;
        if(st.charAt(i)==st.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String args[]){
        String st="abcab";
        int n =st.length();
        System.out.println(count(st,0,n-1,n));
    }
}