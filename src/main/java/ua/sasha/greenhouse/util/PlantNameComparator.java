package ua.sasha.greenhouse.util;

import ua.sasha.greenhouse.model.Plant;
import java.util.Comparator;

public class PlantNameComparator implements Comparator<Plant> {

    @Override
    public int compare(Plant a, Plant b) {
        if (a.getName() == null && b.getName() == null) return 0;
        if (a.getName() == null) return -1;
        if (b.getName() == null) return 1;
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
