//Questions
// Can abstract class can be instantiated?
// if above answer is "No " then why?
// if class implements parent and child interface - example class A implements B(bhild interface, and Class A implements A, B - is it same or different?
// How to return multiple values by one method( via collection returning such as hash map, hash set, Arraylist, linkiedlist)
// if method accepts the String but variable is in Integer - how you handle it? by type casting String.valueOf
// how can we figured out class has how many objects has been created. By giving static int variable in construct with count and then print it in the main method
// if child extends the parent class and object has been created for the childClassObj = new ChildClass with this child class method called - whether class methods class methods be printed along with child class methods ? - Answer no only child class methods will be child constructor will be invoked and child class methods invoked.
// Can class have multiple static variables and static methods - why or why not? when static variables and static methods being created in JAva Class loader will load all the static variable before execution. so creation of variables will be take longer time before executing the script and leads to the out of memory exception
// Why exception handling is important in programing
// Why string is immutable object- since whenever create string variable - it create new object reference it will not update the old reference where as int other variables will update the older reference by overriding the value with new value.
// wap find the largest number in an array when all the numbers are reversed.- problem coding question -1
// Write a program two swap tow numbers without using third - problem coding questions-2

class ExamOneB extends CLassA{

    static int count =0 ;
    public ExamOneB(){
        System.out.println("Initializing the class methods and variables");
        count++;
    }
        public void abc(){
            System.out.println("B class abc method");
        }

    public static void main(String[] args) {
        ExamOneB b = new ExamOneB();
        ExamOneB b1 = new ExamOneB();
        System.out.println("count of the objs");
        System.out.println(count);
//        b.abc();
//        b1.abc();
    }
}
