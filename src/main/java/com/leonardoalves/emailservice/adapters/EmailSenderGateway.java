package com.leonardoalves.emailservice.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}
