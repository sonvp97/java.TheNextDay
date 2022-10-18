package com.codegym;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TheNextDayTest {

    @Test
    public void testNextDay() {

        Date excuted = new Date(2018,1,2);
        TheNextDay date1 = new TheNextDay();
        Date resuilt = date1.getNextDay(1,1,2018);
        assertEquals(resuilt,excuted);
    }
    @Test
    public void testNextDay1() {

        Date excuted = new Date(2018,2,1);
        TheNextDay date1 = new TheNextDay();
        Date resuilt = date1.getNextDay(31,1,2018);
        assertEquals(excuted,resuilt);
    }
    @Test
    public void testNextDay2() {

        Date excuted = new Date(2018,5,1);
        TheNextDay date1 = new TheNextDay();
        Date resuilt = date1.getNextDay(30,4,2018);
        assertEquals(excuted,resuilt);
    }
    @Test
    public void testNextDay3() {

        Date excuted = new Date(2018,3,1);
        TheNextDay date1 = new TheNextDay();
        Date resuilt = date1.getNextDay(28,2,2018);
        assertEquals(excuted,resuilt);
    }
    @Test
    public void testNextDay4() {

        Date excuted = new Date(2020,3,1);
        TheNextDay date1 = new TheNextDay();
        Date resuilt = date1.getNextDay(29,2,2020);
        assertEquals(excuted,resuilt);
    }
    @Test
    public void testNextDay5() {

        Date excuted = new Date(2019,1,1);
        TheNextDay date1 = new TheNextDay();
        Date resuilt = date1.getNextDay(31,12,2018);
        assertEquals(excuted,resuilt);
    }

}