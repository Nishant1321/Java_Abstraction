package com.demo.candidate;

import java.util.ArrayList;

public class MultyCandidate {

	ArrayList<Candidate>list;
	public MultyCandidate() {
		this.list=new ArrayList<Candidate>();
		
	}
	public void addCandidate(Candidate cd) {
		list.add(cd);
		
	}
}
