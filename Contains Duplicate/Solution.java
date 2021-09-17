// Link to the problem----------> https://leetcode.com/problems/contains-duplicate/
// Approach used----------------> Using concept of hashSet 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Creating a hashset
        HashSet<Integer> set = new HashSet<>();
        
        // Running a for each loop and getting the elements of nums array one by one
        for(int num : nums){
            // If an element is added in hashset then set.add return true and other wise false so if duplicate element comes the false is
            // returned and complement of false is true and if statement is executed and it returns true
            if(!set.add(num)){
                return true;
            }
        }
        
        // If whole array is traversed and nothing is returned then in last return false which means no duplicate element
        return false;
        
    }
}
