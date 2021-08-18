package cz.skoleni.helloworld.mocking;

import cz.skoleni.helloworld.CheckEmail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SendEmailServiceTest {

    private SendEmailService sendEmailService;

    @BeforeEach
    void setUp() {
        EmailService emailServiceMock = Mockito.mock(EmailService.class);
        CheckEmail checkEmail = new CheckEmail();
        sendEmailService = new SendEmailService(emailServiceMock, checkEmail);
    }

    @Test
    void sendEmail() {
        List<String> addresses = Arrays.asList("jirka@gmail.com", "michal@seznam.cz", "pepa@email.cz", "franta");
        int actualSentEmails = sendEmailService.sendEmail(addresses, "", "");
        assertEquals(3, actualSentEmails);
    }
}