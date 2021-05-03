package com.ims.springjwt.services.impl;

import com.ims.springjwt.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceimpl implements EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public EmailServiceimpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(String toEmail, String subject, String message) {


        // var mailMessage = new SimpleMailMessage();
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //Mail mailMessage = new Mail();

        mailMessage.setFrom("sendmailusingnifrad@gmail.com");
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);

        javaMailSender.send(mailMessage);
    }
}
