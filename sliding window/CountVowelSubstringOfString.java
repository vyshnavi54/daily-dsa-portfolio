//LeetCode 2062. Count Vowel Substrings of a String
class Solution {
    public int countVowelSubstrings(String word) {
       return count(word,5)-count(word,4);
    }
    static int count(String word,int k){
        HashMap<Character,Integer>hm=new HashMap<>();
        int n=word.length(),c=0,i=0;
        for(int j=0;j<n;j++){
            if(!isvowel(word.charAt(j))){
                hm.clear();
                i=j+1;
                continue;
            }
            hm.put(word.charAt(j),hm.getOrDefault(word.charAt(j),0)+1);
            while(hm.size()>k){
                int r=hm.get(word.charAt(i))-1;
                if(r==0)
                hm.remove(word.charAt(i));
                else
                hm.put(word.charAt(i),r);
                i++;
            }
            c=c+(j-i+1);
        }
        return c;
    }
    static boolean isvowel(Character ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}