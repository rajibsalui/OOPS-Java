package Leetcode_problems;

class palindrome_substring {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        s+=" ";
        int maxlen=1;
        String maxstr=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length()-1;j++){
                if((s.substring(i,j+1).equals(reverse(s.substring(i,j+1)))) && (j-i+1) > maxlen){
                    maxlen=j-i;
                    maxstr=s.substring(i,j+1);
                }
            }
        }
        return maxstr;
    }
    public String reverse(String str){
        String revstr="";
        for(int i=str.length()-1;i>=0;i--){
            revstr+=str.charAt(i);
        }
        return revstr;
    }

    public static void main(String[] ignoredArgs) {
        palindrome_substring r = new palindrome_substring();
        String s=r.longestPalindrome("babad");
        System.out.println(s);
    }
}
