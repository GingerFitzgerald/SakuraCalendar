package com.fitzgerald_gmbh.sakuracalendar;

import com.fitzgerald_gmbh.sakuracalendar.communication.Settings;
import java.io.IOException;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.TTCCLayout;

/**
 * Class representing Sakura Calendar.
 *
 * @author Kevin Kußmaul
 * @version 1.0
 */
public class SakuraCalendar {

    public static Logger LOGGER = Logger.getRootLogger();
    public static long startTimeStamp = System.currentTimeMillis();

    public static void main(String[] args) {
        LOGGER.addAppender(new ConsoleAppender(new SimpleLayout()));
        try {
            LOGGER.addAppender(new FileAppender(new TTCCLayout("YYYY-MM-dd-hh-mm-ss:SSS-aa"), Settings.getLogFilePath()));

        } catch (IOException ex) {
            LOGGER.log(Level.ERROR, "Failed to initialize logger", ex);
        }
        LOGGER.log(Level.INFO, "Started logging");
    }
}
