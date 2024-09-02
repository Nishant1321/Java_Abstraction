package DSABasicProblem;

import java.util.HashMap;

public class SubArrayWithSum_Array {
	public static void subArraySum(int a[], int sum) {
        int currntsum = 0;
        int n = a.length;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            currntsum += a[i];
            
            if (currntsum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            
            if (map.containsKey(currntsum - sum)) {
                start = map.get(currntsum - sum) + 1;
                end = i;
                break;
            }
            
            map.put(currntsum, i);
        }
        
        if (end == -1) {
            System.out.println("Subarray not found");
        } else {
            System.out.println("Subarray found from index " + start + " to " + end);
        }
    }
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        int sum = 14;
        subArraySum(a, sum);
    }
}
