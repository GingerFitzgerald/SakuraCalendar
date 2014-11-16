package com.fitzgerald_gmbh.sakuracalendar;

import java.awt.Color;

/**
 * Class representing EventType.
 * @author Kevin Kußmaul
 * @version 1.0
 */
class EventType {
   private String name;
   private Color backgroundColor;

    public EventType(String name, Color backgroundColor) {
        this.name = name;
        this.backgroundColor = backgroundColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

}