package challenges;

public class Poll {

    private int upvotes;

    private int downvotes;

    public Poll(int upvotes, int downvotes) {
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }

    public void addUpVote(){
        this.upvotes++;
    }

    public void addDownVote(){
        this.downvotes++;
    }

    public int tallyVotes(){
        return this.upvotes-this.downvotes;
    }


}
