package com.fitzgerald_gmbh.sakuracalendar;

import com.fitzgerald_gmbh.sakuracalendar.communication.Settings;

/**
 * Enumeration of Weekdays.
 *
 * @author Kevin Kußmaul
 * @version 1.0
 */
public enum Weekday {

    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    private final int id;
    private final String name;

    private Weekday(int id) {
        this.id = id;
        name = Settings.getLang().getWeekdayName(id);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
