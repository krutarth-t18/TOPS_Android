package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Fundamentals_basic_B29 {
    public static void main(String[] args){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now)) ;

    }
}