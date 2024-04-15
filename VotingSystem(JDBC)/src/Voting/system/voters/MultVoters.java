package Voting.system.voters;

import java.util.ArrayList;



public class MultVoters {
ArrayList <Voters>list;
public MultVoters() {
	this.list=new ArrayList<Voters>();
	
	
}
public void addvoters(Voters vt) {
	list.add(vt);
}
public void save() {
	DataBase.saveToDb(list);
}
}
