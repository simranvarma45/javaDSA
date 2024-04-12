abstract class car{
    static{
        System.out.println("1");
    }
    public car(String name){
        super();
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
}
public class question extends car{
    {
        System.out.println("4");
    }
    static{
        System.out.println("6");
    }
    public question(){
        super("blue");
        System.out.println("5");
    }
    public static void main(String args[]){
        new question();
    }
}