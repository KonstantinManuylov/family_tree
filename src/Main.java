import ru.gb.family_tree.FamilyTree;
import ru.gb.human.Human;
import ru.gb.human.Kid;

public class Main {
    public static void main(String[] args) {

        FamilyTree familyTree = new FamilyTree();

        Human human9 = new Human("Паша");
        Human human7 = new Human("Валя");
        Human human8 = new Human("Коля");
        Human human6 = new Human("Галя");
        Human human5 = new Kid("Саша", human6, human8);
        Human human4 = new Kid("Аня", human7, human9);
        Human human3 = new Kid("Света", human4, human5);
        Human human2 = new Kid("Костя", human4, human5);
        Human human1 = new Kid("Алиса", human2, human3);

        familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        familyTree.addHuman(human3);
        familyTree.addHuman(human4);
        familyTree.addHuman(human5);
        familyTree.addHuman(human6);
        familyTree.addHuman(human7);
        familyTree.addHuman(human8);
        familyTree.addHuman(human9);

        familyTree.getFamilyInfo();

    }
}