class Solution {
    public boolean isAnagram(String s, String t) {
            char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c.length-1; j++){
                if(c[j] > c[j+1]){
                    char temp  = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < c1.length; i++){
            for(int j = 0; j < c1.length-1; j++){
                if(c1[j] > c1[j+1]){
                    char temp  = c1[j];
                    c1[j] = c1[j+1];
                    c1[j+1] = temp;
                }
            }
        }

        if(Arrays.equals(c,c1)){
            return true;
        }
        return false;

    }
}
