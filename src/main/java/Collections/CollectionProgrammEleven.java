package Collections;

import java.util.Stack;

// wap to remove the outermost parentheses from the given input string. i/p: ( ( ) ( ) ) ( ( ) ) o/p: ( ) ( ) ( )
public class CollectionProgrammEleven {

    public static void main(String[] args) {
        String s = "( ( ) ( ) ) ( ( ) ) ";

        System.out.println(getSubString(s));

    }

    public static String getSubString(String k) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        String result = "";
        for (int i = 0; i < k.length(); i++) {
            for (int j = i + 1; j < k.length(); j++) {
                char c = k.charAt(j);

                if( k.charAt(i) == '(' &&  c != '(' ) {
                    stack.add(k.charAt(j));
                    char temp;

                    switch (c) {
                        case ')':
                            //   temp = stack.peek();
                            stack2.add(c);
//                        if (k.charAt(i) == ')' && k.charAt(j) == ')' ) {

                            result = result + stack.peek() + stack2.peek();
                            stack.pop();
                            stack2.pop();
                            //     }
                            break;
                    }
                }
            }
        }
        return result;
    }
}

