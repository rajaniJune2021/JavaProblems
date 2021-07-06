import java.util.Scanner;

public class SwitchCaseWithLambdaExample {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        i = sc.nextInt();

        switch (i){
            case 1,3,5,7 -> System.out.println("Number is odd number");
            case 2,4,6,8 -> System.out.println("Number is even number");
            default -> System.out.println(i);
        }
    }
}
