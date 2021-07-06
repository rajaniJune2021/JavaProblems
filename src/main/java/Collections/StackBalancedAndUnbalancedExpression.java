package Collections;

// wap to print balanced and unbalanced expression of expected order of elements. example: input: [(])

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBalancedAndUnbalancedExpression {

    public static void main(String[] args) {
        String expression = "([])";
        if(checkForBalancedParanthesis(expression)){
            System.out.println("balanced expression");
        }
        else{
            System.out.println("not balanced expression");
        }
    }

    static boolean checkForBalancedParanthesis(String expression){
        Deque<Character> deque = new ArrayDeque<Character>();
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                deque.push(c);
            }
            if(deque.isEmpty()){
                return false;
            }
            char temp;
            switch(c){
                case ')' :
                    temp = deque.pop();
                    if(temp == '{' || temp == '[')
                        return false;
                    break;
                case '}':
                    temp = deque.pop();
                    if(temp == '(' || temp =='[')
                        return false;
                    break;
                case ']':
                    temp = deque.pop();
                    if(temp == '(' || temp == '{')
                        return false;
                    break;
            }
        }
        return deque.isEmpty();
    }
}
