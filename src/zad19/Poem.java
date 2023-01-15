package zad19;

public class Poem {

    private Author creator;
    private int stropheNumber;

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    public void setStropheNumber(int stropheNumber) {
        this.stropheNumber = stropheNumber;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumber=" + stropheNumber +
                '}';
    }
}
