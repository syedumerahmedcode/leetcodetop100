package com.umer.stack;

public class Stack {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World from inside Stack ");
        ValidParameters validParameters=new ValidParameters();
        System.out.println("The following input should return true from the class: input--> (): Expected: true::: Actual:"+     validParameters.isValid("()"));
        System.out.println("The following input should return true from the class: input--> ()[]{}: Expected: true::: Actual:"+     validParameters.isValid("()[]{}"));
        System.out.println("The following input should return true from the class: input--> (]: Expected: false::: Actual:"+     validParameters.isValid("(]"));

    }

}
