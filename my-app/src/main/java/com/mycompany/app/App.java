package com.mycompany.app;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
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
