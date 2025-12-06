package ua.sasha.greenhouse.model;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class VisualParameters {

    private String StemColor;
    private String LeafColor;
    private int AverageSize;

    public String getStemColor() {
        return StemColor;
    }

    public void setStemColor(String stemColor) {
        StemColor = stemColor;
    }

    public String getLeafColor() {
        return LeafColor;
    }

    public void setLeafColor(String leafColor) {
        LeafColor = leafColor;
    }

    public int getAverageSize() {
        return AverageSize;
    }

    public void setAverageSize(int averageSize) {
        AverageSize = averageSize;
    }
}
