package Exercise_2;

public class Midfielder extends Player {

    public Midfielder(String name, int skillLevel) {
        super(name, "Midfielder", skillLevel);
    }

    @Override
    public void play() {
        System.out.println(getName()+"is playing as a Midfielder. ");
    }
}
