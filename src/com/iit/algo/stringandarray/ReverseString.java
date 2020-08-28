package com.iit.algo.stringandarray;
/*
Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.

1) Let input string be 'str[]' and length of string be 'n'
2) l = 0, r = n-1
3) While l is smaller than r, do following
    a) If str[l] is not an alphabetic character, do l++
    b) Else If str[r] is not an alphabetic character, do r--
    c) Else swap str[l] and str[r]
 */

public class ReverseString {

    //reverse Function
    public static void reverse(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r)
        {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if(!Character.isAlphabetic(str[r]))
                r--;

                // Both str[l] and str[r] are not spacial
            else
            {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string: " + revStr);
    }
}
