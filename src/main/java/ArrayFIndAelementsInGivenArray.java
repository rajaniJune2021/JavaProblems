import java.util.Scanner;

public class ArrayFIndAelementsInGivenArray {

    //wap to find whether a particular element present in array or not : input - {1,2,3,4,5} find element 5 - if it is present print true else print false;

    public static void main(String[] args) {

        int[] intArray ={1,2,3,4,5};
        int find;
       boolean b= false;

        Scanner sc = new Scanner(System.in);
        find = sc.nextInt();

        for(int i=0;i<intArray.length;i++){
            if(find == intArray[i]){
                b = true;
            }else{
                b = false;
            }
        }

        System.out.println(b);
    }
}
