package Collections;

public class CheckGivenNumberISArmStrongNumberOrNot {

    //153 = 1*1*1 + 5*5*5 + 3*3*3 = 153

    public static void main(String[] args) {
        int numb = 153;

        int power = power(numb);

        int copyOfNumber = numb%10;
        int sum1  =0;

        while(copyOfNumber!=0){
            int factorial =1;
            for(int i=0; i<power;i++){
             factorial  = factorial * copyOfNumber;
            }

            sum1 = sum1+factorial;
         copyOfNumber = copyOfNumber/10;

        }

    }

    public static int power(int number){
        int n =0;
        int sum =0;
        while(number !=0){
            n++;
        sum = sum+ number %10;
        }
      number =  number/10;
        return n;
    }
}
