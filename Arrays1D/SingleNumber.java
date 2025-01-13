public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for(int n : nums){
            unique ^= n;
        }
        return unique;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,4,4,6,6,7,9,9,11,11};
        System.out.println(singleNumber(nums));
    }
}