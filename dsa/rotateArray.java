import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 3;
        rotate(arr, k);
    }
    private static void rotate(int[] arr, int t){
           for (int j=1;j<arr.length;j++){
           int temp = arr[0];
           for(int i = 1;i<arr.length;i++){
            arr[i-1]=arr[i];
           }
           arr[arr.length-1]=temp;
           System.out.println(Arrays.toString(arr));
           }
    }
}
    
