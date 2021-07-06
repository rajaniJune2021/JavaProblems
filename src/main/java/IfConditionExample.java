import java.util.Scanner;

public class IfConditionExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first subject marks");
//        int firstSubjectMarks = sc.nextInt();
//        System.out.println("Enter second subject marks");
//        int secondSubjectMarks = sc.nextInt();
//        System.out.println("Enter secondSubjectMarks marks");
//        int ThirdSubjectMarks = sc.nextInt();
//        System.out.println("Enter ThirdSubjectMarks");
//        int fourthSubjectMarks = sc.nextInt();
//        System.out.println("Enter fourthSubjectMarks marks");
//        int fifthSubjectMarks = sc.nextInt();
//        System.out.println("Enter fifthSubjectMarks marks");
//        int sixSubjectMarks = sc.nextInt();
//        float avg =  (firstSubjectMarks+secondSubjectMarks+ThirdSubjectMarks+fourthSubjectMarks+fifthSubjectMarks+sixSubjectMarks/6);
//        if(avg>=80){
//            System.out.println("Grade is A+");
//        }else if(avg>=70 && avg<80){
//            System.out.println("Grade is B");
//        }else if(avg>=60 && avg<70){
//            System.out.println("Grade is C");
//        }

        int cycleSpeedDistance;
        int rangeOfDistance;
        System.out.println("Enter run distance in meters");
        cycleSpeedDistance = sc.nextInt();
        System.out.println("Enter speed range of first number");
        rangeOfDistance =sc.nextInt();
        System.out.println("Enter speed range of last number");
        rangeOfDistance = sc.nextInt();
        float avgDistancePerMinute = (cycleSpeedDistance/60);

        if(avgDistancePerMinute>=1){
            System.out.println("The bicycler travelled with high speed with this this per minute " + avgDistancePerMinute );
        }
        if(avgDistancePerMinute<1){
            System.out.println("The bicycler travelled with medium speed with this this per minute" + avgDistancePerMinute);
        }
        if(avgDistancePerMinute<0.5){
            System.out.println("The bicycler travelled with minimum speed with this this per minute" + avgDistancePerMinute);
        }

        for (;rangeOfDistance<=1000;rangeOfDistance++){
            float avgSpeedRangeOfBiCycler = rangeOfDistance/60;
            System.out.println("The average speed Of Bicyler per minute "+avgSpeedRangeOfBiCycler);
        }

    }
}
