import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class date_time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//converted into seconds,hours,days,years

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());// returns number in millisonds since jan 1970
       
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());//prints the timezone
        System.out.println(c.getTime());

        //Change the timezone
        Calendar t = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(t.getCalendarType());
        System.out.println(t.getTimeZone().getID());
        //Calender Methods
        Calendar s = Calendar.getInstance();
        System.out.println(s.get(Calendar.SECOND));
        System.out.println(s.get(Calendar.MINUTE));
        System.out.println(s.get(Calendar.HOUR));
        System.out.println(s.get(Calendar.DATE));
        System.out.println(s.get(Calendar.YEAR));
        
        //Gregorian Calender 
        //GregorianCalender cal = new GregorianCalender();

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        //java.time package
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //dateTime Formatter class
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY||");//this is format
        //DateTimeFormatter df2 = DateTimeFormatter.ISO_OFFSET_DATE; // find more in java 14 docs
        System.out.println(df);
        String myDate  = dt.format(df);
        System.out.println(myDate);

    }
    
}


/*
 java time - package for date and time in java (from java 8 onwards)
 before java 8,java.util package used to hold the date and time classes. now these classes are deprecated
 
 How java stores a Date? -> Date in java is stored in the form of a long number.(Long datatype) This long number holds the number of miliseconds
  passed since 1 Jan 1970
 Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever we ask it for years passed.
 System.currentTimeMillis() returns no of  milliseconds seconds passed.Once no of ms are calculated,we can calculate minutes,seconds& years passed.
 
 *It is safe to store milliseconds in Long datatype *

 The Date class in Java :
 Date d = new Date();

 The Calender class in java :  An *Abstract* class 
 but it has a static method which allows to make an instance 
  Calender c = Calender.getInstance();
  
  Gregorian Calender Class : concrete subclass of Calender and provides Calender system used by most of the world
  GregorianCalender cal = new GregorianCalender();
 *java 14 docs*

 Timezone class is used to create time zones in java.Some of the important methods of timezone class are :
 getAvailableIDs()
 getDefault() - default timezone
 getID  


 Java.time Package : 
 Available from java & onwards
 Capable of string even name seconds
 commonly used classes from java.time package : 
 LocalDate 
 LocalTime
 LocalDateTime
 DateTimeFormatte
 Clock
 
 */