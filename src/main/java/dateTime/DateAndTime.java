package dateTime;

import java.time.LocalDate;
import java.util.Arrays;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = increaseByOne("13:aa:2023");
       // if(date==LocalDate.now()) System.out.println("please enter a valid date , for more read exception in logs");
        System.out.println(date);
    }

    public static LocalDate increaseByOne(String str) {
        String[] arr = str.split(":");
        LocalDate result = LocalDate.now();
        //edge case to be taken care 1st length of array cannot be more than 3
        //date cannot be out of range (1-31)
        //month cannot be out of range(1-12)
        try {
            int day = Integer.parseInt(arr[0]);
            int month = Integer.parseInt(arr[1]);
            int year = Integer.parseInt(arr[2]);


            if (arr.length > 3 || day < 1 || day > 31 || month > 12 || month < 1) {
                throw new RuntimeException("illegal date entered");
            }
            LocalDate date = LocalDate.of(year, month, day);
            date = date.plusDays(1);
            date = date.plusMonths(1);
            date = date.plusYears(1);
            result = date;
        } catch (NumberFormatException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return result;
    }
}
