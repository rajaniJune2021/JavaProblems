import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

//Factorial logic:
//        nCr = n!/(n-r)!*r!

// 5C4 = 5!/1*4! = 120/24 = 5
//
//        2C1 = 2!/1!*1! = 2
//
//
//        n! = n*(n-1)*(n-2)*........1
//        5! = 5*4*3*2*1 = 120

public class PascalProgram {

    public static void main(String[] args) {
        int n = 5;
        int i,j;
        PascalProgram pascalProgram = new PascalProgram();
        for(i=0;i<=n;i++){
//            for(j=0;j<=n-1;j++){
//                System.out.println(" ");
//            }
            for(j=0;j<=i;j++){
                System.out.print(" "+pascalProgram.factorialOfNumber(i)/ (pascalProgram.factorialOfNumber(i-j) * pascalProgram.factorialOfNumber(j)));
            }
            System.out.println(" ");
        }

    }

    public int factorialOfNumber(int p){
        if(p == 0)
            return 1;
        return p * factorialOfNumber(p-1);
    }
}
