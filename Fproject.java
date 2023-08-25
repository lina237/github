import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class Fproject{
	
	public static void main(String[] args){
		System.out.println("Please are you a student or a staff");
		Scanner proj = new Scanner(System.in);
		String info = proj.nextLine();
		 FileWriter console = null; 
		BufferedWriter fconsole = null;
		
		switch(info){
		case "student":
			System.out.println("please enter your first name");
		String first = proj.nextLine();
		System.out.println("please enter you last name");
		String last = proj.nextLine();
		System.out.println("please enter you date of birth");
		String dofb = proj.nextLine();
		System.out.println("please enter your gender");
		String gend = proj.nextLine();
		System.out.println("please enter your phone number");
		String tele = proj.nextLine();
		System.out.println("please enter your address");
		String adrs =  proj.nextLine();
		System.out.println("Please your level");
		String level = proj.nextLine();
		

		try {
		
		 console = new FileWriter("first + " " +last.txt");
		  fconsole= new BufferedWriter(console);
			
		fconsole.write("your first name is: " + first + "\n");
		fconsole.write("your last name is: " + last);
		fconsole.write("\n");
		fconsole.write("your date of birth is: " + dofb  + "\n");
	    fconsole.write("Your gender is: " + gend  + "\n");
		fconsole.write("Your telephone number is: " + tele  + "\n");
		fconsole.write("Your Address  is: " + adrs  + "\n");
		fconsole.write("Your level is: " + level  + "\n");
		fconsole.newLine();
		fconsole.close();
		System.out.println("Your information has been successfully saved");
		}
		 catch (IOException e){
			System.out.println("An Error occured !!!, press any key to continue.");
			e.printStackTrace();
		   }
         break;
		
		case "staff":
			System.out.println("please enter your first name");
		String fname = proj.nextLine();
		System.out.println("please enter you last name: ");
		String lname = proj.nextLine();
		System.out.println("please enter you date of birth: ");
		String dob = proj.nextLine();
		System.out.println("please enter your gender: ");
		String Gender = proj.nextLine();
		System.out.println("please enter your phone number: ");
		String tel = proj.nextLine();
		System.out.println("please enter your address: ");
		String adress =  proj.nextLine();
		System.out.println("Please enter the subject you teach: ");
		String Subject = proj.nextLine();
		System.out.println("Please enter your salary: ");
		double Sal = proj.nextDouble();
		
		
		try{
		 console = new FileWriter("console.txt");
	     fconsole = new BufferedWriter(console);	
		fconsole.write("your first name is: " + fname  + "\n");
        fconsole.write("your last name is: " + lname  + "\n");
		fconsole.write("your date of birth is: " + dob  + "\n");
		fconsole.write("Your gender is: " + Gender  + "\n");
		fconsole.write("Your Telephone number is: " + tel  + "\n");
		fconsole.write("Your address is: " + adress  + "\n");
		fconsole.write("the subject you teach is: " + Subject  + "\n");
        fconsole.write("You have a salary of : " + Sal  + "\n");
		fconsole.newLine();
		fconsole.close();
		System.out.println("Your information has been successfully saved");
		}
	   catch (IOException e){
			System.out.println("An Error occured !!!, press any key to continue.");
			e.printStackTrace();
		   }
		   break;
		   default:
    System.out.println("invalid input!!!!!!");
		}
	
    }
		
		
}		