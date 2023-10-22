package ru.gb.human;

public class Kid extends Human {
    private Human father;
    private Human mother;

    public Kid(String name, Human father, Human mother){
        super(name);
        this.father = father;
        this.mother = mother;
    }

    @Override
    public String toString() {
        return super.toString() + "Папа: " + father + ", Мама: " + mother;
    }
}
