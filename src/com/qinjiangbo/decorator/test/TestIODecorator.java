package com.qinjiangbo.decorator.test;

import com.qinjiangbo.decorator.decorator.LowerCaseInputStream;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/15 8:59 PM
 * Author: Richard
 */
public class TestIODecorator {

    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream inputStream =
                    new LowerCaseInputStream(
                        new BufferedInputStream(
                            new FileInputStream("/Users/Richard/IdeaProjects/DesignPatterns/src/hk/inso/decorator/test/text.txt")));
            while ((c=inputStream.read()) >= 0) {
                System.out.print((char)c);
            }
            inputStream.close();
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
