package Com.voting.candidate;

	import java.util.ArrayList;

import Com.votingSystem.Database;

	public class MultCandidate {
		ArrayList <Candidate>list;
		public MultCandidate () {
			this.list=new ArrayList<Candidate>();
			
		}
		public void addCandidate(Candidate cd) {
			list.add(cd);
		}
		public void save() {
			Database.saveToDb(list);
		}

	}

	
	
	

