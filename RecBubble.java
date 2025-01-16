import java.util.Arrays;
public class RecBubble {
    public static void main(String[] args) {
        int[] arr = {5,12,8,6,3,7,11};
        int n = arr.length;
        recBubble(arr,n, 0);
        System.out.println(Arrays.toString(arr));
    } 
    public static void recBubble(int[] arr, int n, int i){
        if(n == 1){
            return;
        }
        if(i == n-1) {
            recBubble(arr,n-1,0);
            return;
        }
        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        recBubble(arr, n, i+1);
    }   
}