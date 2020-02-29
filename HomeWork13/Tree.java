package HomeWork13;

import java.util.*;

public class Tree extends Plants {
    private ArrayList<String> area;
    private HashSet<String> names;
    private HashMap<String, Integer> treesCount;

    public Tree() {
    }

    public Tree(ArrayList<String> territory, HashSet<String> types, HashMap<String, Integer> density,
                ArrayList<String> area, HashSet<String> names, HashMap<String, Integer> treesCount) {
        super(territory, types, density);
        this.area = area;
        this.names = names;
        this.treesCount = treesCount;
    }

    public ArrayList<String> getArea() {
        return area;
    }

    public void setArea(ArrayList<String> area) {
        this.area = area;
    }

    public HashSet<String> getNames() {
        return names;
    }

    public void setNames(HashSet<String> names) {
        this.names = names;
    }

    public HashMap<String, Integer> getTreesCount() {
        return treesCount;
    }

    public void setTreesCount(HashMap<String, Integer> treesCount) {
        this.treesCount = treesCount;
    }
}
