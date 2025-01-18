import java.util.Arrays;

public class RecInsertion {
    public static void main(String[] args) {
        int[] arr = {5,6,3,1,7,9,11,2};
        Insertion(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Insertion(int[] arr, int i,int j){
        if(i == arr.length - 1){
            return;
        }
        if( j > 0 && arr[j] < arr[j-1]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            Insertion(arr, i, j-1);
        }else{
            j = i + 1;
        }
        Insertion(arr, i+1, j+1);
    }
}
