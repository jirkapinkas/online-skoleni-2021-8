package cz.skoleni.helloworld.mocking;

import cz.skoleni.helloworld.CheckEmail;

import java.util.List;
import java.util.Objects;

public class SendEmailService {

    private EmailService emailService;

    private CheckEmail checkEmail;

    public SendEmailService(EmailService emailService, CheckEmail checkEmail) {
        this.emailService = emailService;
        this.checkEmail = checkEmail;
    }

    public int sendEmail(List<String> addresses, String subject, String body) {
        Objects.requireNonNull(subject);
        Objects.requireNonNull(body);
        int sentEmails = 0;
        for (String address : addresses) {
            boolean isEmail = checkEmail.isEmail(address);
            if(isEmail) {
                emailService.sendEmail(address, subject, body);
                sentEmails++;
            }
        }
        return sentEmails;
    }

}
