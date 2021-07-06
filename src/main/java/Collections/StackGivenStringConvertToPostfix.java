package Collections;


//prefix: *+AB-CD
//(A+B) *(C-D)
//Postfix: AB+CD-*

// stack.peek -

//convert to prefix to postfix: stack. peek method ( remove always first in last out element)

import java.util.Stack;

public class StackGivenStringConvertToPostfix {

    public static void main(String[] args) {
        String expression = "+A-*BCD"; // A+B*C-D
        System.out.println(getPostfixExpression(expression));
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

    public static String getPostfixExpression(String expression){

        String postfix ="";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<expression.length();i++){
            char b = expression.charAt(i);
           if(getPrecedence(b)>0){
               while(stack.isEmpty() == false && getPrecedence(stack.peek())>=getPrecedence(b)){
                   postfix = postfix+stack.pop();
               }
               stack.push(b);
           }else{
               postfix = postfix+b;
           }
        }
        for(int i=0;i<=stack.size();i++){
            postfix = postfix+stack.pop();
        }
        return postfix;
    }
}
