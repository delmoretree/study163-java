package tech.technote.delmore.controller;

public class Job {
    private String name;
    private int years;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
