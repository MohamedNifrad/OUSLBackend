package com.ims.springjwt.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailComponent {
    @Autowired
    private JavaMailSender javaMailSender;

    public EmailComponent(JavaMailSender javaMailSender) {
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
