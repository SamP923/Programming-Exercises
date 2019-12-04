using System;
class MainClass 
{
  
    
    public static void Main (string[] args) {
        string introduction = 
    			"--------------------------\n"+
    			"WELCOME TO POCKET POKEMON\n"+
    			"--------------------------\n"+"\n\n" +
    			"Hello, young adventurer. What is your name?";
    
    		Console.WriteLine( introduction );
    		
            string name = Console.ReadLine();
            string welcome = ( name.ToUpper() == "YOUNG ADVENTURER" || name.ToUpper() == "ADVENTURER" ) ? "haha, very funny." : "Hello, " + name + "!";
            
            welcome += "\n\nChoose your pokemon!\n1: Charmander\n2: Squirtle\n3: Bulbasaur\n4: Quit Story";

            Console.WriteLine( welcome );

            //handle errors
    	    string response = Console.ReadLine();
    	    int choice = 0;
    	    
    		if(int.TryParse(response, out choice))
    		  choice = Convert.ToInt32( response );
    		else
          Console.WriteLine( introduction );
    	
    		if(choice == 1)
    		  Charmander();
    		else if(choice == 2)
    		  Squirtle();
    		else if(choice == 3)
              Bulbasaur();
            else if (choice == 4)
              QuitStory();
            else if ( choice == 5)
    		  Pikachu();
    		else
            { Console.WriteLine( introduction );}
    		
     
    }//end main method
    
  	static int menu( int choiceRecord )
    {
        string askText = "\n\nWhat do you want to do?";
        
        string introText = "Generic Teacher wants to fight!\n" + "Generic Teacher sent out Gradebook!\n\n";
        
        string menuText = "\n1: FIGHT \t\t3: PKMN \n2: ITEM \t\t4: FLEE";

        string itemText = "\n1: POKEBALL\n2: BACK";

        string spacers = "\n========================================";
        int playerInput = 0;

        while ( playerInput > 4 || playerInput < 1)
        {
            switch( choiceRecord ){
                case 0:
                    Console.WriteLine( introText + spacers + menuText + askText + spacers );
                    break;
                case 1:
                    Console.WriteLine( spacers + menuText + askText + spacers );
                    break;
                case 2:
                    Console.WriteLine( spacers + itemText + askText + spacers);
                    break;
                default:
                    Console.WriteLine("Something went wrong!");
                    break;
            }//end switch
        
            string response = Console.ReadLine();
            if (int.TryParse(response, out playerInput) ){
                playerInput = Convert.ToInt32( response );
            }//end if
            
        }//end while
        
        return playerInput;
    }

  	//process all responses that have to do with Squirtle
  	static void Squirtle()
  	{
    	string squirtleMessage = "You have chosen Squirtle as your pokemon!\n\n";
    	
        string spacers = "\n========================================";
    	Console.WriteLine( squirtleMessage );
    		
        int choice = 0;
        int badChoices = 0;
        int iterationChoice = 0;
        int iterationNum = 0;
        bool endGame = false;
        bool goodChoices = true;

        while (endGame == false )
        {
            choice = menu( iterationChoice );
            string response;
    	    if (choice == 1) 
    		{
      			squirtleMessage = spacers + "\n1: TACKLE\n2: TAILWHIP"+ "\n\nWhat do you want to do?" + spacers;
          			
          		Console.WriteLine( squirtleMessage );
          			
                //handle errors
                response = Console.ReadLine();
        	    choice = 0;
            	  
            	if(int.TryParse(response, out choice))
            		choice = Convert.ToInt32( response );
            	else
                    Console.WriteLine( squirtleMessage );
                
      		    if (choice == 1) {
                    iterationNum += 1;
                    if ( iterationNum == 1 ){
                        squirtleMessage = "SQUIRTLE used Tackle! It wasn't very effective.";
                        goodChoices = false;
                    }
                    else if ( goodChoices == true )
                    {
                        squirtleMessage = "SQUIRTLE used Tackle! It was super effective!\n";
                        endGame = true;
                    }
                    else{
                        squirtleMessage = "SQUIRTLE used Tackle! It wasn't very effective." + "\n\nCCA doesn't even have a football team! Gradebook doesn't like being tackled...\nGradebook used Fail Student! It's super effective!\n\nSQUIRTLE fainted!";
                        endGame = true;
                    }//decider iteration 
                }//end TACKLE choice
                else if (choice == 2){
                    iterationNum += 1;
                    if ( iterationNum == 1 ){
                        squirtleMessage = "SQUIRTLE used Tail Whip! It was super effective!";
                    } else {
                        squirtleMessage = "SQURIRTLE used Tail Whip! It wasn't very effective." + "\n\nUnfortunately, SQUIRTLE's tail isn't Indiana Jones. Gradebook is an avid fan of the franchise and sometimes writes Romance/Adventure fanfiction. He doesn't like your weak imitation...\nGradebook used Fail Student! It's super effective!\n\nSQUIRTLE fainted!";
                        goodChoices = false;
                        endGame = true;
                    }
                }//end TAILWHIP choice
                Console.WriteLine( squirtleMessage );

                iterationChoice = 1;

    		}//end FIGHT choice
         	else if (choice == 2) 
    	    {
                choice = menu( 2 );
        	    if (choice == 1) 
      	        {
                    badChoices += 1;
                    if ( badChoices > 1 ){
                        squirtleMessage = "\nGradebook was angered! He doesn't enjoy getting hit in the head with a pokeball. You got K.O'd.";
                        goodChoices = false;
                        endGame = true;
                    }
                    else{
                        squirtleMessage = "\nYou used one Poke Ball! " + "Unfortunately, Gradebook is too strong! You cannot capture him. \n\n\"You could try again\", Generic Teacher taunts.";
                    }
                }//end CAPTURE choice
                else
                {
                    squirtleMessage = "";
                }
          	    Console.WriteLine( squirtleMessage );
                iterationChoice = 1;

    	    }//end ITEM choice
    	    else if (choice == 3){
                Console.WriteLine( "\nYou have no other pokemon!" );
                iterationChoice = 1;

    		}//end PKMN choice
            else if (choice == 4){
                badChoices += 1;
                if ( badChoices > 3 ){
                    squirtleMessage = "Fine. Goodbye.";
                    goodChoices = false;
                    endGame = true;
                    }
                    else{
                        squirtleMessage = "\nCoward. You cannot flee!\n";
                        iterationChoice = 1;
                    }
                    Console.WriteLine( squirtleMessage );

                }//end FLEE choice

        }//end while

        if ( goodChoices == true )
        {
            Console.WriteLine("Gradebook fainted! Generic Teacher is astonished by the change of schedule.\n\"This wasn't on the lesson plan for today\", he mutters. Take that, Generic Teacher!");
        }
        else
            Console.WriteLine("\n\nBetter luck next time!");
  	}//end SQUIRTLE
  
  	//process all responses that have to do with Charmander
  	static void Charmander()
  	{
  		string charMessage = "You have chosen Charmander as your pokemon!\n\n";
    	string spacers = "\n========================================";

    	Console.WriteLine( charMessage );
    		
        int choice = 0;
        int badChoices = 0;
        int iterationChoice = 0;
        int iterationNum = 0;
        bool endGame = false;
        bool goodChoices = true;

        while (endGame == false )
        {
            choice = menu( iterationChoice );
            string response;
		    if (choice == 1) 
    		{
                charMessage = spacers + "\n1: GROWL\n2: SCRATCH"+ "\n\nWhat do you want to do?" + spacers;
          			
          		Console.WriteLine( charMessage );
          			
                //handle errors
                response = Console.ReadLine();
        	    choice = 0;
            	  
            	if(int.TryParse(response, out choice))
            		choice = Convert.ToInt32( response );
            	else
                    Console.WriteLine( charMessage );
                
      		    if (choice == 1) {
                    iterationNum += 1;
                    if ( iterationNum == 1 ){
                        charMessage = "CHARMANDER used Growl! It was super effective!";
                    }
                    else if ( goodChoices == true )
                    {
                        charMessage = "CHARMANDER used Growl! It was super effective!";
                        endGame = true;
                    }
                    else{
                        charMessage = "CHARMANDER used Growl! It wasn't very effective." + "\nGradebook didn't like that very much. He felt kind of threatened...\nGradebook used Fail Student! It's super effective!\n\nCHARMANDER fainted.";
                        goodChoices = false;
                        endGame = true;
                    }//decider iteration 
                }//end GROWL choice
                else if (choice == 2){
                    iterationNum += 1;
                    charMessage = "CHARMANDER used Scratch! It wasn't very effective. ";
                    if ( iterationNum == 2)
                    {
                        charMessage += "\n\nThat wasn't very nice! Gradebook doesn't like being scratched up...\nGradebook used Fail Student! It's super effective!\n\nCHARMANDER fainted!";
                        endGame = true;
                    }
                    
                    goodChoices = false;
                }//end SCRATCH choice
                Console.WriteLine( charMessage );

                iterationChoice = 1;
    		}//end fight
            else if (choice == 2) 
    	    {
      			charMessage = spacers + "\n1: POKEBALL\n2: BACK"+ "\nWhat do you want to do?" + spacers;
          		
          		Console.WriteLine( charMessage );
          			
                //handle errors
        	    response = Console.ReadLine();
        	    choice = 0;
            	  
                if(int.TryParse(response, out choice))
            		choice = Convert.ToInt32( response );
            	else
                Console.WriteLine( charMessage );
                
        	    if (choice == 1) 
      		    {
                    badChoices += 1;
                    if ( badChoices > 1 ){
                        charMessage = "\nGradebook was angered! He doesn't enjoy getting hit in the head with a pokeball. You got K.O'd.";
                        goodChoices = false;
                        endGame = true;
                    }
                    else{
                        charMessage = "You used one Poke Ball! " + "Unfortunately, Gradebook is too strong! You cannot capture him. \n\n\"You could try again\", Generic Teacher taunts.";
                    }
            	}//end CAPTURE choice
                else
                {
                    charMessage = "";
                }
                Console.WriteLine( charMessage );
                iterationChoice = 1;
    
    	    }//end ITEM choice
    	    else if (choice == 3) 
      	    {
          		charMessage = "You have no other Pokemon!";
                Console.WriteLine( charMessage );
                iterationChoice = 1;	
    	    }//end PKMN choice
            else if (choice == 4)
            {
                badChoices += 1;
                if ( badChoices > 3 ){
                    charMessage = "Fine. Goodbye.";
                    goodChoices = false;
                    endGame = true;
                }
                else
                {
                    charMessage = "\nCoward. You cannot flee!\n";
                    iterationChoice = 1;
                }
                Console.WriteLine( charMessage );
            }//end FLEE choice

        }//end while
  		
        if ( goodChoices == true )
        {
            Console.WriteLine( "Gradebook fainted. You growled them into submission! Take that, Generic Teacher!");
        }
        else
            Console.WriteLine("\n\nBetter luck next time!");

  	}//end Charmander
  	
    //process all responses that have to do with Bulbasaur
    static void Bulbasaur()
  	{
        string bulbMessage = "You have chosen Bulbasaur as your pokemon!\n\n";
    	string spacers = "\n========================================";

    	Console.WriteLine( bulbMessage );

        int choice = 0;
        int badChoices = 0;
        int iterationChoice = 0;
        int iterationNum = 0;
        bool endGame = false;
        bool goodChoices = true;

        while ( endGame == false )
        {
            choice = menu( iterationChoice );
            string response;
		    if (choice == 1) 
    		{
                bulbMessage = spacers + "\n1: TACKLE\n2: GROWL";

                if (iterationNum == 1)
                {
                    bulbMessage += "\n3: VINE WHIP";
                }
                bulbMessage += "\n\nWhat do you want to do?" + spacers;
          			
          		Console.WriteLine( bulbMessage );
          			
                //handle errors
                response = Console.ReadLine();
        	    choice = 0;
            	  
            	if(int.TryParse(response, out choice))
            		choice = Convert.ToInt32( response );
            	else
                    Console.WriteLine( bulbMessage );
                
      		    if (choice == 2) {
                    iterationNum += 1;
                    if ( iterationNum == 1 ){
                        bulbMessage = "BULBASAUR used Growl! It was super effective!";
                    }
                    else if ( goodChoices == true )
                    {
                        bulbMessage = "BULBASAUR used Growl! It was super effective!";
                        endGame = true;
                    }
                    else{
                        bulbMessage = "BULBASAUR used Growl! It wasn't very effective." + "\n\nGradebook didn't like that very much. He felt kind of threatened...\nGradebook used Fail Student! It's super effective!\n\nBULBASAUR fainted.";
                        goodChoices = false;
                        endGame = true;
                    }//decider iteration 
                }//end GROWL choice
                else if (choice == 1){
                    iterationNum += 1;
                    bulbMessage = "BULBASAUR used Tackle! It wasn't very effective. ";
                    if ( iterationNum == 2)
                    {
                        bulbMessage += "\n\nCCA doesn't even have a football team! Gradebook doesn't like being tackled...\nGradebook used Fail Student! It's super effective!\n\nBULBASAUR fainted!";
                        endGame = true;
                    }
                    goodChoices = false;

                }//end SCRATCH choice
                else if ( choice == 3 ){
                    bulbMessage = "Cheater, you haven't learned this move yet! Gradebook doesn't like academic dishonesty... Gradebook used Fail Student! It's super effective!\n\nBULBASAUR fainted!";
                    goodChoices = false;
                    endGame = true;
                }//end VINE WHIP choice
                Console.WriteLine( bulbMessage );

                iterationChoice = 1;
    		}//end fight
    
         	else if (choice == 2) 
    	    {
          		bulbMessage = spacers + "\n1: POKEBALL\n2: BACK"+ "\nWhat do you want to do?" + spacers;
          			
          		Console.WriteLine( bulbMessage );
          			
                //handle errors
        	    response = Console.ReadLine();
        	    choice = 0;
            	  
        		if(int.TryParse(response, out choice))
            		choice = Convert.ToInt32( response );
            	else
                    Console.WriteLine( bulbMessage );
                
          		if (choice == 1) 
      		    {
                    badChoices += 1;
                    if ( badChoices > 1 ){
                        bulbMessage = "\nGradebook was angered! He doesn't enjoy getting hit in the head with a pokeball. You got K.O'd.";
                        goodChoices = false;
                        endGame = true;
                    }
                    else{
                        bulbMessage = "You used one Poke Ball! " + "Unfortunately, Gradebook is too strong! You cannot capture him.\n\n\"You could try again\", Generic Teacher taunts.";
                    }
            	}//end CAPTURE choice
                else
                {
                    bulbMessage = "";
                    //do people even read the code
                }
                Console.WriteLine( bulbMessage );
                iterationChoice = 1;
    
            }//end ITEM choice
	        else if (choice == 3) 
      	    {
          		bulbMessage = "You have no other Pokemon!";
                Console.WriteLine( bulbMessage );
                iterationChoice = 1;	
    		}//end PKMN choice
            else if (choice == 4)
            {
                badChoices += 1;
                if ( badChoices > 3 ){
                    bulbMessage = "Fine. Goodbye.";
                    goodChoices = false;
                    endGame = true;
                }
                else{
                    bulbMessage = "\nCoward. You cannot flee!\n";
                    iterationChoice = 1;
                }
                Console.WriteLine( bulbMessage );
            }//end FLEE choice

        }//end while

        if ( goodChoices == true )
        {
            Console.WriteLine( "Gradebook fainted. You growled them into submission! Take that, Generic Teacher!");
        }
        else
            Console.WriteLine("\n\nBetter luck next time!");
    }

    //process all responses that have to do with Pikachu
    static void Pikachu()
    {
        string pikaMessage = "You've found a secret! Pikachu is now your pokemon.\n\n";
        string spacers = "\n========================================";
        Console.WriteLine( pikaMessage );
    	
        int choice = 0;
        int badChoices = 0;
        int iterationChoice = 0;
        bool endGame = false;
        bool goodChoices = true;
        
         while (endGame == false )
        {
            choice = menu( iterationChoice );
            string response;
    	    if (choice == 1) 
    		{
      			pikaMessage = spacers + "\n1: GROWL\n2: THUNDERSHOCK"+ "\n\nWhat do you want to do?" + spacers;
          			
          		Console.WriteLine( pikaMessage );
          			
                //handle errors
                response = Console.ReadLine();
        	    choice = 0;
            	  
            	if(int.TryParse(response, out choice))
            		choice = Convert.ToInt32( response );
            	else
                    Console.WriteLine( pikaMessage );
                    

      		    if (choice == 1) {
                    pikaMessage = "PIKACHU used Growl! It was super effective!";
                    endGame = true;
                }//end GROWL choice
                else if (choice == 2){
                    pikaMessage = "PIKACHU used Thundershock! The move was too O.P., so you couldn't control it and missed. He's only LVL. 1, after all.";
                    goodChoices = false;
                    endGame = true;
                }//end THUNDERSHOCK choice
                Console.WriteLine( pikaMessage );

                iterationChoice = 1;

    		}//end FIGHT choice
         	else if (choice == 2) 
    	    {
                choice = menu( 2 );
        	    if (choice == 1) 
      	        {
                    badChoices += 1;
                    if ( badChoices > 1 ){
                        pikaMessage = "\nGradebook was angered! He doesn't enjoy getting hit in the head with a pokeball. You got K.O'd.";
                        goodChoices = false;
                        endGame = true;
                    }
                    else{
                        pikaMessage = "\nYou used one Poke Ball! " + "Unfortunately, Gradebook is too strong! You cannot capture him. \n\n\"You could try again\", Generic Teacher taunts.";
                    }
                }//end CAPTURE choice
                else
                {
                    pikaMessage = "";
                }
          	    Console.WriteLine( pikaMessage );
                iterationChoice = 1;

    	    }//end ITEM choice
    	    else if (choice == 3){
                Console.WriteLine( "\nYou have no other pokemon! And you already found the secret one... don't be greedy." );
                iterationChoice = 1;

    		}//end PKMN choice
            else if (choice == 4){
                badChoices += 1;
                if ( badChoices > 3 ){
                    pikaMessage = "Fine. Goodbye.";
                    goodChoices = false;
                    endGame = true;
                    }
                    else{
                        pikaMessage = "\nCoward. You cannot flee!\n";
                        iterationChoice = 1;
                    }
                    Console.WriteLine( pikaMessage );

                }//end FLEE choice

        }//end while

        if ( goodChoices == true )
        {
            Console.WriteLine("Gradebook was growled into submission! Gradebook fainted.\n\nCongrats! Your lightning quick intuition and inherent need to break the rules as well as your strong potential to become a Pokemon master far exceeded Generic Teacher's abilities.");
        }
        else
            Console.WriteLine("\n\nBetter luck next time!");

    }

  	//exit the story
  	static void QuitStory()
  	{
        string introduction = 
  			"--------------------------------------------------\n"+
  			"Quitting already?\n"+
  			"--------------------------------------------------\n";
  	    Console.WriteLine(introduction);
  				
  	}//end quit story

}//end class