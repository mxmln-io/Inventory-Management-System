package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Product class
 *
 * @author Maximillian
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;
    private List<Part> associatedParts = new ArrayList<>();

    public Product(int id, String name, double price, int stock, int min, int max) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    // Associated Parts methods
    public List<Part> getAssociatedParts() {
        return new ArrayList<>(associatedParts);
    }

    public void addAssociatedPart(Part part) {
        if (part != null && !associatedParts.contains(part)) {
            associatedParts.add(part);
        }
    }

    public boolean removeAssociatedPart(Part part) {
        if (part != null) {
            return associatedParts.remove(part);
        }
        return false;
    }
}