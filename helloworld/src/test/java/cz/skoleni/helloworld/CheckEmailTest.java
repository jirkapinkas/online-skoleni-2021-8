package cz.skoleni.helloworld;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckEmailTest {

    private CheckEmail checkEmail;

    @BeforeEach
    void setUp() {
        checkEmail = new CheckEmail();
    }

    @Test
    void isEmailValid() {
        assertTrue(checkEmail.isEmail("jirka.pinkas@gmail.com"));
    }

    @Test
    void isEmailInvalid() {
        assertFalse(checkEmail.isEmail("jirka.pinkas@gmail"));
    }

}