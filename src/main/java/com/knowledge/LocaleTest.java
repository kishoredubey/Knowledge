package com.knowledge;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.TimeZone;

public class LocaleTest {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
         TimeZone timezone = TimeZone.getTimeZone(ZoneId.of("America/New_York"));
        System.out.println(timezone.getDisplayName(false, TimeZone.SHORT));

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL).format(now));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.LONG).format(now));
    }
}
// Java 11 without COMPAT
// Wednesday, May 18, 2022 at 7:28:32 PM Singapore Standard Time
// May 18, 2022 at 7:28:32 PM SGT

// Java 11 with COMPAT
//Wednesday, May 18, 2022 7:31:12 PM SGT
//        May 18, 2022 7:31:12 PM SGT

// HJava 8
//Wednesday, May 18, 2022 7:30:08 PM SGT
//        May 18, 2022 7:30:08 PM SGT