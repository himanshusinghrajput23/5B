
public class substring {
    public static void main(String[] args) {
        String s = "hello";
        String t = " ";
        String r =" ";
        for (int i =0; i<s.length(); i++) {
          t=t+s.charAt(i);
          System.out.println(t);}
        for (int j =s.length()-1; j<=0; j--) {
          r=r+s.charAt(j);
          System.out.println(r);}
        
    }
    
}

