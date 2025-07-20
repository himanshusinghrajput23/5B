// find the first character that doesnot repeat print non repating character
public class Ques5 {
    public static void main(String[] args) {
        String s = "swiss";
        int[] count = new int[256]; 
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                return; 
            }
        }
        
        System.out.println("not found");
    }
}
