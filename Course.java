public class Course {

    private final Cross[] arrayCross;

    public Course(Cross[] arrayCross) {
        this.arrayCross = arrayCross;
    }

    public void doIt(Team team) {
        Member[] members = team.getMembers();
        for (Member m : members) {
            for (Cross cross : arrayCross) {
                m.crossrun(cross);
            }
        }
    }
 }
