public class Problem2 {
    public void productArray(int[] nums){
        int ans[] = new int[nums.length];
        int mul = 1;
        for(int i = 0 ; i < nums.length ; i++){
            mul = mul * nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = mul/nums[i];
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        Problem2 obj = new Problem2();
        int[] nums = {1, 2, 3, 4, 5};
        obj.productArray(nums);
        System.out.println();
        int[] nums2 = {3, 2, 1};
        obj.productArray(nums2);
    }
}
