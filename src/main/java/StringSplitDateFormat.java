import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class StringSplitDateFormat {
    public static void main(String[] args) throws ParseException {
//        String dateString = "1/12/2015-1/23/2015 (Current) ";
//        String[] numbers = dateString.replace('-','/').replace('(','/').replace(')','/').replace(' ','/').split("/");
//            Boolean  b = false;
//            for(String s : numbers){
//                System.out.println(s);
//            }
//            String currentyear=  numbers[2];
//            String nextyear = numbers[5];
//            String currentmonth = numbers[0];
//            String nextmonth = numbers[3];
//            if(!currentyear.equalsIgnoreCase(nextyear) || !(currentmonth.equalsIgnoreCase(nextmonth))){
//                b= true;
//            }
//           System.out.println(b);
        String dateString = "1/12/2015-12/23/2015 (Current) ";
        String dateRange = dateString.replace("(Current)","").trim();
        String[] policyDateRange = dateRange.split("-");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH);
        Date firstDate = sdf.parse(policyDateRange[1]);
        Date secondDate = sdf.parse(policyDateRange[0]);
        long diffInMilliSeconds = Math.abs(firstDate.getTime()-secondDate.getTime());
        long differenceInDays = TimeUnit.DAYS.convert(diffInMilliSeconds,TimeUnit.MILLISECONDS);
        System.out.println(differenceInDays/30);
    }
}
