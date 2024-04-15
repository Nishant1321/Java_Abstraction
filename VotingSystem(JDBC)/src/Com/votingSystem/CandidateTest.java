package Com.votingSystem;
import java.util.*;

import Com.voting.candidate.Operation;
import Voting.start.VotingOperation;
import Voting.system.voters.OperationVT;
import Voting.system.voters.ResetData;
public class CandidateTest {
	
	static {
		System.out.println("Welcome to voting");
	}
static	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ResetData rd=new ResetData();
		VotingOperation vo=new VotingOperation();
		Operation op= new Operation();
		OperationVT ot= new OperationVT();
		System.out.println("Enter the choice : \npress 1 for the candidate\n press 2 for the voters\n press 3 for the start voting\n press 4 for the reset the data ");
switch(sc.nextInt()) {
case 1:
	op.CandidateOperation();
	break;
case 2 :
	ot.VotersOperation();
	break;
case 3 :
//	vo.setId();
	vo.StartVoting();
	break;
case 4:
	rd.Reset();
	break;
}
	}

}

