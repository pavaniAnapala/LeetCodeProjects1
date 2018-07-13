package TopInterviewQues;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 Note:Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 Example 1:
Input: [2,2,1]
Output: 1
 
Example 2:
Input: [4,1,2,1,2]
Output: 4
 */
import java.util.Scanner;
public class SingleNumber {
	
public static int singleNumber(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i],1);
			}
			else{
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if(map.get(key)==1){
				return key;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
 		}
		int x = singleNumber(arr);
		System.out.println(x);

	}
}


	
