package ua.sasha.greenhouse.model;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Plant {

    @XmlAttribute
    private String id;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Soil")
    private Soil soil;

    @XmlElement(name = "Origin")
    private String origin;

    @XmlElement(name = "VisualParameters")
    private VisualParameters visualParameters;

    @XmlElement(name = "GrowingTips")
    private GrowingTips growingTips;

    @XmlElement(name = "Multiplying")
    private Multiplying multiplying;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Soil getSoil() {
        return soil;
    }

    public void setSoil(Soil soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VisualParameters getVisualParameters() {
        return visualParameters;
    }

    public void setVisualParameters(VisualParameters visualParameters) {
        this.visualParameters = visualParameters;
    }

    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    public void setGrowingTips(GrowingTips growingTips) {
        this.growingTips = growingTips;
    }

    public Multiplying getMultiplying() {
        return multiplying;
    }

    public void setMultiplying(Multiplying multiplying) {
        this.multiplying = multiplying;
    }
}
