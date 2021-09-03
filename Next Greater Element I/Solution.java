// Link to the problem -----------------> https://leetcode.com/problems/next-greater-element-i/
// Approach No. 1 --------> Simply using HashTable and arrays.
// This approach is rumnning in 2 ms runtime
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Here first i created a result array of size nums1.
        int[] result = new int[nums1.length];
        
      // Created a HashMap to store the key-value pair of nums2 array value and here keys are the values and values are their indexes.
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            h.put(nums2[i], i);
        }
       
        // Runs a for loop for the length of nums1
        for(int i = 0; i < nums1.length; i++){
            // Initialize the current value as -1 as if current is not updated i will add this default value in the array.
            int current = -1;
            // Getting the index of the nums1 array ith index in nums2 HashTable 
            int index = h.get(nums1[i]);
            // Runs this loop from index+1 aas we have to start from next greater value
            for(int j = index + 1; j < nums2.length; j++){
                if(nums1[i] < nums2[j]){
                    current = nums2[j];
                    break;
                }
            }
          // Upadate result array value if current is found else set -1 defaut value.
            result[i] = current;
        }
        return result;
    }
}


// Approach No 2 -----> Simply using HashTable, arrays, and stack
// Takes more runtime to execute because of push pop operations tallking time so the rumtime for this approach is 9 ms.
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // As explained above
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            h.put(nums2[i], i);
        }
        
        // Maintain a stack for strong the value
        Stack<Integer> stack = new Stack<>();
        int current;
        for(int i = 0; i < nums1.length; i++){
            current = -1;
            int index = h.get(nums1[i]);
            for(int j = index + 1; j < nums2.length; j++){
                if(nums1[i] < nums2[j]){
                    current = nums2[j];
                    break;
                }
            }
            // Push the value of current
            stack.push(current);
        }
        
        int[] result = new int[nums1.length];
        int i = stack.size() - 1;
        // Start to insert from the last index value as top of the element in stack will come at last index of the array and last element of 
        // the stack will be first elenent of the array.
        while(!stack.isEmpty()){
            result[i] = stack.pop();
            i--;
        }
        return result;
    }
}
