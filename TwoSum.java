package TopInterviewQues;
import java.util.Scanner;
/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/
public class TwoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
		 for (int i = 0; i < nums.length; i++) {
		        for (int j = i + 1; j < nums.length; j++) {
		            if (nums[j] == target - nums[i]) {
		                return new int[] { i, j };
		            }
		        }
	       }
	      throw new IllegalArgumentException("No two sum solution");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++){
			nums[i] =scan.nextInt();
		}
		System.out.println("Enter Target Value..:");
		int target = scan.nextInt();
		int[] result = twoSum(nums, target);
		for(int k=0;k<result.length;k++){
		System.out.println(result[k]); }
	}

}
