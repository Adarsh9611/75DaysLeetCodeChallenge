class Solution {
    public boolean isPalindrome(String s) {
        int left=-0;
        int right=s.length()-1;
        while(left<right)
        {
            while(left<right&&!isAplhaNumeric(s.charAt(left)))
            {
                left++;
            }
             while(left<right&&!isAplhaNumeric(s.charAt(right)))
            {
                right--;
            }
            if(toLower(s.charAt(left))!=toLower(s.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isAplhaNumeric(char ch)
    {
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='9')
        {
            return true;
        }
        else{
            return false;
        }
    }
    public char toLower(char ch)
    {
        if(ch>='A'&&ch<='Z')
        {
            return (char)(ch+32);
        }
         return ch;
    }
   
}