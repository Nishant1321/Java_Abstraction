//package Voting.system.voters;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import Com.votingSystem.Connect;
//
//public class ResetData {
//static	Connection co=Connect.getConnect();
//	public static void getResetCandidate() {
//
//
//try {
//	Statement st=co.createStatement();
//	st.executeUpdate("alter table candidate modify id int not null");
//	st.executeUpdate("alter table candidate drop primary key ;");
//	st.executeUpdate("truncate table candidate;");
//	st.executeUpdate("alter table candidate add primary key(id) ;");
//st.executeUpdate("alter table candidate id int auto_increment;");
//	
//	
//	
//	
//
//} catch (SQLException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//
//
//
//
//}
//	public static void getResetVoters() {
//		
//		try {
//			Statement st = co.createStatement();
//			st.executeUpdate("alter table voters modify id int not null;");
//		
//			st.executeUpdate("ALTER TABLE voters DROP primary key;");
//			
//			st.executeUpdate("truncate table voters;");
//			st.executeUpdate("ALTER TABLE voters add primary key;");
//			st.executeUpdate("alter table voters int id auto_increment;");
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	public static void getResetVoting() {
//		
//		try {
//			Statement st=co.createStatement();
//			st.executeUpdate("truncate table voting;");
//			st.executeUpdate("ALTER TABLE voting DROP CONSTRAINT voting_ibfk_1;");
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	public static void Reset() {		
//	ResetData.getResetCandidate();
////		ResetData.getResetVoters();
////		ResetData.getResetVoting();
//	}
//}