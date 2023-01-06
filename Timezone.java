import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//common used classes from java.time package.
//LocalDate-->Represents a date
//LocalTime-->Represents a time
//LocalDateTime-->Represents a date+time
//DateTimeFormatter-->Formatter for a displaying and parsing date-time objects.
public class Timezone {
    public static void main(String[] args) {
        //This class keeps accuracy up to nanoseconds.
        LocalDate d= LocalDate.now();
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);
    }
}
