package tech.technote.delmore.controller;

public class Car {
    private String no;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Car{" +
                "no='" + no + '\'' +
                '}';
    }
}
