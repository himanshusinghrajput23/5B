// count the number of characters in a string
// public class charcount {
//        public static void main(String[] args) {
//         String s = "abcdab";
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             int count = 1;
//             for(int j=i+1;j<s.length();j++){
//                 if(ch == s.charAt(j)){
//                     count++;
//                 }
//             }System.out.println(ch + " " + count);
             
//         }
//        }    
// }

// count the number of characters in a string  by heap

import java.util.*;
public class charcount {
       public static void main(String[] args) {
        String s = "abbcccdddd";
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
            }  }
}