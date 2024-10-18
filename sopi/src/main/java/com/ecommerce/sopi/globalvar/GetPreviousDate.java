package com.ecommerce.sopi.globalvar;

import java.util.Calendar;
import java.util.Date;

public class GetPreviousDate {
	public static Date get(Date today) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DATE, -1); 
        Date previousDate = calendar.getTime();
        return previousDate;
	}
}
