package aco.w6.io;

import aco.w3.timeCount.TimeCounter;

import java.io.File;
import java.io.FileNotFoundException;

public class TestIoUtils {
    public static final String FILE_SOURCE = "/Users/o.kolomiyets/Downloads/стратегия oll.tv.pptx";
    public static final String FILE_DESTINATION = "/Users/o.kolomiyets/Downloads/imgo.pptx";

    public static void main(String[] args) {
        TimeCounter counter = new TimeCounter(() -> {
            try {
                byte[] mas = IOUtils.getBytesWithBuff(FILE_SOURCE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        String time = counter.countActionTime();
        System.out.println(time + "getBytesWithBuff");

        TimeCounter counter1 = new TimeCounter(() -> {
            try {
                byte[] mas = IOUtils.getBytes(FILE_SOURCE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        String time1 = counter.countActionTime();
        System.out.println(time1 + "getBytes");


        TimeCounter counter2 = new TimeCounter(() -> {
            try {
                String res = IOUtils.readFileContent(FILE_SOURCE);
                System.out.println(res + "***");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        String time2 = counter.countActionTime();
        System.out.println(time2 + "readFileContent");

        try {
            byte[] copy = IOUtils.getBytesWithBuff(FILE_SOURCE);
            IOUtils.writeInto(copy,FILE_DESTINATION);

            File file = new File(FILE_DESTINATION);
            System.out.println(file.exists() + "writeInto");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
