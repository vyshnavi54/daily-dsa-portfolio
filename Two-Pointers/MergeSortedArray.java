//LeetCode 88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,a=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[a]=nums1[i];
                a--;
                i--;
            }
            else{
                nums1[a]=nums2[j];
                a--;
                j--;
            }
        }
        while(j>=0){
            nums1[j]=nums2[j];
            j--;
                    
        }
    }
}