//print all palindrom from th string
public class palindrom {
    public static void main(String[] args){
        String s ="cbcaba";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str =s.substring(i,j);
                if(ispalindrom(str) == true){
                System.out.println();}
            }}
        }
    
        private static boolean ispalindrom(String s){
            int st = 0;
            int ed = s.length() - 1;
            while (st < ed) {
                if (s.charAt(st) != s.charAt(ed)) {
                    return false;
                }
                st++;
                ed--;
            }
            return true;
           
        
    
}
}