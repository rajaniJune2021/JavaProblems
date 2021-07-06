package Collections;

//input : +AB output A+B

import java.util.Stack;

public class StackConvertPrefixToInfixExpression {

    public static void main(String[] args) {
        String expression ="+AB";
        System.out.println(getInfixExpression(expression));
    }

    public static boolean isOperatorOrNot(char c){
        switch (c){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    public static String getInfixExpression(String expression){
        String result = "";
        Stack<String> stack = new Stack();
        for(int i=expression.length()-1;i>=0;i--){
           char c = expression.charAt(i);
           if(isOperatorOrNot(c)){
                String s1 = stack.pop();
                String s2 = stack.pop();
                stack.push(s1+c+s2);

           }else {
               stack.push(c+"");
           }
        }
        result = stack.pop();
        return result;
    }

}
