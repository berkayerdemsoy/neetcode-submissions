class Solution {
    public boolean isAnagram(String s, String t) {
       
        if(s.length() != t.length()){
            return false;
        }
        int[] harfler = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            harfler[s.charAt(i)-'a']++;
            harfler[t.charAt(i)-'a']--;
        }
        for (int sayi : harfler){
            if(sayi !=0){
                return false;
            }
        }
        return true;

    }
}
