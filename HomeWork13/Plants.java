package HomeWork13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Plants {
    private ArrayList<String> territory;
    private HashSet<String> types;
    private HashMap<String, Integer> density;

    public Plants() {
    }

    public Plants(ArrayList<String> territory, HashSet<String> types, HashMap<String, Integer> density) {
        this.territory = territory;
        this.types = types;
        this.density = density;
    }

    public ArrayList<String> getTerritory() {
        return territory;
    }

    public void setTerritory(ArrayList<String> territory) {
        this.territory = territory;
    }

    public HashSet<String> getTypes() {
        return types;
    }

    public void setTypes(HashSet<String> types) {
        this.types = types;
    }

    public HashMap<String, Integer> getDensity() {
        return density;
    }

    public void setDensity(HashMap<String, Integer> density) {
        this.density = density;
    }
}
