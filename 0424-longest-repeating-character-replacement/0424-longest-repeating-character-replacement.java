class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int h=0;
        int maxCount=0;
        int maxLength =0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(h<s.length()){
            char ch = s.charAt(h);
            map.put(ch,map.getOrDefault(ch,0)+1);

            maxCount = Math.max(maxCount,map.get(ch));


            while((h-l+1) - maxCount > k){
                char lt = s.charAt(l);
                map.put(lt,map.get(lt)-1);
                l++;
            }
            maxLength= Math.max(maxLength,h-l+1);

           
            h++;

        }
        return maxLength;
        
    }
}