public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,9,11,13,16,20};
        int target = 11;
        System.out.println(Search(arr,target));
    }
    public static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }    
}
