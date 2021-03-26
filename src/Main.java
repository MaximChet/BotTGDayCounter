import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main extends DateUtils {
    public static void main(String[] args) throws ParseException {
        getTimeBetween();
    }
}

class DateUtils{
    public static void getTimeBetween() throws ParseException {
        LocalDate localdate = LocalDate.now();//Получаем сегодняшнюю дату
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Представляем в красивом формате
        LocalDate endDateExclusive = LocalDate.parse("24/08/2022", dateTimeFormatter);//Вводим дату окончания

        int days = localdate.until(endDateExclusive).getDays();
        int months = localdate.until(endDateExclusive).getMonths();
        int years = localdate.until(endDateExclusive).getYears();
        }
}
