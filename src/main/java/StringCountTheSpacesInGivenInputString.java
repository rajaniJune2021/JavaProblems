public class StringCountTheSpacesInGivenInputString {
    //wap to count the number of spaces in the given string ex: input: java is a programming language : output 4
    public static void main(String[] args) {
         String input = "java is a programming language";
         int count =0;
//        String[] words =  input.split(" ");
//         int len =   words.length-1;
//        System.out.println(len);
         for(int i=0; i<input.length();i++){
             if(!(input.charAt(i) >90) || !(input.charAt(i) <122)){
                 count++;
             }
         }
        System.out.println(count);
    }
}
