import java.util.*;

public class leet238 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    int rp=1;
    int[] lf = new int[arr.length];
    lf[0] = 1;
    for (int i = 1; i < arr.length; i++) {
      
      lf[i] = lf[i - 1] * arr[i - 1];
    }
    for (int i=arr.length-2;i>=0;i--) {
        rp *= arr[i + 1];
        lf[i] *= rp;
    }
    System.out.println(Arrays.toString(lf));
  
}  
  

} 