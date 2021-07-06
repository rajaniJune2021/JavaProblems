import java.util.Scanner;

public class ForAndWhileLoop {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter firstNumber number");
//        int firstNumber = sc.nextInt();
//        System.out.println("enter secondNumber number");
//        int secondNumber = sc.nextInt();
//        System.out.println("5 divisables between the range specified are  ");

//        while(firstNumber<=secondNumber){
//
//            if(firstNumber%5==0){
//                System.out.println(firstNumber);
//            }
//            firstNumber++;
//
//        }
//
//        for(;firstNumber<=secondNumber;firstNumber++){
//            if(firstNumber%5==0){
//                System.out.println(firstNumber);
//            }
//        }

        //print the odd numbers and even numbers
        //print the square of between the range 1-1; 2-4;
        //reverse a number ex:1435

//        for (; firstNumber <= secondNumber; firstNumber++) {
//            //   System.out.println("These are even numbers :::");
//            if (firstNumber % 2 == 0) {
//                System.out.print("This is even number " + firstNumber);
//            }
//
//            if (firstNumber % 2 == 1) {
//                System.out.print("These are odd numbers" + firstNumber);
//            }
//        }
//        if (firstNumber % 2 != 0) {
//            System.out.println("these are odd numbers");
//            System.out.println(firstNumber);
//        }
//
//
//        for (; firstNumber <= secondNumber; firstNumber++) {
//
//            int result = firstNumber * firstNumber;
//
//            System.out.println(firstNumber + " " + "-" + result);
//        }

        int number = 12345;
        int result = 0;

        while(number !=0) {
           int i = number % 10;
            result = i+result * 10;
            number = number / 10;
        }
        System.out.println(result);
    }


}
