package org.example;

import org.apache.log4j.Logger;
import org.example.serviceHTTP.HttpImageStatusCli;
import org.example.serviceHTTP.HttpStatusChecker;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    final private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
    logger.info("Program start!");
    logger.info(HttpStatusChecker.getStatusImage(404));
        HttpImageStatusCli httpImageStatusCli = new HttpImageStatusCli();
        httpImageStatusCli.askStatus();
    logger.info("Program end");
    }
}