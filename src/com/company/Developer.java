package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Developer {
    public static void main(String[] args) throws ParseException {
        System.out.println("Samedov");
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startDate = ft.parse("2021-02-03 10:56:00");
        System.out.println("Начало: "  + startDate);
        System.out.println("Конец: " + date.toString());
    }
}
