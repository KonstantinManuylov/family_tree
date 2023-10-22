package ru.gb.family_tree;

import ru.gb.human.Human;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humans;
    private Human name;

    public void addHuman(Human name) {
        humans = new ArrayList<>();
        humans.add(name);
    }

    public String getFamilyInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Семья:\n");
        for (Human human : humans) {
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }
}
