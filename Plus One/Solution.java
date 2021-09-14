// Link to the problem-------------> https://leetcode.com/problems/plus-one/
// Approach Used--------> Using arrays and basic maths

class Solution {
    public int[] plusOne(int[] digits) {  
        // Here first we take the length of the digit array in n.
        int n = digits.length;
        
        // Run a for loop from the end of the array as increment by 1 takes place always from end in maths
        for(int i = n-1; i >= 0; i--){
            // Increment the value of digits at i'th index by 1
            digits[i] += flag;
            // If the i'th index value is less than equal to 9 simply return the digits array  at that moment 
            if(digits[i] <= 9){
                return digits;
            }
            // Else if that digit exceeds 9 then place place 0 at that index value.
            digits[i] = 0;
        }
        
        // If after completing the whole for loop it means that somewhat 0 is place at 0 th index so
        int[] res = new int[n+1];
        // Place 1 at 0th index andreturn this result array
        res[0] = 1;
        return res;
    }
}
