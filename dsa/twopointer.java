public class twopointer {
    public static void main(String[] args) {
        int [] nums = { 1,8,6,2,5,4,8,3,7};
        area(nums);
    }
    private static void area(int[] nums){
        int max =0;
        for (int i= 0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                int h = Math.min(nums[i],nums[j]);
                int w = j - i;
                int area=h*w;
                max=Math.max(max,area);
            }
        } System.out.println(max);
    }
    
}
