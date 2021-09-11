// Link to the problem----------------> https://leetcode.com/problems/remove-element/
// Approach Used----------------------> Using Two Pointers approach and Swap() method

class Solution {
    public int removeElement(int[] a, int val) {
        // Take the first pointer i pointing to the start of the array
        int i = 0;
        // And the second pointer j which is pointing to the end of the array
        int j = a.length-1;
        
        // Run this while loop till i is less than equal to k
        // Here we will decrement j at two conditions :-
        // (i) When the i'th and j'th element of the array has same value that of value of val we need to remove we simply decrement j
        // (ii) When the t'th value is equal to val and j'th is not equal to k we will swap both the values
        // Here we are placing all the value equal to val at the end of array and simply decrement the j
        // And if none of the condition is satisfied simply increment i value
        while(i <= j){
            if(a[i] == val && a[j] == val){
                j--;
            }
            else if(a[i] == val && a[j] != val){
                swap(a, i, j);
                j--;
            }
            else{
                i++;
            }
        }
        
        // Returning j+1 as array index start from 0 and we have to return the length so return (j+1)
        return j+1;
    }
    
    // Simple swap method to swap the two values
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
