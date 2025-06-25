// count the number of characters in a string
public class charcount {
       public static void main(String[] args) {
        String s = "abcdab";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int count = 1;
            for(int j=i+1;j<s.length();j++){
                if(ch == s.charAt(j)){
                    count++;
                }
            }System.out.println(ch + " " + count);
             
        }
       }    
}
