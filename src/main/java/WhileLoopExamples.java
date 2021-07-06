import java.util.Scanner;

public class WhileLoopExamples {

    public static void main(String[] args){

//        int i =1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int sum =0;

        while(firstNumber<=secondNumber){

           sum = sum+firstNumber;

           firstNumber++;
        }
        System.out.println(sum);

//        int i=10;
//        while(i>=1){
//            System.out.println(i);
//            i--;
//        }




    }
}
