
import java.util.*;

                                                  

 public class Ttg{
	 
	     //This method displays the game board
	 static void prboard( String[][] board){ 
		        
         
		System.out.println(" "+ board[0][0] + " " + board[0][1] + " " + board[0][2] + " " + board[0][3] + " " + board[0][4]+ " " +"*"+ " " +"*" +" ");
		System.out.println(" "+ board[1][0] + " |" + board[1][1] + " |" + board[1][2] + " |" + board[1][3] + " |" + board[1][4] +" ");
		System.out.println(" " + " " + "-----------");
		System.out.println(" "+ board[2][0] + " |" + board[2][1] + " |" + board[2][2] + " |" + board[2][3] + " |" + board[2][4] + " ");
		System.out.println(" "+" "+ "-----------");
		System.out.println(" "+ board[3][0] + " |" + board[3][1] + " |" + board[3][2] + " |" + board[3][3] + " |" + board[3][4]+" ");
		System.out.println(" "+ board[4][0] + " " + board[4][1] + " " + board[4][2] + " " + board[4][3] + " " + board[4][4]+ " " +"*" + " "+ "*" +" ");
		 
		   }
	 
	

	
		
	public static void main (String[] args){
				String[][] board = {{"*","*","*","*","*"},
	                                {"*","0","1","2","*"},
					                {"*","3","4","5","*"},
					                {"*","6","7","8","*"},
					                {"*","*","*","*","*"}};
		
		
		Scanner sobj = new Scanner(System.in);
				Ttg obj = new Ttg();
		
		//section were players enter their names
		System.out.println("================================================================================================================================================================================================================ ");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tWelcome to Lina's TicTacToe Game\t\t\t\t\t\t\t\t\t\t  ");
		System.out.println("================================================================================================================================================================================================================");
		System.out.println(" Player1 please enter your name");
		 String p1 = sobj.nextLine();
		System.out.println("Player2 please enter your name");
		 String p2= sobj.nextLine();
		
		prboard(board);//calls the game board method

		System.out.println( p1 + " " + "you are the first to start,your player code is 001," + " " + p2 + " " +"your player code is 002");
		  
		  System.out.println("*******************************LET THE GAMES BEGIN!!!!!!!!****************************");
		  
		   
		   
		   //Start of the game
		   for (int i=0; i<9; i++ ){
		   System.out.println("Please enter your player code");
		   int playercode = sobj.nextInt();
		   
		if (playercode == 001){
		System.out.println(p1 + " " + " what slot number do you want to play in? ");
		int slotn = sobj.nextInt();
		switch(slotn){
			
			case 0:
			board[1][1] = "x";
			prboard(board);
			break;
			
			case 1:
			board[1][2] = "x";
			prboard(board);
			break;
			
			case 2:
			board[1][3] = "x";
			prboard(board);
			break;
			
			case 3:
			board[2][1] = "x";
			prboard(board);
			break;
			
			case 4:
			board[2][2] = "x";
			prboard(board);
			break;
			
			case 5:
			board[2][3] = "x";
			prboard(board);
			break;
			
			case 6:
			board[3][1] = "x";
			prboard(board);
			break;
			
			case 7:
			board[3][2] = "x";
			prboard(board);
			break;
			
			case 8:
			board[3][3] = "x";
			prboard(board);
			break;
			
			
			default:
			System.out.println("invalid input, please enter the slot number as indicated on the game board");
			break;
			
		    }
		}
			
		   else if(playercode == 002){
			   System.out.println(p2 + " " + " what slot number do you want to play in?:  ");
		       int slotn = sobj.nextInt();
		switch(slotn){
			
			case 0:
			board[1][1] = "O";
			prboard(board);
			break;
			
			case 1:
			board[1][2] = "O";
			prboard(board);
			break;
			
			case 2:
			board[1][3] = "O";
			prboard(board);
			break;
			
			case 03:
			board[2][1] = "O";
			prboard(board);
			break;
			
			case 4:
			board[2][2] = "O";
			prboard(board);
			break;
			
			case 5:
			board[2][3] = "O";
			prboard(board);
			break;
			
			case 6:
			board[3][1] = "O";
			prboard(board);
			break;
			
			case 7:
			board[3][2] = "O";
			prboard(board);
			break;
			
			case 8:
			board[3][2] = "0";
			prboard(board);
			break;
			
			default:
			System.out.println("invalid input, please enter the slot number as indicated on the game board");
			break;
			
		    }
		   }
		
		   else{
			   System.out.println("please enter the correct playercode as given");
		   }
		   
		}   
	    
		  
	}
}
 