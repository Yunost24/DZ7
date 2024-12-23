import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) {
        GregorianCalendar currentDate = new GregorianCalendar();

        // Получаем текущий год, месяц и день
        int currentYear = currentDate.get(Calendar.YEAR);
        int currentMonth = currentDate.get(Calendar.MONTH) + 1; // Месяцы начинаются с 0, поэтому прибавляем 1
        int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);


        System.out.println("Текущая дата: " + currentDay
                + '.' + currentMonth + '.' + currentYear);

    }
}
