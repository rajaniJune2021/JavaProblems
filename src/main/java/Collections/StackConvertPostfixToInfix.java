package Collections;

import java.util.Stack;

public class StackConvertPostfixToInfix {
    public static void main(String[] args) {
        String postFixExpression ="AB+";
        System.out.println(getInfixExpression(postFixExpression));
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
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(isOperatorOrNot(c)){
                String s1 = stack.pop();
                String s2 = stack.pop();
                stack.push(s2+c+s1);

            }else {
                stack.push(c+"");
            }
        }
        result = stack.pop();
        return result;
    }
}
