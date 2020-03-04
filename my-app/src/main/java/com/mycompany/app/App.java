package com.mycompany.app;

// We do not use the ConsoleAppender
// import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

/**
 * Hello world!
 *
 */
public class App {

    private static Logger logger = Logger.getRootLogger();

    public static void main(String[] args) {

        try {
            SimpleLayout layout = new SimpleLayout();
            // We do not use the ConsoleAppender
            // ConsoleAppender consoleAppender = new ConsoleAppender(layout);
            // logger.addAppender(consoleAppender);
            FileAppender fileAppender = new FileAppender(layout, "./my-app.log", false);
            logger.addAppender(fileAppender);
            // ALL | DEBUG | INFO | WARN | ERROR | FATAL | OFF:
            logger.setLevel(Level.INFO);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        logger.debug("My  test DEBUG message");
        logger.info("My  test INFO message");
        logger.warn("My  test WARN message");
        logger.error("My  test ERROR message");
        logger.fatal("My  test FATAL error message");

        System.out.println("Hello, World!");

        // Do some very simple stuff with docx4j:
        String inputfilepath = "data/sample.docx";
        try {
            WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(inputfilepath));
            System.out.println("Opened file \"" + inputfilepath + "\".");
            System.out.println("Document's title is \"" + wordMLPackage.getTitle() + "\".");
        } catch (Docx4JException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
