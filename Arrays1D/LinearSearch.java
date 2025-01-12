public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,6,2,8,1,9,11,18};
        int target = 9;
        System.out.println(Search(arr,target));
    }    
    public static int Search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
