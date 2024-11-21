package Exercise_2;

public class Forward extends Player {
    public Forward(String name,  int skillLevel) {
        super(name,"Forward", skillLevel);
    }

    @Override
    public void play() {
        System.out.println(getName()+ "is playing forward. ");
    }
}
