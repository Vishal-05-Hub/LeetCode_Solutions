// Link to the problem----------------> https://leetcode.com/problems/remove-k-digits/
// Approach used--------> Using concept of stack and build a string from from stack.
class Solution {
    public String removeKdigits(String num, int k) {
        // First Make a char array for the string num
        char[] s = num.toCharArray();
        // Finding the length for the string
        int n = num.length();
        
        // If the size of string we have to remove is equal to size of the string then return 0 string.
        if(k == n) return "0";
        // Initiate a stack pf characters
        Stack<Character> st = new Stack<>();
        
        int i = 0;
        while(i < n){
            // Run this while loop till the stackk is not empty and k > 0 and top element of stack is greater than the incoming character
            // and then pop the element if found greater.
            while(k > 0 && !st.isEmpty() && st.peek() > s[i]){
                st.pop();
                k--;
            }
            // Push that element into the stack
            st.push(s[i]);
            i++;
        }
        
        // If k value is left then in this case pop the top element till k becomes equal to 0.
        while(k > 0){
            st.pop();
            k--;
        }
        
        // Making the ans string
        String ans = "";
        
        // While loop to make the string.
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        
        // If in case 0th element of the ans string is 0 then remove the 0th element.
        while(ans.length() > 1 && ans.charAt(0) == '0'){
            ans = ans.substring(1);
        }
        
        return ans;
        
    }
}
