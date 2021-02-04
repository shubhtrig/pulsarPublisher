package com.narvar.automate.queuePublisher.utils;

import org.apache.commons.lang3.ObjectUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Objects;

public class DateUtils {

    private DateUtils() {
        // This is a utility class with static methods
    }

    /**
     * @param date
     * @return String representation of date in Global format yyyy-MM-dd'T'HH:mm:ssZZZ
     */
    public static String getDateInShopifyFormat(Date date) {
        DateFormat SHOPIFY_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ");
        if (Objects.nonNull(date)) {
            return SHOPIFY_FORMAT.format(date);
        }
        return null;
    }

    /**
     * @param date
     * @param format
     * @return String representation of date in Global format yyyy-MM-dd't'HH:mm:ssZ
     * @throws ParseException
     */
    public static String getDateInShopifyFormat(String date, String format) throws ParseException {
        if (ObjectUtils.allNotNull(date, format)) {
            return getDateInShopifyFormat(getDate(date, format));
        }
        return null;
    }

    /**
     * @param date
     * @param format
     * @return String representation of date in given format
     */
    public static String getDate(Date date, String format) {
        if (ObjectUtils.allNotNull(date, format)) {
            DateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.format(date);
        }
        return null;
    }

    /**
     * @param date
     * @param format
     * @return Date representation of date given in format
     * @throws ParseException
     */
    public static Date getDate(String date, String format) throws ParseException {
        if (ObjectUtils.allNotNull(date, format)) {
            DateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.parse(date);
        }
        return null;
    }

    /**
     * Converts Date to LocalDateTime
     *
     * @param date
     * @return LocalDateTime
     */
    public static LocalDateTime getLocalDateTime(Date date) {
        if (Objects.nonNull(date)) {
            return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        }
        return null;
    }

    /**
     * Converts LocalDateTime to UTC date formatted String.
     *
     * @param localDateTime
     * @return String
     */
    public static String getDateInUTC(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.systemDefault()).toInstant().toString();
    }

    /**
     * Converts Date as a String to UTC date formatted String.
     *
     * @param offsetDate date string with offset
     * @return String
     */
    public static String getDateInUTC(String offsetDate) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(offsetDate);
        return offsetDateTime.toInstant().toString();
    }

    /**
     * Gets difference between two dates
     *
     * @param startDate
     * @param endDate
     * @return long difference in days
     */
    public static long findDiffrenceInDays(Date startDate, Date endDate) {
        return ChronoUnit.SECONDS.between(startDate.toInstant(), endDate.toInstant());
    }


}
