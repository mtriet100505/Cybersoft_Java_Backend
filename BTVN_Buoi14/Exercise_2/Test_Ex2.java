package Exercise_2;

public class Test_Ex2 {
    public static void main(String[] args) {
        Team team=new Team();
        // Add players to the team
        team.addPlayers(new Forward("John", 85));
        team.addPlayers(new Midfielder("Mike", 80));
        team.addPlayers(new Defender("Steve", 78));
        team.addPlayers(new Forward("Chris", 88));
        team.addPlayers(new Midfielder("David", 82));
        team.addPlayers(new Defender("Robert", 75));

        // Display team and total skill level
        team.displayTeam();
        System.out.println("Total Skill Level of the Team: " + team.totalSkillLevel());
    }
}
