package com.fitzgerald_gmbh.sakuracalendar.communication;

import com.fitzgerald_gmbh.sakuracalendar.Weekday;

/**
 * Enumeration of Languages.
 *
 * @author Kevin Kußmaul
 * @version 1.0
 */
public enum Lang {

    EN(0),
    DE(1),
    JP(2);

    private final String[] weekdayNames = new String[7];

    private final int id;

    private Lang(int id) {
        this.id = id;
        Messages.setLang(this);
        int index = 0, mod = 0;

        if (id == 3 && Settings.isHiragana()) {
            mod = index = 7;
        }
        while (index < 7 + mod) {
            this.weekdayNames[index] = Messages.WEEKDAY_NAMES[index];
            index++;
        }

    }

    public String getWeekdayName(Weekday day) {
        return this.getWeekdayName(day.getId());
    }

    public String getWeekdayName(int id) {
        return weekdayNames[id];
    }
}
