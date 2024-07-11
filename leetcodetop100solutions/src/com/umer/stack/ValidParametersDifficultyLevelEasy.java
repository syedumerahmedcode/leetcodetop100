package com.umer.stack;

import java.util.Stack;

public class ValidParametersDifficultyLevelEasy {

    private static final char CLOSING_SQUARE_BRACKET = ']';
    private static final char CLOSING_CURLY_BRACKET = '}';
    private static final char CLOSING_ROUND_BRACKET = ')';
    private static final char OPENING_CURLY_BRACKET = '{';
    private static final char OPENING_SQUARE_BRACKET = '[';
    private static final char OPENING_ROUND_BRACKET = '(';

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


     * @param input
     * @return
     */
    public boolean isValid(String input) {
        if(input.length()==0){
            return true;
        }else{
            Stack<Character> stackOfInputCharacters=new Stack<>();
            return valid(input,stackOfInputCharacters);
        }
    }

    private static boolean valid(String input, Stack<Character>  stackOfInputCharacters){
        for(int i=0;i<input.length();i++){
            char currentChar=input.charAt(i);
            if(currentChar==OPENING_ROUND_BRACKET || currentChar== OPENING_SQUARE_BRACKET || currentChar==OPENING_CURLY_BRACKET){
                stackOfInputCharacters.push(currentChar);
            }else{
                if(stackOfInputCharacters.isEmpty()) {
                    return false;
                }
                char topChar=stackOfInputCharacters.pop();
                if((currentChar==CLOSING_ROUND_BRACKET && topChar!=OPENING_ROUND_BRACKET) ||
                (currentChar==CLOSING_CURLY_BRACKET && topChar!=OPENING_CURLY_BRACKET) ||
                (currentChar==CLOSING_SQUARE_BRACKET && topChar!=OPENING_SQUARE_BRACKET) ){
                    return false;
                }
            }            
        }
        return stackOfInputCharacters.isEmpty();
    }

}
