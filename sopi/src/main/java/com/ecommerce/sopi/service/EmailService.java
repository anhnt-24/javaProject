package com.ecommerce.sopi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;



@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendHtmlMessage(String to, String subject, String htmlBody) {
        MimeMessage message = emailSender.createMimeMessage();

        MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(message, true, "UTF-8");
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(htmlBody, true);
			emailSender.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
