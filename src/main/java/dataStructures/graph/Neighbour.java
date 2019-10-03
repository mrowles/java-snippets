package dataStructures.graph;

import java.util.ArrayList;
import java.util.List;

public class Neighbour {

    private static Integer total;
    private Integer value;
    private List<Neighbour> neighbours;

    public Neighbour(Integer value) {
        this.value = value;
        this.neighbours = new ArrayList<Neighbour>();
        total = 0;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void addNeighbour(Neighbour neighbour) {
        neighbours.add(neighbour);
        neighbour.neighbours.add(this);

        total++;
    }

    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Neighbour> neighbours) {
        this.neighbours = neighbours;
    }

}
