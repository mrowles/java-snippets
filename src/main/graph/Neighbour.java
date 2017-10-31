package main.graph;

import java.util.ArrayList;
import java.util.List;

public class Neighbour {

    private Integer value;
    private List<Neighbour> neighbours;
    private static Integer total;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Neighbour(Integer value) {
        this.value = value;
        this.neighbours = new ArrayList<Neighbour>();
        total = 0;
    }

    public void addNeighbour(Neighbour neighbour) {
        neighbours.add(neighbour);
        neighbour.neighbours.add(this);

        total++;
    }

    public void setNeighbours(List<Neighbour> neighbours) {
        this.neighbours = neighbours;
    }

    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

}
