package com.ecommerce.sopi.globalvar;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import org.springframework.stereotype.Component;

import com.ecommerce.sopi.entity.StatusDelivery;

@Component
public class TextUtils {
	 public static String toUpperCase() {
	        return "concac";
	 
	 }
	 public static String formatCurrency(long amount) {
	        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("vi", "VN"));
	        numberFormat.setMinimumFractionDigits(0); 
	        numberFormat.setMaximumFractionDigits(0); 
	        return numberFormat.format(amount) + "đ"; 
	 }
	 public static String formatCurrency2(long amount) {
	        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("vi", "VN"));
	        numberFormat.setMinimumFractionDigits(0); 
	        numberFormat.setMaximumFractionDigits(0); 
	        return numberFormat.format(amount); 
	 }
	 public static String getDeliveryStatus(String status) {
		 return StatusDelivery.valueOf(status).getMessage();
	 }
	 public static String formatNumber(int n) {
	        if (n >= 1000) {
	            float result = (float) n / 1000;
	            DecimalFormat df = new DecimalFormat("#.#");
	            return df.format(Math.floor(result * 10) / 10) + "k";
	        } else {
	            return String.valueOf(n);
	        }
	    }
}
