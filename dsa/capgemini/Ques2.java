// count the char and print the count of each char
import java.util.HashMap;
public class Ques2 {
       public static void main(String[] args) {
        String s = "abbcccddddeeeee";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
          for(char ch : map.keySet()){
        System.out.print( ch+""+map.get(ch));
            }  
        }
}
