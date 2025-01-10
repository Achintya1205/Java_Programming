package Arrays1D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArray2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while(i<n && j<m){
            int a = nums1[i], b = nums2[j];
            if(a == b) {
                list.add(a);
                i++;
                j++;
            } else if(a<b){
                i++;
            } else {
                j++;
            }
        }
    
    int[] result = new int[list.size()];
    for(int k = 0; k < list.size(); k++) {
        result[k] = list.get(k);
    }
    return result;
   }
   public static void main(String[] args) {
    int[] nums1 = {4,6,6,7,8};
    int[] nums2 = {5,6,7,2,9,8};
    System.out.println(Arrays.toString(intersect(nums1,nums2)));
   }
}
