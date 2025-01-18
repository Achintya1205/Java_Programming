import java.util.Arrays;

public class RecSelection {
    public static void main(String[] args) {
        int[] arr = {7,6,1,3,4,2,15};
        Selection(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void Selection(int[] arr, int i){
        if(i == arr.length-1){
            return; 
        }
        int lastIndex = arr.length-i-1;
        int maxIndex = getMaxIndex(arr,0,lastIndex,0);
        
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;

        Selection(arr, i+1);

    }
    public static int getMaxIndex(int[]arr,int start, int end,int max){
        if(start > end){
            return max;
        }
        if(arr[max] < arr[start]){
            max = start;
        }
        return getMaxIndex(arr, start+1,end,max);
    }
}
