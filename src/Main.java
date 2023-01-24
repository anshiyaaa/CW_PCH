import modal.Child;
import modal.Hobbies;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hobbies> c = new ArrayList<>();
        Hobbies h1 = new Hobbies("Singing");
        Hobbies h2 = new Hobbies("Reading");

        c.add(h1);
        c.add(h2);

        Child c1 = new Child("Anshu",c,17);

        c1.display();

        for(int i = 0 ; i< c.size(); i++) {
            Hobbies cc = c.get(i);
            System.out.println(cc.getHobbies());
        }
    }
}
