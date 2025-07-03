// use recursion 
public class recursion {
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
    private static void print(int n){
        if(n==6) return ;
        System.out.println(n);
        print(n+1);
    }
    
}
