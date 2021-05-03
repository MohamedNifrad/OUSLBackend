package com.ims.springjwt.services;

import org.springframework.mail.javamail.JavaMailSender;

public interface EmailService {
    void sendMail(String toEmail, String subject, String message);
}
