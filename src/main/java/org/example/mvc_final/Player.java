package org.example.mvc_final;


import org.example.mvc_final.validation.CheckPosition;

import javax.validation.constraints.*;

public class Player {
    @NotBlank(message = "name can`t be empty!")
    private String name;
    @NotBlank(message = "surname can`t be empty!")
    private String surname;
    @NotEmpty(message = "nationality can`t be empty!")
    private String nationality;
    @NotBlank(message = "club can`t be empty!")
    private String club;
    @CheckPosition()
    private String position;
    @Min(value = 18, message = "player can`t be younger than 18 years!")
    @Max(value = 45, message = "player can`t be older than 45 years!")
    private int age;

    @Min(value = 4000, message = "Player can`t earn less than 4000, because it`s minimal salary in Ukraine!")
    private int salary;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
