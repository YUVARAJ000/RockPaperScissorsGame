package com.sps;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		 while(true) {
		
		String rps[]= {"r","p","s"};
		String cmove=rps[new Random().nextInt(rps.length)]; 
		
       
        String pmove;
        
        while(true) {
        System.out.println("Plese enter your move  (r, p, s)");
         pmove=sc.nextLine();
         
         if(pmove.equals("r") || pmove.equals("p") || pmove.equals("s") )
         {
        	 break;
         }
         System.out.println(pmove + "is not a valid move");
        }
        System.out.println("computer move " + cmove);
        
        if(pmove.equals(cmove))
        {
        	System.out.println("The game was tie!");
        }
        else if(pmove.equals("r")) {
        	if(cmove.equals("p")) {
        		System.out.println("you lose!");
        	}else if(cmove.equals("s")) {
        		System.out.println("you Win!");
        	}
        }
        
        else if(pmove.equals("s")) {
        	if(cmove.equals("r")) {
        		System.out.println("you lose!");
        	}else if(cmove.equals("p")) {
        		System.out.println("you Win!");
        	}
        }
        
        else if(pmove.equals("p")) {
        	if(cmove.equals("s")) {
        		System.out.println("you lose!");
        	}else if(cmove.equals("r")) {
        		System.out.println("you Win!");
        	}
        }
        System.out.println("play again (y/n)");
        String playAgain=sc.nextLine();
        if(!playAgain.equals("y")) {
        	break;
        }
       }
		 sc.close();
	}

}
