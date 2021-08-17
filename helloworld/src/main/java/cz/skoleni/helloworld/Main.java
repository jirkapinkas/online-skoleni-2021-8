package cz.skoleni.helloworld;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Slf4j
public class Main {

//    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        log.debug("debug hlaska");
        log.info("info hlaska");
        log.warn("warn hlaska");
        log.error("error hlaska");

        Person person = Person.builder()
                .name("Jirka")
                .alive(true)
                .id(123)
                .build();
        System.out.println(person);
//        System.out.println(person.getName());

//        String fileName = "pom.xml2";
//        try {
//            List<String> strings = Files.readAllLines(Paths.get(fileName));
//            strings.forEach(System.out::println);
//        } catch (Exception e) {
//            log.error("Error reading file: " + fileName, e);
//        }
    }

}
