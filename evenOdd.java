public class evenOdd {
    public static void main(String args[]) {
        int n = 42;
        if (n < 2) {
            System.out.println("odd");

        }

        int m = n;
        n = n / 2;
        System.out.println(n);
        n = n * 2;
        if (m == n) {
            System.out.println("even");
        }

        else {
            System.out.println("odd");
        }
        int x = -1;
        x = +x;
        System.out.println(x);

    }

}