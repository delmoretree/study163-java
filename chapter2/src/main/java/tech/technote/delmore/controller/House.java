package tech.technote.delmore.controller;

public class House {
    private double area;
    private String position;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", position='" + position + '\'' +
                '}';
    }
}
