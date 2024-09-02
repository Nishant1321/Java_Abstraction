package Atm;
	import java.util.Random;
	import java.util.Scanner;

	public class AtmDemo {
	  public static void main(String[] args) {
	    int withdraw, deposite;
	    long atmCapacity = 1000000;

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter atmCapacity :");
	    atmCapacity = sc.nextInt();

	    if (atmCapacity == 0) {
	      System.out.println("Insufficient balance ");
	    } else {

	      System.out.println("Enter your balance :");
	      int balance = sc.nextInt();
	      System.out.println("welcome to 150 rupeya dega bank!!!!");
	      System.out.println("Please do not remove your card ");
	      System.out.println("Enter your pin :");
	      int pin = sc.nextInt();
	     
	      Random rm = new Random();
	      int pass = rm.nextInt(100,999);
	      System.out.println(pass);
	      boolean b=true;
	      while(b) {
	      System.out.println("Plese enter the security Password :");
	      int pas=sc.nextInt();
      if ( pass== pas) {

	        while (true) {
	          System.out.println("Atometed Teller Machine");
	          System.out.println("choose 1 for withdraw");
	          System.out.println("choose 2 for deposite");
	          System.out.println("choose 3 for check balance");
	          System.out.println("choose 4 for exist");
	          System.out.println("choose the operation you want to perform");
	          int choice = sc.nextInt();
	          switch (choice) {
	            case 1:
	              System.out.println("Enter money to withdraw");
	              withdraw = sc.nextInt();

	              if (balance >= withdraw && atmCapacity >= withdraw && withdraw <= 20000) {
	                balance = balance - withdraw;
	                System.out.println("Plese collect your money ");
	              } else {
	                System.out.println("Insufficient Balance");

	              }
	              System.out.println("");
	              break;
	            case 2:
	              System.out.println("Enter moneyto be deposite");
	              deposite = sc.nextInt();
	              balance = balance + deposite;
	              System.out.println("your money has been successfully deposite your balance is : " + balance);
	              System.out.println("");
	              break; 
	            case 3:
	              System.out.println("Balance " + balance);
	              System.out.println("");
	              break;
	            case 4:
	              // System.exit(0);
	            	b=false;
	            	
	              System.out.println("Thanku...");
	              break;

	          }

	        }
      }else {
	        System.out.println("Enter the valid pass");
	      } 
	        
	      }

	    }

	  }
	}
