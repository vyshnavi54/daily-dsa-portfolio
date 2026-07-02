//LeetCode 2516. Take K of Each Character From Left and Right
class Solution {
    public int takeCharacters(String s, int k) {
        int arr[]=new int[3];
        int n=s.length(),j=0,c=0;
        for(int i=0;i<n;i++){
           arr[s.charAt(i)-'a']++;
        }
        if(arr[0]<k||arr[1]<k||arr[2]<k)return -1;
        int ans[]=new int[3];
        int i=0;
        while(j<n){
            ans[s.charAt(j)-'a']++;
            while(ans[0]>arr[0]-k ||ans[1]>arr[1]-k||ans[2]> arr[2]-k){
               ans[s.charAt(i)-'a']--;
               i++;
            }
            c=Math.max(c,j-i+1);
            j++;
        }
        return n-c;
    }
}