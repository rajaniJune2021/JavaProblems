public class StringExample1 {

//    String is immutable object
//    String s1= "Rajani"; create memory with value rajani during compile time
//    s1="gunda"; - will not modify the object reference and create new object refrence with the new assigned value"gunda" so it's called immutable
//    s1 behaves as variable, object of string class.
//    To use re-usable method to follow uniformity across the project level hence it made it as class
public static void main(String[] args) {
    String s1 ="rajani";
       //ToLowerCase;TOUpperCase,isequals,isEmpty,chartAt(index);split
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println(s1.equalsIgnoreCase("gunda"));
    System.out.println(s1.isEmpty());
    System.out.println(s1.charAt(3));
    System.out.println(s1.split("a"));

    //reverse the string

    String rev = "";

    for (int i=s1.length()-1;i>=0;i--){
        rev = rev + s1.charAt(i);
    }
    System.out.println(rev);

}


}
