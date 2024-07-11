package com.umer.stack;

public class Stack {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World from inside Stack ");
        ValidParametersDifficultyLevelEasy validParameters=new ValidParametersDifficultyLevelEasy();
        System.out.println("The following input should return true from the class: input--> (): Expected: true::: Actual:"+     validParameters.isValid("()"));
        System.out.println("The following input should return true from the class: input--> ()[]{}: Expected: true::: Actual:"+     validParameters.isValid("()[]{}"));
        System.out.println("The following input should return true from the class: input--> (]: Expected: false::: Actual:"+     validParameters.isValid("(]"));

        MinStackDifficultyLevelMedium minStack=new MinStackDifficultyLevelMedium();
        System.out.println("minStack.push(-2);");
        minStack.push(-2);
        System.out.println("minStack.push(0);");
        minStack.push(0);
        System.out.println("minStack.push(-3);");
        minStack.push(-3);
        System.out.println("The following input should return true from the class: minStack.getMin(); // return -3"+minStack.getMin());
        System.out.println("minStack.pop();");
        minStack.pop();
        System.out.println("The following input should return true from the class: minStack.top();    // return 0"+minStack.top());
        System.out.println("The following input should return true from the class: minStack.getMin(); // return -2"+minStack.getMin());

    }

}
