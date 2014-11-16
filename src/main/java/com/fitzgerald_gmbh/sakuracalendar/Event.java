package com.fitzgerald_gmbh.sakuracalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Level;

/**
 * Class representing Event.
 *
 * @author Kevin Kußmaul
 * @version 1.0
 */
class Event {

    private String name;
    private Date start;
    private Date end;
    private String content;
    private String Locoation;
    private EventType type;
    private boolean allDay;

    public Event(String name, Date start, Date end, String content, String Locoation, EventType type) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.content = content;
        this.Locoation = Locoation;
        this.type = type;
        this.allDay = false;
    }

    public Event(String name, Date day, String content, String Locoation, EventType type) {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        try {
            start = sdf.parse(sdf.format(day));
        } catch (ParseException ex) {
            SakuraCalendar.LOGGER.log(Level.WARN, null, ex);
        }
        
        this.end = start;
        this.content = content;
        this.Locoation = Locoation;
        this.type = type;
        this.allDay = true;
    }

}
