package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements LoggerService {

    @Override
    public void logToSystem(Object message) {
        jLoggerManager.log(message);   
    }
    
}
