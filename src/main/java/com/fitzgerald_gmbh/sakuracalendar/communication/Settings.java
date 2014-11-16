package com.fitzgerald_gmbh.sakuracalendar.communication;

/**
 * Class representing Settings.
 * @author Kevin Kußmaul
 * @version 1.0
 */
public class Settings {
    
    private static Lang lang;
    private static boolean Hiragana = false;
    private static String logFilePath = "Surveillance\\log.txt";

    public static String getLogFilePath() {
        return logFilePath;
    }

    public static void setLogFilePath(String logFilePath) {
        Settings.logFilePath = logFilePath;
    }

    public static boolean isHiragana() {
        return Hiragana;
    }

    public static void setHiragana(boolean Hiragana) {
        Settings.Hiragana = Hiragana;
    }

    public static Lang getLang() {
        return lang;
    }

    public static void setLang(Lang lang) {
        Settings.lang = lang;
        Messages.setLang(lang);
    }

   

}