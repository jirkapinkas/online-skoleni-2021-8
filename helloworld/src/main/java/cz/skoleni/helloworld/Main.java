package cz.skoleni.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.debug("debug hlaska");
        log.info("info hlaska");
        log.warn("warn hlaska");
        log.error("error hlaska");
    }

}
