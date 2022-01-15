package classes;

import interfaces.Postable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
public class Time extends Thread{
 private static Calendar currentTime = GregorianCalendar.getInstance();
 public void run()
 {

     while( currentTime.get(Calendar.YEAR) != 2025) {
         currentTime.add(currentTime.DATE, 100);
         try {
             TimeUnit.SECONDS.sleep(1);
             System.out.println("прошло 100 дней");
         } catch (Exception e) {
             System.out.println("zxc");

         }

     }
     System.out.println("результаты флешмоба - "+HomeShelter.getFleshmobResult()+" нашли дом");
     System.exit(0);
 }
}
