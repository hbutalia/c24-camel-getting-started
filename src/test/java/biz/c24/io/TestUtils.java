package biz.c24.io;


import org.springframework.core.io.ClassPathResource;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestUtils {

    public final static String INBOUND_FILE = "/data/purchase-order.xml";

    public final static String PARSE_FAIL_FILE = "/data/parse-failure.xml";


    public final static String INBOUND_FILE_NAME =  "purchase-order.xml";



    public static String readFileAsString(File file) throws java.io.IOException {
        byte[] buffer = new byte[(int) file.length()];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        bufferedInputStream.read(buffer);
        return new String(buffer);
    }

    public static File locateClasspathResource(String resourceName) {
        try {
            return new ClassPathResource(resourceName).getFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void assertThatDirectoryHasFiles(File directory, int expectedFileCount) throws Exception {
        int count = 0;
        while (directory.listFiles().length < expectedFileCount && count++ < 10) {
            Thread.sleep(500);
        }
        assertThat(directory.listFiles().length, is(expectedFileCount));
    }

    public static void assertThatDirectoryIsEmpty(File directory) throws Exception {
        int count = 0;
        while (directory.listFiles().length > 0 && count++ < 10) {
            Thread.sleep(500);
        }
        assertThat(directory.listFiles().length, is(0));
    }

}