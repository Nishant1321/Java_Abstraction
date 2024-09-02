package com.demo.candidate;
import java.util.*;
import org.hibernate.internal.build.AllowSysOut;

public class CandidateOperation {
	static int ch=1;
static	Candidate cd= new Candidate();
static MultyCandidate md=new MultyCandidate();
	static Scanner sc= new Scanner(System.in);
public static void setCandidate() {
	
	System.out.println("Enter the name");
	cd.setName(sc.next());
	System.out.println("Enter the party");
	cd.setParty(sc.next());
	System.out.println("Enter the age");
	cd.setAge(sc.nextInt());
	md.addCandidate(cd);
	
	
	
	
	
}
}