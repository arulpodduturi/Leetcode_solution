/**
 * 
7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
 */
class Solution {
    public int reverse(int x) {
        int y = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            
            // Check for overflow before updating y
            if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow case for positive numbers
            }
            if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Overflow case for negative numbers
            }
            
            y = y * 10 + digit;
        }
        return y;
    }
}
