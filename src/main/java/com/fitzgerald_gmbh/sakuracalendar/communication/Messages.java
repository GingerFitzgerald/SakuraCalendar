package com.fitzgerald_gmbh.sakuracalendar.communication;

/**
 * Class representing Messages.
 *
 * @author Kevin Kußmaul
 * @version 1.0
 */
public class Messages {

    public static String[] WEEKDAY_NAMES;
    

    public static void setLang(Lang lang) {
        switch (lang) {
            case DE:
                String[] gerWD = {"Montag", "Dienstag", "Mittwoch", "Donerstag", "Freitag", "Samstag", "Sonntag"};
                WEEKDAY_NAMES = gerWD;
                break;
            case EN:
                String[] enWD = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                WEEKDAY_NAMES = enWD;
                break;
            case JP:
                String[] jpWD = {"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日",
                    "げつようび", "かようび", "すいようび", "もくようび", "きんようび", "どようび", "にちようび"};
                WEEKDAY_NAMES = jpWD;
                break;
            default:
                setLang(Lang.EN);
        }

    }
}
