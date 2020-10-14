package chapter8;

import chapter8.classes.Period;

import java.time.LocalDate;
import java.util.Date;

/**
 * Make defensive copies when needed
 */
public class Item50 {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        System.out.println(p);

        // try to modify Date
//        end.setYear(78);
        p.end().setYear(78);
        System.out.println(p);
    }
}