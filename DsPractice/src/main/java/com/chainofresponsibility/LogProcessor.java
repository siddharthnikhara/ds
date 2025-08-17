package com.chainofresponsibility;

public class LogProcessor {
    public static final int INFO = 1;
    public static final int ERROR = 2;
    LogProcessor logProcessor;
    LogProcessor(LogProcessor logProcessor) {
        this.logProcessor = logProcessor;
    }
    void log(int logLevel, String msg) {
        if(logProcessor!= null) {
            logProcessor.log(logLevel,msg);
        }
    }
}
