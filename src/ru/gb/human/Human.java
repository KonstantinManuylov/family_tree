package ru.gb.human;

import java.time.LocalDate;
import java.util.List;

public class Human {
    private String name;
    private LocalDate bornDate;

    private LocalDate deathDate;

    private Human father, mother;
    private List<Human> kids;

    public Human(String name) {
        this.name = name;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", Дата рождения: " + bornDate +
                ", Дата смерти: " + deathDate +
                ", Папа: " + father +
                ", Мама: " + mother;
    }
}
