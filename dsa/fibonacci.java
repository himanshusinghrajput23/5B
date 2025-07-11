// This class calculates the nth Fibonacci number using recursion.
 
public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int ans = fib(n);
        System.out.println(ans);
    }
    private static int fib(int n) {
        if (n == 0 || n == 1) return n;
        int sp1 = fib(n - 1);
        int sp2 = fib(n - 2);
        return sp1 + sp2;
    }
}
