// Problem Link : https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < mid) {
                end = mid - 1;
            }
            else if(target > mid) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}