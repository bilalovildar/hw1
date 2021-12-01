import org.jetbrains.annotations.NotNull;

public class Member {
    private String name;
    private int maxrun;
    private boolean winner;

    public Member(String name, int maxrun) {
        this.name = name;
        this.maxrun = maxrun;
    }

    public String getName() {
        return name;
    }

    public void crossrun(Cross c) {
        winner = maxrun > c.getCrosslength();
    }

    public void showResults() {
        System.out.println("участник " + getName() + " "+ winner);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxrun() {
        return maxrun;
    }

    public void setMaxrun(int maxrun) {
        this.maxrun = maxrun;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
 }

