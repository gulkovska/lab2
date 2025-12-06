package ua.sasha.greenhouse.model;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class GrowingTips {

    private int Temperature;
    private boolean Lighting;
    private int Watering;

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

    public boolean isLighting() {
        return Lighting;
    }

    public void setLighting(boolean lighting) {
        Lighting = lighting;
    }

    public int getWatering() {
        return Watering;
    }

    public void setWatering(int watering) {
        Watering = watering;
    }
}
