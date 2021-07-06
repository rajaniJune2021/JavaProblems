import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args){

        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
         s = sc.next();
         switch (s){
             case "Tom":
                 System.out.println("Printing first name of player name");
                 break;
             case "Steve","Rajani":
                 System.out.println("Printing second player name");
                 break;
             case "Lisa":
                 System.out.println("printing third player name");
                 break;
             default:
         }

    }
}
