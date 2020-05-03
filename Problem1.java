import java.util.*;
public class Problem1{
	public boolean twoSum(int nums[], int k){
		HashSet<Integer> diff = new HashSet<>();
		for (int i = 0 ; i < nums.length ; i++) {
			int d = Math.abs(nums[i]-k);
			if(diff.contains(nums[i])){
				return true;
			}
			else{
				diff.add(d);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Problem1 obj = new Problem1();
		int ar[] = {10, 15, 3, 7};
		int k = 17;
		System.out.println(obj.twoSum(ar, k));
	}
}
