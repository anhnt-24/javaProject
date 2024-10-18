package com.ecommerce.sopi.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class CodeGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random RANDOM = new Random();

    public static String generateCode(Long id) {
        String datePart = new SimpleDateFormat("yyyyMMdd").format(new Date());
        StringBuilder randomString = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            randomString.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return datePart +  id + randomString.toString();
    }
}

