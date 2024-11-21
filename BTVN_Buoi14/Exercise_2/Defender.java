package Exercise_2;

public class Defender extends Player{

    public Defender(String name, int skillLevel) {
        super(name, "Defender", skillLevel);
    }

    @Override
    public void play() {
        System.out.println(getName()+"is playing as a Defender. ");
    }
}
