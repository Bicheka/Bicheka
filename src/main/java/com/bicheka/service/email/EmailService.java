package com.bicheka.service.email;

public interface EmailService {
    void sendEmail(String to, String subject, String text);
}
