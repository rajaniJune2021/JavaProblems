package Collections;

//prefix: +AB
//prefix: *+AB-CD
//(A+B) *(C-D)
//Postfix: AB+CD-*

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class StackConvertToInfixoPostFix {

    public static void main(String[] args) {

        String expression = "A+B*C";
        System.out.println("prefix expression is:"+convertInfixToPrefix(expression));
    }


    static int getPrecedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    static StringBuilder convertInfixToPrefix(String infixExpression){
        StringBuilder prefixExpression = new StringBuilder();
        StringBuilder infix = new StringBuilder(infixExpression);
        infix.reverse();
        Stack<Character> stack = new Stack<>();
        char[] a = new String(infix).toCharArray();
        for(int i=0;i<a.length;i++){
            char b = a[i];
            if(getPrecedence(b)>0){
                while(stack.isEmpty()==false && getPrecedence(stack.peek())>=getPrecedence(b)){
                    prefixExpression.append(stack.pop());
                }
                stack.push(b);
            }
            else{
                prefixExpression.append(b);
            }
        }
        for(int i=0;i<=stack.size();i++){
            prefixExpression.append(stack.pop());
        }
        return prefixExpression.reverse();
    }
}
