public class Team {
    private String teamName;
    private Member[] members;

    public Team(String teamname, Member[] members) {
        this.teamName = teamname;
        this.members = members;
    }

    public Member[] getMembers() {
        return members;
    }

    public void teamInfo() {
        for (Member m : members) {
            m.showResults();
        }
    }

    public void showResults() {
        for (Member m : members) {
            if (m.isWinner()) {
                m.showResults();
            }
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }
 }
