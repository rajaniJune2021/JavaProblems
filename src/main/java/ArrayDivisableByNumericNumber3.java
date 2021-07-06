import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDivisableByNumericNumber3 {

    //create an array with elements divisable by 3 between 1 and 10

    public static void main(String[] args) {
          int sizeOfArray=0;
        for(int i=1;i<=10;i++){
            if(i%3==0){
                sizeOfArray++;
            }
        }

        int j[] = new int[sizeOfArray];
        int count=0;

            for(int i=1; i<=10;i++){
                if(i%3 ==0){
                    j[count] = i;
                    count++;
                }
            }

        for(int l: j){
            System.out.println(l);
        }

    }
}
