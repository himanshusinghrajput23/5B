public class staps{
    static int count = 0;
    public static void main(String[] args) {
        int n=4;
        print(n,"");
    }
    private static void print(int n , String s){
        if(n==0){
            System.out.println(s);
            count++;
            System.out.println(count);
            return ;
        }
        if(n>=1) print(n-1,s+1);
        if(n>=2) print(n-2,s+2);
        if(n>=3) print(n-3,s+3);
        
    }
}