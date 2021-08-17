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
        assertTrue(checkEmail.isEmail("1jirka.pinkas@gmail.com"));
        assertTrue(checkEmail.isEmail("123@gmail.com"));
        assertTrue(checkEmail.isEmail("123@127.0.0.1"));
    }

    @Test
    void isEmailInvalid() {
        assertFalse(checkEmail.isEmail("jirka.pinkas@gmail"));
    }

}