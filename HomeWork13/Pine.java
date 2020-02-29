package HomeWork13;

import java.util.*;

public class Pine extends Tree{
    private ArrayList<String> alternativeNames;
    private HashSet<String> subType;
    private Map<String, Integer> quantityByRegion;

    public Pine() {
    }

    public Pine(ArrayList<String> territory, HashSet<String> types, HashMap<String, Integer> density,
                ArrayList<String> area, HashSet<String> names, HashMap<String, Integer> treesCount,
                ArrayList<String> alternativeNames, HashSet<String> subType, Map<String, Integer> quantityByRegion) {
        super(territory, types, density, area, names, treesCount);
        this.alternativeNames = alternativeNames;
        this.subType = subType;
        this.quantityByRegion = quantityByRegion;
    }

    public ArrayList<String> getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(ArrayList<String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public HashSet<String> getSubType() {
        return subType;
    }

    public void setSubType(HashSet<String> subType) {
        this.subType = subType;
    }

    public Map<String, Integer> getQuantityByRegion() {
        return quantityByRegion;
    }

    public void setQuantityByRegion(Map<String, Integer> quantityByRegion) {
        this.quantityByRegion = quantityByRegion;
    }
}
