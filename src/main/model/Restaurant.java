package model;

import java.util.ArrayList;
import java.util.List;

// Represents a restaurant with tables
public class Restaurant {

    private List<Table> restaurantTables;

    public Restaurant(int x) {
        restaurantTables = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            restaurantTables.add(new Table());
        }
    }

    public int getNumberOfTables() {
        return restaurantTables.size();
    }

    // REQUIRES: i > 0
    // EFFECTS: returns the ith table in the restaurant
    public Table getSpecificTable(int i) {
        return restaurantTables.get(i - 1);
    }

    // MODIFIES: this
    // EFFECTS: adds another table to the restaurant
    public void addTable() {
        restaurantTables.add(new Table());
    }

    public void removeTable() {
        restaurantTables.remove(this.getNumberOfTables() - 1);
    }
}