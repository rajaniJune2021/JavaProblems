import java.util.Scanner;

public class ReturnValueFromUsingSwitchCaseLamda {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        i=  sc.nextInt();
        String s ="";

         s =switch (i){
            case 1,3,5,7,9 -> "odd number";
            case 2,4,6,8,10->"even number";
            default -> s;
        };
        System.out.println(s);
    }
}
