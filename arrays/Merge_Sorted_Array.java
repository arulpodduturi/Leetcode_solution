/**You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
**/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int[] nums3=new int[m+n];
     int a=0,b=0;
     for(int i=0;i<m+n;i++){
        if(a<m&&b<n){
        if(nums1[a]<nums2[b]){
            nums3[i]=nums1[a];
            a++;
        }
        else{
            nums3[i]=nums2[b];
            b++;
        } 
    }
        else if(a<m){
            nums3[i]=nums1[a];
            a++;
        }
        else{
            nums3[i]=nums2[b];
            b++;
        }
     }  
             for (int i = 0; i < m + n; i++) {
            nums1[i] = nums3[i];
        } 
    }
}
