package com.chainofresponsibility;

public class ErrorLogProcessor extends LogProcessor {

    ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int logLevel, String msg){
        if(logLevel == LogProcessor.ERROR){
            System.out.println("Error, "+msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}
