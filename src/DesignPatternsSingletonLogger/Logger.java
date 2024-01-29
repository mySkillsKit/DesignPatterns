package DesignPatternsSingletonLogger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    // В этом поле храним ссылку на тот
    // единственный объект этого класса
    // который будем отдавать пользователям
    private static volatile Logger logger;

    private Logger() {
    }
    public static Logger getInstance() {
        Logger locallogger = logger;
        if (locallogger == null) {
            synchronized (Logger.class) {
                locallogger = logger;
                if (locallogger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String msg) {
        Date data = new Date();
        SimpleDateFormat formatForDate = new SimpleDateFormat("yyyy.mm.dd hh:mm:ss");
        System.out.println("[" + formatForDate.format(data) + " " + num++ + "] " + msg);
    }

}
