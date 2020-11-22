package tech.technote.delmore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationProperties("person")
@PropertySource("classpath:habits.properties")
public class Person {
    private String name;
    private String sex;
    private int age;
    private boolean isMarried;
    private Friend friend;
    private Job job;
    private String[] pets;
    private List<House> houses;
    private List<Car> cars;

    @Value("${habits[0]}")
    private String habit;

    @Value("${nation.name}")
    private String nation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String[] getPets() {
        return pets;
    }

    public void setPets(String[] pets) {
        this.pets = pets;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                ", friend=" + friend +
                ", job=" + job +
                ", pets=" + Arrays.toString(pets) +
                ", houses=" + houses +
                ", cars=" + cars +
                ", habit='" + habit + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
