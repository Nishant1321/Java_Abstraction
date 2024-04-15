package Voting.start;

public class Voting {
private int id;
private int votes;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getVotes() {
	return votes;
}
public void setVotes(int votes) {
	this.votes = votes;
}
@Override
public String toString() {
	return "Voting [id=" + id + ", votes=" + votes + "]";
}
public Voting(int id, int votes) {
	super();
	this.id = id;
	this.votes = votes;
}
public Voting() {
	
}
}
