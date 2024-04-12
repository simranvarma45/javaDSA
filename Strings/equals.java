public class equals{
    public static void main(String args[]){
        String s1="simran";
        String s2="simran";
        String s3=new String("simran");
        if(s1==s2){
            System.out.println("true");
        }
        if(s1!=s3){
            System.out.println("false");
        }
        if(s1.equals(s3)){
            System.out.println("true");
        }
    }
}