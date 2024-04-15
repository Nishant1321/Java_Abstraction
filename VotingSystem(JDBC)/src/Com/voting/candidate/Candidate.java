package Com.voting.candidate;

public class Candidate {
private int id;
private String name;
private int votes;
private String party;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getVotes() {
	return votes;
}
public void setVotes(int votes) {
	this.votes = votes;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Candidate [id=" + id + ", name=" + name + ", votes=" + votes + ", party=" + party + ", age=" + age
			+ ", getId()=" + getId() + ", getName()=" + getName() + ", getVotes()=" + getVotes() + ", getParty()="
			+ getParty() + ", getAge()=" + getAge() + "]";
}
public Candidate(int id, String name, int votes, String party, int age) {
	super();
	this.id = id;
	this.name = name;
	this.votes = votes;
	this.party = party;
	this.age = age;
}
public Candidate() {
	
}
}
