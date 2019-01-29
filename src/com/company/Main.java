package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Dashboard dashRead = new Dashboard();
        dashRead.speed = 65;
        dashRead.rpm = 1500;
        System.out.println(dashRead.getDisplay());

        dashRead.speed = 75;
        dashRead.rpm = 2000;
        System.out.println(dashRead.getDisplay());

    }

}
