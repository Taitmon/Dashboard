package com.company;

public class Dashboard
{
    int speed, rpm;

    public String getDisplay()
    {
        String display = "Speed: " + this.speed + "   RPM: " + this.rpm;

        return display;
    }
}

