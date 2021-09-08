// Link to problem---------> https://leetcode.com/problems/palindrome-number/
// Approach used----------> Basec use of while and maths operators
class Solution {
    public boolean isPalindrome(int x) {
        
        int sum = 0;
        // Simply copy the value of x in temp integer
        int temp = x;
        // Run this while loop until temp is greater than 0;
        while(temp > 0){
            // Get the remainder of the digit like 121 % 10 is 1 so rem = 1.
            int rem = temp % 10;
            // Multiply 10 in sum and then add the rem value to get the one digit sum, then two digit sum and so on.....
            sum = (sum * 10) + rem;
            // Divide the value of temp by 10 in every step as 121/10 = 12 and then 1 and then 0 and loop stopes....
            temp /= 10;
        }
        
        // If value of sum equlas x return true otherwise false.
        if(sum == x) return true;
        return false;
         
    }
}
