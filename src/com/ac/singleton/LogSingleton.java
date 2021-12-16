package com.ac.singleton;

/**
 * Singleton is a design pattern which allows instantiating only one object of a class which can be used globally by
 * any parts of an application.
 * Singleton class has a static field which contains the only one instance, a private constructor, and a static factory
 * method for instantiating. Described above fields and methods prevent creating more than one object.
 * A developer cannot predict how the instance can be changed by other points where singleton is used, especially
 * within concurrent system. Moreover, the assumption of a necessity of the only one instance may end up false
 * in the future when management decides to expand the application.
 * Therefore, it's better to use singleton in specific situations like cache of objects or logging in simple apps.
 * Log file can be used within the number of services. If we deal with concurrency, several threads can change the
 * instance of singleton. Therefore, we should pay attention to multithreading and thread safe methods within a singleton.
 */
public class LogSingleton {

    private static LogSingleton LOG_INSTANCE;
    private static String logFile = "Log Info \n";

    private LogSingleton() {
    }

    public static synchronized LogSingleton getInstance() {
        if (LOG_INSTANCE == null) {
            LOG_INSTANCE = new LogSingleton();
        }

        return LOG_INSTANCE;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
