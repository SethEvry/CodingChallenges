import challenges.Poll;

public class Main {
    public static void main(String[] args) {

        Poll poll = new Poll(32, 10);

        System.out.println(poll.tallyVotes());

    }
}