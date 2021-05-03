package com.ims.springjwt.controllers;

import com.ims.springjwt.bean.EmailComponent;
import com.ims.springjwt.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

    @Autowired
    private EmailComponent emailComponent;

    // @PostMapping(value = "/sendmail")
    @RequestMapping(value = "/sendmail")
    public void sendEmail() {
        // use mailSender here...
        System.out.println("controller done..!");
        emailComponent.sendMail("mohamednifrad99@gmail.com", "Test Subject", "Test mail");
        System.out.println("controller done2..!");
    }

//    @Autowired
//    private EmailService emailService;
//
//    @PostMapping(value = "/sendmail")
//    public void sendEmail() {
//        // use mailSender here...
//        System.out.println("controller done..!");
//        emailService.sendMail("mohamednifrad99@gmail.com", "Test Subject", "Test mail");
//        System.out.println("controller done2..!");
//    }
}
