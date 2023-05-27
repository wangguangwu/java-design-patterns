package com.wangguangwu.demo1;

import com.wangguangwu.demo1.product.AbstractLogger;
import com.wangguangwu.demo1.product.ErrorLogger;

/**
 * @author wangguangwu
 */
public class ChainOfResponsibilityPatternDemo {

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ErrorLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
