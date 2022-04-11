package com.hemisferiod.apirest.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Time {

    public static Timestamp getTime(){
        return new Timestamp(System.currentTimeMillis());
    }
    public static String getTimeFormat(String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String strDate= simpleDateFormat.format(System.currentTimeMillis());
        return strDate;
    }
}
