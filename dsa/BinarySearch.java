public class BinarySearch {
    public static void main(String[] args){
        int [ ] arr = {10,20,30,40,50,60,70};
        int target = 20;
        int st= 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = (st + end) / 2;
            if(arr[mid] == target){
                System.out.println( mid);
                return; 
            } else if(arr[mid] < target){
             end = mid - 1;
            }
            else{
                st = mid + 1;
            } 
            
        }
        }
    }

