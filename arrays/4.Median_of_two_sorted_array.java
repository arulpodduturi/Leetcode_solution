/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length,b=nums2.length;
        int c=a+b;
        int[] nums3=new int[c];
        for(int i=0;i<a;i++){
            nums3[i]=nums1[i];
        }
        for(int i=0;i<b;i++){
            nums3[a+i]=nums2[i];
        }
        Arrays.sort(nums3);
        if(c%2!=0){
            return nums3[c/2];
        }
        return (nums3[c/2]+nums3[(c-1)/2])/2.0;
    }
}