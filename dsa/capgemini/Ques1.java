
public class Ques1{
    public static void main(String[] args) {
        String s="The#Learn#Prog#r%%a$$mi&&n**g..";
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#'||s.charAt(i) == '%'||s.charAt(i)=='$'||s.charAt(i)=='&'||s.charAt(i)=='*'||s.charAt(i)=='.') {
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#'&& s.charAt(i) != '%'&&s.charAt(i)!='$'&&s.charAt(i)!='&'&&s.charAt(i)!='*'&&s.charAt(i)!='.') {
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
