package com.umer.stack;

import java.util.Stack;

/**
* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.

You must implement a solution with O(1) time complexity for each function.



Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2



Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.

aSolution: https://leetcode.com/problems/min-stack/solutions/3685256/code-with-proper-comment-easy-solution/?envType=study-plan-v2&envId=top-100-liked
From: spartan1 in sub comments
https://leetcode.com/problems/min-stack/solutions/4865769/two-approach-fastest-solution-in-java/?envType=study-plan-v2&envId=top-100-liked[DONE]
https://leetcode.com/problems/min-stack/solutions/4439842/3ms-java-beats-100-easy-solution-with-explanation/?envType=study-plan-v2&envId=top-100-liked


*/
public class MinStackDifficultyLevelMedium {
    
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min = new Stack<>();
    
    public MinStackDifficultyLevelMedium() {
       
    }
    
    public void push(int val) {
        if(stack.size()==0){
            stack.push(val);
            min.push(val);
        }else{
            stack.push(val);
            if(min.peek()<val){
                min.push(min.peek());
            }else{
                min.push(val);
            }
        }
    }
    
    public void pop() {
        stack.pop();
        min.pop();
        }
        
        public int top() {
            return stack.peek();
        }
        
        public int getMin() {
            return min.peek();     
        }
    }
    /**
    * Your MinStack object will be instantiated and called as such:
    * MinStack obj = new MinStack();
    * obj.push(val);
    * obj.pop();
    * int param_3 = obj.top();
    * int param_4 = obj.getMin();
    */