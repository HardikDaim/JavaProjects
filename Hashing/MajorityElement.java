package Hashing;
import java.util.HashMap;

public class MajorityElement {
    public static void MajorityElement(int nums[]){ // O(n)
        HashMap<Integer,Integer> Map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++) {
            if(Map.containsKey(nums[i])) { // True
                // Update Value/frequency by 1 for existing key
                Map.put(nums[i],Map.get(nums[i])+1);
            }
            else {
                // Create new Key-value having freq = 1 pair -> Hashmap
                Map.put(nums[i],1);
            }
        }

        // Traverse Map and return required key
        for(int Key : Map.keySet()) {
            if(Map.get(Key) > n/3) {
                System.out.println(Key);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};
        MajorityElement(nums);
    }
}
