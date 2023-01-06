import java.util.Arrays;

class Solution1{

    public boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start>end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2){
            return s;
        }
        int maxlength=1;
        int start=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(isPalindrome(s)&&(j-i+1)>maxlength){
                    start=i;
                    maxlength=j-i+1;
                }
                s=s.substring(start,start+j);
            }
        }
        return s.substring(start,start+maxlength);
    }
}
public class leetcode {
    public static void main(String[] args) {
       Solution1 s=new Solution1();
       String x=s.longestPalindrome("babad");
        System.out.println(x);
    }
}
