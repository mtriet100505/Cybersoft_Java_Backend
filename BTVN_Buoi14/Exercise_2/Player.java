package Exercise_2;

abstract class Player {
    private String name;
    private String position;
    private int skillLevel;

    public Player(String name, String position, int skillLevel) {
        this.name = name;
        this.position = position;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
    public abstract  void play();
}
