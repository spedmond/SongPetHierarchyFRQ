import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel() {
        petList = new ArrayList<Pet>();
    }

    public void addPetToList(Pet p) {
        petList.add(p);
    }

    public void allSpeak() {
        for (Pet p : petList) {
            if (p instanceof Dog) {
                System.out.println(p.getName() + " " + ((Dog)p).speak());
            }
            else if (p instanceof Cat) {
                System.out.println(p.getName() + " " + ((Cat)p).speak());
            }
            else {
                System.out.println(p.getName() + " " + ((LoudDog)p).speak());
            }
        }
    }
}
