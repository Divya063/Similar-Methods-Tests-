/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author divya rani
 */
public class simpleDateFormat {
    public void TestTwoDigitYearDSTParse()
    {
        SimpleDateFormat fullFmt =
            new SimpleDateFormat("EEE MMM dd HH:mm:ss.SSS zzz yyyy G");

        //DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL,
        //                                                Locale.ENGLISH);
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yy h:mm:ss 'o''clock' a z",
                                                    Locale.ENGLISH);
        //Date date = new Date(2004-1900, Calendar.APRIL, 3, 2, 20, 47);
        //logln(fmt.format(date)); // This shows what the current locale format is
        //logln(((SimpleDateFormat)fmt).toPattern());
        TimeZone save = TimeZone.getDefault();
        TimeZone PST  = TimeZone.getTimeZone("PST");
        String s = "03-Apr-04 2:20:47 o'clock AM PST";
        int hour = 2;
        try {
            TimeZone.setDefault(PST);
            Date d = fmt.parse(s);
            logln(s + " P> " + fullFmt.format(d));
            if (d.getHours() != hour) {
                errln("FAIL: Should parse to hour " + hour);
            }
        }
        catch (ParseException e) { errln("FAIL: " + e.getMessage()); }
        finally {
            TimeZone.setDefault(save);
        }
    }
    
}
