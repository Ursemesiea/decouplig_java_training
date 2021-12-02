package fr.lernejo.logger;

import java.util.function.Predicate;

public class LoggerFactory {
    public static Logger getLogger (String name)
    {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        return consoleLogger;
    }


}
