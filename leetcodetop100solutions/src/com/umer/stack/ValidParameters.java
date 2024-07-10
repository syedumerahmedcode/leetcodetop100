package com.umer.stack;

import java.util.Stack;

public class ValidParameters {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

 

Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

// Community sollution considered: https://leetcode.com/problems/valid-parentheses/solutions/5367673/java-solution-stack/?envType=study-plan-v2&envId=top-100-liked


Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.


     * @param s
     * @return
     */
    public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }else{
            Stack<Character> st=new Stack<>();
            return valid(s,st);
        }
    }

    private static boolean valid(String s, Stack<Character>  st){
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            if(currentChar=='(' || currentChar== '[' || currentChar=='{'){
                st.push(currentChar);
            }else{
                if(st.isEmpty()) {
                    return false;
                }
                char topChar=st.pop();
                if((currentChar==')' && topChar!='(') ||
                (currentChar=='}' && topChar!='{') ||
                (currentChar==']' && topChar!='[') ){
                    return false;
                }
            }            
        }
        return st.isEmpty();
    }

}
