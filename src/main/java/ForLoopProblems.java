import java.util.Scanner;

public class ForLoopProblems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer to see the multiplication table");
        int inputIntValue = sc.nextInt();
        System.out.println("Enter first number of range");
        int multiplicationRange = sc.nextInt();
        System.out.println("Enter second number of range");
        int multiplicationSecondRange =sc.nextInt();
//        for(; multiplicationRange<=multiplicationSecondRange;multiplicationRange++){
//           int result=  inputIntValue * multiplicationRange;
//            System.out.println(result);
//        }
        System.out.println("----------------------------------");

        while(multiplicationRange <=10){
            int result2=  inputIntValue * multiplicationRange;
            System.out.println(result2);
            multiplicationRange++;
        }

    }
}
