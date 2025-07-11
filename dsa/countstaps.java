public class countstaps{
    public static void main(String[] args) {
        int n = 4;
        int count = print(n, "");
        System.out.println("Total count: " + count);
    }

    private static int print(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return 1;
        }
        int count = 0;
        if (n >= 1) count += print(n - 1, s + "1");
        if (n >= 2) count += print(n - 2, s + "2");
        if (n >= 3) count += print(n - 3, s + "3");
        return count;
    }
}
