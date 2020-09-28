import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class BonusDates {

    static void printBonusDatesBetween(int fromYear, int toYear) {

        int diff = toYear - fromYear;
        for (int year = fromYear; year < toYear; year++) {
            
            String newString = String.valueOf(year);

            byte[] strAsByteArray = newString.getBytes();
            byte[] result = new byte[strAsByteArray.length];

            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];

            String reversed = year + new String(result);

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyMMdd");
                LocalDate newDate = LocalDate.parse(reversed, formatter);
                System.out.println(newDate);
            } catch (DateTimeParseException  e) {
                
            }
        }
    }

    public static void main(String[] args) {

        printBonusDatesBetween(1919, 2040);
    }
}
