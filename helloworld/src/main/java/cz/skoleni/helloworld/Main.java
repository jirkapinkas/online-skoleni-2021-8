package cz.skoleni.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        log.debug("debug hlaska");
        log.info("info hlaska");
        log.warn("warn hlaska");
        log.error("error hlaska");

//        String fileName = "pom.xml2";
//        try {
//            List<String> strings = Files.readAllLines(Paths.get(fileName));
//            strings.forEach(System.out::println);
//        } catch (Exception e) {
//            log.error("Error reading file: " + fileName, e);
//        }
    }

}
