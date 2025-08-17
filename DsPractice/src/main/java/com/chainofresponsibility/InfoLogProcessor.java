package com.chainofresponsibility;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int logLevel, String msg){
        if(logLevel == LogProcessor.INFO){
            System.out.println("INFO, "+msg);
        } else {
            super.log(logLevel, msg);
        }
    }

    public static void main(String[] args) {
        LogProcessor logProcessor = new LogProcessor(new ErrorLogProcessor(new InfoLogProcessor(null)));
        logProcessor.log(ERROR, "error");
        logProcessor.log(INFO, "info");
    }

}
