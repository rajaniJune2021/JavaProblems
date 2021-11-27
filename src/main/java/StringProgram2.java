public class StringProgram2 {
    public static void main(String[] args) {
        String s1 = "abcd efgh";

//        String rev = "";
//        String[] s2 = s1.split(" ");
//
//        for (int i=0; i<s2.length;i++){
//            for (int j=s2[i].length()-1;j>=0;j--){
//                rev = rev + s2[i].charAt(j);
//            }
//            if(i<s2.length-1){
//            rev = rev +" ";}
//        }
//        System.out.println(rev);
//        System.out.println(rev.length());
//    }

        String inputString = "Java is a Programming Language";
        System.out.println(inputString.lastIndexOf("Language") + 8);
        String rev2 = "";
        String rev3 = "";
        String[] inputStringWords = inputString.split(" ");

           for(int i=inputStringWords.length-1; i>=0; i--){
               for(int j=inputStringWords[i].length()-1; j>=0;j--){

                   rev2 = rev2+inputStringWords[i].charAt(j);
               }

               if(i<inputString.length()-1){
                   rev2 = rev2 +" ";
               }

        //       rev2= rev2+inputStringWords[i] + " ";
           }
        System.out.println(rev2);




    }
}


// String and array programs

//    input String =Java is a Programming Language
//    output  String Language Programming a is Java
//    Reverse the entire string
//    Find the length of th string without using length method.
//    String input combination numbers and characters " abcd123" Print the ASCII value of each character in the string
//    write program of print the vowels and consonants
//    Print the most repeated character in String - input "Rajani" - output - a repeated character-
// Feb 27th
//    Print all the possibilities of substring of given input string.-
//   array program - write a program to find 2 numbers of an array whose sum is largest element of the given array. - example of an array input{1,4,10 }
//   anagram - write a program to check if two strings are anagrams. - ex: below and elbow - not and ton
//   pangrams in java - if the given string has all characters from A to Z.- Write a program to check given input string is panagrams.
//   input String rajani_gunda ; output String = RAJANIGUNDA
// reverse program input -RajaniGunda and output should be rajani_gunda
// remove numbers and spl characters from a given string and print only the alphabets. input string is -abc123@#&
// input string is  RajaniGunda and output string ajaniundaRG
// input string- Java is a programming language output string -Java is a language
// wap to reverse the even words of given string -Java is a programming language - output string - Java si a gnimmargorp language
// wap to first of letter of each -Java is a programming language - - output string - Jiapl
// WAP to find the missing number from the series of numbers an array ex:{1,2,3,4,5,6,7,9,10} - 8 is missing in this array
// WAP arrange the words of given string in an alphabetical way - input-"Rajani does not speak much "  output = does much not Rajani speak
// interchange the first and last words of the string -"Rajani does not speak much" output string -"much does not speak Rajani"
// WAP remove the multiple occurences of word in given string ="Rajani does not rajani much" -output - Rajani does not much

//march 9th

// WAP to print the common characters of two strings ex: input1="Rajani" input2="Naresh";

//march 10th
// WaP I/P: Java is a 'programming' language O/P: print the string enclosed in the single quotes output=programming
// wap to swap the pairs of characters in a given string i/p: rajani - o/p: arajin
// wap to increment the elements of array by one but no value should be equal to the initial maximum element of the array given input -{1,2,3,4,5,6,7,8,9} output value -{2,3,4,5,6,7,8,8,9}


//march 11th

//wap to print the middle character in a string //I/o: books //o/p: o
//wap to remove the spaces from the string without using split method //I/o: java is a programming language //o/p: javaisaprogramminglanguage

//march 17th
//Write a program to remove a given character from String?
//You need to write a Java method that will accept a String and a character to be removed and return a String, which doesn't has that character e.g remove(String word, char ch).
//wap to find the number of words ending with s in the given string - input: "miss rajani"; output :1
//wap to count the number of spaces in the given string ex: input: java is a programming language : output 4


//march 18th
//wap for each element find the next largest element input: {2,4,3,5,1,15} output {4,5,15,-1}
// Take an array of 5 elements find all the possible sub arrays of this array input {1,2,3,4,5,} - 1}
//{1,2}, 2, {2,3}.{2,4} {2,5} {2,3,4}, {2,3,4,5}
//create an array with elements divisable by 3 between 1 and 10
//wap to find whether a particular element present in array or not : input - {1,2,3,4,5} find element 5 - if it is present print true else print false;


// march 29th
// Find all the possible palindromes substrings in a given string : intput: racecar output: aceca, cec etc..
// Reverse only Alphabets without changing the numeric value position in a given string : input : a1b2c3 output: c1b2a3
// Find the all possible substring whose length is 4: input String: racecar output: race,acec, ceca, ecar, etc..
// Wap to remove an element from an array. input:{1,2,3,4,5} output: i,2,3,4 - printing and resizing the array.


//April 20th: These for arraylist and linkedarraylist
// wap to remove duplicates elements from the arraylist.
// wap to reverse the arraylist.
// wap to sort the elements of the arraylist.
// wap convert arraylist into array.
// wap to combine two arraylist into single arraylist.
// wap to find the size of the arraylist without using the pre-defined method.
// wap to compare two arraylist and print the common elements.
// wap to swap two elements of an arraylist.
// wap to create a subList from the arrayList.


//May 4th
// Try all the pre-defined methods in vector class.
// wap to reverse a stack
// wap to sort a stack
// wap to find a largest element of the stack
// wap to print balanced and unbalanced expression of expected order of elements. example: input: [(])
//output not balanced expression, //input: {[()]} - output: balanced expression
// wap to convert postfix and prefix example as below.
// expression:  A+B
//prefix: +AB
//postfix: AB+
//prefix: *+AB-CD
//(A+B) *(C-D)
//Postfix: AB+CD-*
//Postfix AB+ //output A+B
// May 5th

// wap to reverse a queue
//wap to sort a queue
//

//Has set problems

//clone a hashset into another hashset.
// wap to compare two hashsets. if the values are identical in two hashsets or not
// wap to merge two hashsets into one hashset.
// wap compare two hashsets and print only common elements
// same programms write for the treeset and linked hashset.

//May 13th
// wap find the occurences of a word in a given String using hashmap
// wap Convert roman numbers into integers ex: I - 1 ; II- 2 III-3, IV-4
// wap Convert into roman number for example: 5  return 'V'
// Input abdderdddddyuddpd  - how many 'dd' word repeated in a given string

//May 14th
//wap to find the largest key in the hashmap
//wap to sort the map based on the values
//wap to merge two hashmaps
// Convert a hashmap into tree map
// wap to count occurances of each character it repeated Ex: input Java (J:1; a:2; v:1)
// Take a larger number (123456123789123) - To print how many times this 123 repeated in the given String : output should be (123: 3times repeated)
// Try other methods of map interface
// wap whose map value matches then remove that value.
// wap to print only the duplicate characters in a string- ex input - java and output is  {a: 2}

// May 21st
// wap to find if a number is panagram or not if it contains (0-9) ex: 1234567890 ; 12 - this is not panagram
// Take a collection of words frame a sentence from all given words (Java, is , a, programming, language") - frame a sentence
// wap program convert binary number to octal number
// wap to check strings are anagram or not  by using hashMaps ex: listen and silent
// wap given a list of numbers find the whose sum pair is perfect square Ex: 1,2,3,4,5,6 ex: 3+6 =9; 1+3=4
// An array contains the Integer keys and another arrau contains the string values - wap to store those keys and values  in a hashmap
// All hash map methods


// May 27th
// Given an integer array construct a new array where each element is the no. of smaller elements to the right of that number in first array input: {1,3,4,2,0} output {1,2,2,1,0}
// Given a list of strings ["eat","ate","silent","listen","word"] find pairs of anagrams and put them in a map eat - ate here eat will become key and ate will be value in map ; for word there is no anagarm word will be key and value will be null
// String problem: input is 3[a]2[bc] output : aaabcbc another input : 3[a2[c]] output: accaccacc
// Given linkedList every pair have swap it I/P: [1,2,3,4] O/P: [2,1,4,3]
// Take LinkedList and whether given linkedList is palindrome list or not. input: I/P: [1,2,2,1]
// Given an array n no.of values in the range{0-n} find the missing number from that range input : {3,0,1} - output is : 2 second output {3,0} output is {1,2}

//June 1st
// enter keypad - 23(a,b,c) 3-(d,e,f) - ad,ae,af,bd,be,be,cd,ce,cf- this program should work with 2-9 number

//June 3rd
// Given a list of integers write a programm to store all the even numbers to right of the middle of number list.and left hand side number should be odd numbers. Input Ex: [1,2,3,5,6,7,8} output: [1,3,7,5,2,6,8]
// wap to reverse the strings in each pair of matching parentheses, starting from the innermost one input: (i(love)india) output: step 1: (ievolindia) final output aidnilovei
// wap to remove the outermost parentheses from the given input string. i/p: ( ( ) ( ) ) ( ( ) ) o/p: ( ) ( ) ( )

//June 9th
//wap to remove the duplicates from a list and print only the unique elements //i/p: [5,1,2,3,4,5] //o/p:[1,2,3,4]

//June24th
// wap to find the sum of the diagonal elements of a matrix
//        1 2 3
//        4 5 6
//        7 8 9

//wap to find the pair which gives the maximum product in an array
// {-5,-1,4,22,1,0,2,-22} - multiply pair of two elements find the max product of pair and print out

//July 5th:
// Array problem - 2 4 5 0 0 5 4 6 0 6 8 0 0, push all the zeros to the end, if previous

//July 10th
// 1 2 3
//4 5 6
//7 8 9 two dime array print in this order 1 2 3 6 9 8 7 4 5

///July 12th
//Print the elements which are common in all the rows and columns of the matrix.
// input
// 1 2 3
//4 1 3
//3 3 1 - // output should be {1,3}

//July 14th
//find the smallest missing positive integer in an array
//input {1,0,4,5,-1} output: 2 3

// pascal programm {1}{1,1}{1,2,1} - refer the one note map

// July 17th
// Find the sub matrix of a matrix whose sum is is equal to given number
//input:
//        1 2 3
//        4 5 6
//        7 8 9
//        sum is 12
//        output:
//        1 2
//        4 5


