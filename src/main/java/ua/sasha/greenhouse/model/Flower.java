package ua.sasha.greenhouse.model;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Flower")
@XmlAccessorType(XmlAccessType.FIELD)
public class Flower {

    @XmlAttribute
    private String id;

    @XmlElement(name = "Plant")
    private List<Plant> plants = new ArrayList<>();

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
