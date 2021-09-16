// Link to the problem------------> https://leetcode.com/problems/concatenation-of-array/
// Approach Used------------------> Using arrays

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        // We need to concate the given array with itself so we take of new res array of length double 
        int[] res = new int[n*2];
        
        // RUN A FOR LOOP TILL THE END OF THE ARRAY
        for(int i=0; i < n; i++){
            // Here the 0th element and 0th + value of n element will be equal so i double up the aray like this.
            res[i] = res[i + n] = nums[i];
        }
        
        return res;
        
    }
}
