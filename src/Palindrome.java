import java.util.Arrays;

public class Palindrome {
    //hehe python naming conventions
    char[] str_arr;
    char[] rev_arr;
    int str_len;
    int a = 0;

    public boolean isPalindrome(String str){
        str_arr = str.toCharArray();
        str_len = str.length()-1;
        rev_arr = new char[str_len+1];

        for(int i = 0; i < str_len; i++){
            rev_arr[i] = str_arr[Math.abs(i-str_len)];
            rev_arr[str_len] = str_arr[0];

            if(rev_arr[i] == str_arr[i]){
                a++;
            }
        }
        return (a == str_len);
    }
}
