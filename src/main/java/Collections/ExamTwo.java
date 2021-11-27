package Collections;

//wap to print the odd digits present in a number
//input: 2345
//        output: in3 5

//wap to find the number of characters in a string excluding spaces and commas
//Input: Rajani Gunda
////        Output: 11
//wap to find if a number is panagram or not

//Input: 1234567890
//        Output: yes
import java.util.HashSet;
import java.util.Set;

public class ExamTwo {

    public static void main(String[] args) {
//        int num = 2345;
//        boolean b = false;
//        int temp = 0;
//        while(num!= 0){
//           temp =  num % 10;
//          if(temp%2==0){
//             b= false;
//          }else{
//             b= true;
//          }
//          num = num/10;
//            if(b){
//                System.out.println(temp);
//            }
//        }

//       String s = "Rajani Gunda%%";
//       String  s1 = s.replace(" ","").toUpperCase();
//       int count =0;
//       for(int i=0; i<s1.length();i++){
//           int value = s1.charAt(i);
//                   if(value >=65 && value <=120 || !(s1.equalsIgnoreCase(",") )){
//                       count++;
//                   }
//       }
//        System.out.println(count);

       int num = 1234567890;
       Set<Integer> hs = new HashSet<>();
       int temp;
       boolean b = false;
       boolean b1 = true;
       while (num !=0){
           temp = num %10;
           hs.add(temp);
           num = num/10;
       }

       for(int i=0; i<10;i++){
           if(hs.contains(i)){
               b = true;
           }else {
               b1 = false;
           }
       }
        if(b & b1){
            System.out.println("given number is panagram");
        }else {
            System.out.println("given number is not panagram");
        }
    }
}
