package Exercise_2;
import java.util.ArrayList;
import java.util.List;
public class Team {
    private List<Player>players;
    public Team(){
        players=new ArrayList<>();
    }
    // Method to add player
    public void addPlayers(Player player){
        players.add(player);
    }
    // Method to display team
    public void displayTeam(){
        System.out.println("Team composition: ");
        for(Player player :players){
            System.out.println(player.getPosition()+": "+player.getName()+"(Skill level: "+player.getSkillLevel()+")");
            player.play();
        }
    }
    // Method to calculate total skill level
    public int totalSkillLevel(){
        int totalSkill=0;
        for(Player player:players){
            totalSkill+=player.getSkillLevel();
        }
        return totalSkill;
    }
}
