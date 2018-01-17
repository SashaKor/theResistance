import cs1.Keyboard;//readInt is changed slightly to not return a MIN_INDEX print msg
public class Woo{

    int day =1;
    boolean gameOver = false;
    int eventCnt = 0;
    String userStr = "";
    int type;

    public int userInputInt(int low, int high){
	int userIn = Keyboard.readInt();
	while (userIn > high || userIn < low){
	    if (userIn == -2147483648){
		System.out.println("Please enter an integer!");
	    }
	    else{
		System.out.println(userIn + " isn't an option! Try again with a number between the given range");
	    }
	    userIn = Keyboard.readInt();
	}
	return userIn;
    }
	
	
    public void newGame(){
	System.out.println("\n\t\t\033[1mWelcome to High School 2.0!\033[0m");
	System.out.println("\t\t|-------------------------|");
	quiz();
    }

    /* =============================
       quiz()- prints out intro lines that ask for the user's name
       questions the user to determine their type
       determines type and instantiates a Student of that class
       ===============================*/
    public void quiz(){
	int[] typeStud = new int[5]; //goth, athlete, thespian, nerd, weirdo
	int userIn = 0;
        //String userStr = "";
	System.out.println("\nHey there! Are you excited to be in High School?");
	//	System.out.println("Well get ready!");
	System.out.println("We are gonna get you ready by choosing who you're going to be!");
	System.out.println("But let's get your name before we transform you. Enter your first name:");
	userStr = Keyboard.readString();
	System.out.println("Hi " + userStr + "!\n");
	System.out.println("Answer these questions to discover what type of student you are! If you want to choose choice 3, type in the following: \033[1m 3 \033[0m");
	System.out.println("\nIf you could go somewhere right now, where would you go?" + "\n" +
			   "1) the cemetery" + "\n" + //goth
			   "2) the gym" + "\n" + //athlete
			   "3) the theater" + "\n" + //thespain
			   "4) the library" + "\n" + //nerd
			   "5) the museum of noses" //weirdo
			   );
        userIn = userInputInt(1,5);
	if (userIn == 1){
	    typeStud[0] +=1;
	}
	else if(userIn == 2){
	    typeStud[1] +=1;
	}
	else if(userIn == 3){
	    typeStud[2] +=1;
	}
	else if(userIn == 4){
	    typeStud[3] +=1;
	}
	else if(userIn ==5){
	    typeStud[4] +=1;
	}
	System.out.println("\nWhat's your favorite ice cream favor?" + "\n" +
			   "1) Rocky Road" + "\n" + //athlete
			   "2) Vanilla" + "\n" + //nerd
			   "3) Tuti Fruti" + "\n" + //thespain
			   "4) Dark Mist" + "\n" + //goth
			   "5) You don't like icecream" ); //weirdo
        userIn = userInputInt(1,5);
	if (userIn == 1){
	    typeStud[1] +=1;
	}
	else if(userIn == 2){
	    typeStud[3] +=1;
	}
	else if(userIn == 3){
	    typeStud[2] +=1;
	}
	else if(userIn == 4){
	    typeStud[0] +=1;
	}
	else if(userIn ==5){
	    typeStud[4] +=1;
	}
	System.out.println("\nWhat's your favorite drink?" + "\n" +
			   "1) pickle juice" + "\n" + //weirdo
			   "2) milk" + "\n" + //nerd
			   "3) gatorade" + "\n" + //athlete
			   "4) cranberry punch" + "\n" + //goth
			   "5) water" ); //thespain
        userIn = userInputInt(1,5);
	if (userIn == 1){
	    typeStud[4] +=1;
	}
	else if(userIn == 2){
	    typeStud[3] +=1;
	}
	else if(userIn == 3){
	    typeStud[1] +=1;
	}
	else if(userIn == 4){
	    typeStud[0] +=1;
	}
	else if(userIn ==5){
	    typeStud[2] +=1;
	}

	System.out.println("\nYou're at your locker, getting your books and a group of people laugh at you while passing. What do you do?" + "\n" +
			   "1) punch them" + "\n" + //Athlete
			   "2) make some witty remark" + "\n" + //thespian
			   "3) conjure up black magic" + "\n" + //Goth
			   "4) start laughing hysterically" + "\n" + //weirdo
			   "5) bury your face in your books" ); //nerd
        userIn = userInputInt(1,5); //goth, athlete, thespian, nerd, weirdo

	if (userIn == 1){
	    typeStud[1] +=1;
	}
	else if(userIn == 2){
	    typeStud[2] +=1;
	}
	else if(userIn == 3){
	    typeStud[0] +=1;
	}
	else if(userIn == 4){
	    typeStud[4] +=1;
	}
	else if(userIn ==5){
	    typeStud[3] +=1;
	}

	System.out.println("\n You are hanging out with your friends when a threatening group of goths pass nearby. What do you do? \n" +
			   "1) I'm one of them \n" + //Goth
			   "2) start crying \n" + //Weirdo
			   "3) tell them that we only percieve color because of light \n" + //nerd
			   "4) gossip loudly about them \n" + //Athlete
			   "5) tell them about the emotional connection directors associate the color black with" ); // Thespian
        userIn = userInputInt(1,5); //goth, athlete, thespian, nerd, weirdo
       
	if (userIn == 1){
	    typeStud[0] +=1;
	}
	else if(userIn == 2){
	    typeStud[4] +=1;
	}
	else if(userIn == 3){
	    typeStud[3] +=1;
	}
	else if(userIn == 4){
	    typeStud[1] +=1;
	}
	else if(userIn ==5){
	    typeStud[2] +=1;
	}
    
	System.out.println("\nYou turn on the TV. What channel is on? \n" +
			   "1) NFL \n" + //Athlete
			   "2) Death TV \n" + //Goth
			   "3) Theater Television Network \n" + //Thespian
			   "4) The Discovery Channel \n" + //Nerd
			   "5) Weird TV" ); //Weirdo
        userIn = userInputInt(1,5); //goth, athlete, thespian, nerd, weirdo
	if (userIn == 1){
	    typeStud[1] +=1;
	}
	else if(userIn == 2){
	    typeStud[0] +=1;
	}
	else if(userIn == 3){
	    typeStud[2] +=1;
	}
	else if(userIn == 4){
	    typeStud[3] +=1;
	}
	else if(userIn ==5){
	    typeStud[4] +=1;
	}
	//find the max of the array
	int maxInd = 0;
	for( int i = 0; i< typeStud.length; i++){
	    if (typeStud[maxInd] < typeStud[i]){
		maxInd = i; }
	}

	type=maxInd;
    }//end of quiz

    /*=======================
      setDay() - if 4 events are done, new day
      post Cond : resets eventCnt to zero for new Day
      =======================*/
    public boolean changeDay(){
	return eventCnt%4==0;
    }

    /*=========================
      playTurn- chooses scene and mutates event counter
      post Cond- event += 1
      =======================*/

    public void playTurn(Student user){
	int i= (int)(Math.random()*4);
	int userIn= 0;
	String used="";
	

	// DAY 1
	if (day==1){

	    //MAKING SURE NO REPEATED SCENARIOS
	    while (user.sceneDay1[i].equals("")){
		i= (int)(Math.random()*4);
	    }
	    
	    System.out.println( user.sceneDay1[i]);
	    user.sceneDay1[i]="";
	    System.out.println("Please input the number that matches your response:");
	    userIn = userInputInt(1,3);
	    used+=userIn+" ";

	    if(i ==0){

		if (userIn==1){
		    user.changePopularity(1);
		    user.changeSocStat(1);

		}

		else if (userIn==2){
		    user.changeMentHealth(1);
		    user.changeFriendCnt(1);
		}

		else {
		    user.changeIntel(-1);
		}
	    }

	    if (i ==1){
		if (userIn ==1){
		    user.changePopularity(1); }
		else if (userIn ==2){
		    user.changeMentHealth(-1); }
		else if (userIn ==3){
		    user.changeFriendCnt(1);
		}
	    } //end i=1

	    if (i ==2){
		if(userIn == 1){
		    user.changeIntel(1);
		    user.changeSocStat(-1);
		}
		else if (userIn ==2){
		    user.changePhysHealth(1);
		}
		else if (userIn ==3){
		    user.changeFriendCnt(1);
		    user.changeMentHealth(1);
		}
	    }//end i=2

	    if(i ==3){
		if(userIn == 1){
		    user.changePopularity(-1);
		}
		else if (userIn ==2){
		    user.changeMentHealth(-1);
		}
		else if (userIn ==3){
		    user.changeSocStat(1);
		    user.changePhysHealth(-1);
		}
	    } // end i=3

	    if(i ==4){
		if(userIn == 1){
		    user.changeIntel(2);
		}
		else if (userIn ==2){
		    user.changeSocStat(-2);
		}
		else if (userIn ==3){
		    user.changeFriendCnt(2);
		}
	    } // end i=4

	}// end day 1
	
	//DAY 2
	else if (day==2){

	    while (user.sceneDay2[i].equals("")){
		i= (int)(Math.random()*4);
	    }

	    System.out.println( user.sceneDay2[i]);
	    System.out.println("Please input the integer value of your response:");
	    userIn = userInputInt(1,3);
	    user.sceneDay2[i]="";

	    if (i ==0){
		if(userIn == 1){
		    user.changeIntel(-2);
		    user.changeSocStat(1);
		}
		else if (userIn == 2){
		    user.changeMentHealth(-2);
		    user.changePhysHealth(1);
		}
		else if (userIn == 3){
		    user.changePopularity(3);
		    user.changePhysHealth(-2);
		}
	    } //i =0
	    if (i ==1){
		if(userIn == 1){
		    user.changePopularity(2);
		}
		else if (userIn == 2){
		    user.changeMentHealth(-1);
		}
		else if (userIn == 3){
		    user.changeFriendCnt(1);
		}
	    } //i =1

	    if (i ==2){
		if(userIn == 1){
		    user.changeIntel(1);
		    user.changeSocStat(1);
		}
		else if (userIn == 2){
		    user.changePhysHealth(1);
		}
		else if (userIn == 3){
		    user.changeFriendCnt(1);
		    user.changeMentHealth(1);
		}
	    } //i =2

	    if (i ==3){
		if(userIn == 1){
		    user.changeIntel(1);
		    user.changeSocStat(1);
		}
		else if (userIn == 2){
		    user.changePhysHealth(1);
		}
		else if (userIn == 3){
		    user.changeFriendCnt(1);
		    user.changeMentHealth(1);
		}
	    } //i =3
	    if (i ==4){
		if(userIn == 1){
		    user.changeIntel(2);
		}
		else if (userIn == 2){
		    user.changeSocStat(-2);
		}
		else if (userIn == 3){
		    user.changeFriendCnt(2);
		}
	    } //i =4
	} //end day 2

	//DAY 3!
	else if (day==3){

	    while (user.sceneDay3[i].equals("")){
		i= (int)(Math.random()*4);
	    }
	    
	    System.out.println( user.sceneDay3[i]);
	    System.out.println("Please input the integer value of your response:");
	    userIn = userInputInt(1,3);
	    user.sceneDay3[i]="";
      
	    if(i ==0){
		if (userIn == 1){
		    user.changeIntel(-2);
		}
		if (userIn ==2){
		    user.changeFriendCnt(1);
		}
		if (userIn == 3){
		    user.changePhysHealth(2);
		    user.changeSocStat(-1);
		}
	    } //end i = 0

	    if (i==1){
		if(userIn ==1){
		    user.changeMentHealth(3);
		}
		else if(userIn ==2){
		    user.changePopularity(1);
		}
		else if(userIn == 3){
		    user.changeFriendCnt(-1);
		}
	    } //end i= 1

	    if (i ==2){
		if (userIn == 1){
		    user.changeIntel(1);
		    user.changeSocStat(-1);
		}
		if (userIn ==2){
		    user.changePhysHealth(1);
		}
		if (userIn == 3){
		    user.changeFriendCnt(1);
		    user.changeMentHealth(1);
		}
	    }
	    if (i ==3){
		if (userIn ==1){
		    user.changeSocStat(1);
		}
		if (userIn ==2){
		    user.changeMentHealth(-2);
		}
		if (userIn == 3){
		    user.changePhysHealth(-1);

		}
	    }
	}//end day 3

	//day 4!

	else{
	    while (user.sceneDay4[i].equals("")){
		i= (int)(Math.random()*4);
	    }
	    System.out.println( user.sceneDay4[i]);
	    System.out.println("Please input the integer value of your response:");
	    userIn = userInputInt(1,3);
	    user.sceneDay4[i]="";

	    if(i == 0){
		if(userIn == 1){
		    user.changeSocStat(2);
		}
		if(userIn ==2){
		    user.changeMentHealth(1);
		}
		if (userIn ==3){
		    user.changePhysHealth(1);
		    user.changeFriendCnt(-3);
		}
	    }
	    if (i == 1){
		if(userIn ==1){
		    user.changeIntel(1);
		}
		if(userIn ==2){
		    user.changeMentHealth(3);
		}
		if (userIn ==3){
		    user.changeFriendCnt(1);
		}
	    }// i =1
	    if (i ==2){
		if(userIn ==1){
		    user.changePhysHealth(-1);
		}
		if (userIn ==2){
		    user.changeSocStat(1);
		}
		if (userIn ==3){
		    user.changeMentHealth(1);
		}
	    }
	    if(i ==3){
		if (userIn ==1){
		    user.changePopularity(2);
		    user.changeSocStat(-2);
		}
		if (userIn ==2){
		    user.changeMentHealth(-1);
		    user.changeMentHealth(3);
		}
		if(userIn ==3){
		    user.changePhysHealth(-1);
		    user.changeSocStat(1);
		}
	    }
	    if (i ==4){
		if (userIn ==1){
		    user.changeIntel(1);
		}
		if (userIn ==2){
		    user.changeSocStat(-3);
		}
		if(userIn ==3){
		    user.changeFriendCnt(2);
		}
	    }
	} //day 4

	eventCnt+=1;


    }

    /*==========================================
      endGame(Student user, int day)--------- concludes game and prints score
      preCond = user of type Student is put in first arg, day of instance game as second arg
      postCond = ends game
      =======================================*/
    public void endGame(Student user, int day){
	System.out.println("\n=====================================");
	if (day ==5){
	    System.out.println("Congratulations! You barely survived in high school! Maybe it had something to do with the Plastics not being here...");}
	else{
	    System.out.println("Looks like you failed at being a high schooler. Don't worry, just blame it on Regina George");
	}
	System.out.println(user.printStats());
	System.out.println("This is your score! ------>>>>"+score(user));
	System.out.println("=====================================\n");
	System.out.println("bye felicia");
    
    }

    /*=========================================
      clearScreen()-- aesthetic purposes
      prints out 100 lines of empty space 
      ================================*/
    public static void clearScreen(){
	int x= 0;
	while(x<2){
	    System.out.println();
	    x++;
	}

    }
        /*=========================================
      score()-- used in endGame()
      score calculated 
      ================================*/
    public static double score(Student user){
	return (user._mentHealth +user._physHealth + user._intelligence + user._socStat + (user._popularity * 2));
    }
    
    public static void main(String[] args){
	Woo game = new Woo();
	Student user = new Student();
	game.newGame();

	//instantiating as a type of high-schooler
	if (game.type == 0){
	    user= new Goth(game.userStr);
	    System.out.println("\t\tCongrats " + user._name+ "! You're a Goth!\n");

	}
	else if(game.type == 1){
	    user = new Athlete(game.userStr);
	    System.out.println("\t\tCongrats " +user._name+ "! You're an Athlete!\n");

	}
	else if(game.type == 2){
	    user = new Thespian(game.userStr);
	    System.out.println("\t\tCongrats " + user._name + "! You're a Thespian!\n");

	}
	else if(game.type == 3){
	    user = new Nerd(game.userStr);
	    System.out.println("\t\tCongrats " + user._name + "! You're a Nerd!\n");

	}
	else{
	    user = new Weirdo(game.userStr);
	    System.out.println("\t\tCongrats " + user._name + "! You're a Weirdo!\n");


	}
	//transition

	clearScreen();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~ We are now enterning the first day of school ~");
	System.out.println("~ May the odds be ever in your favor ~");
	clearScreen();

	System.out.println(        .-. 
                           "         /___\
                                    |___|
                                    |]_[|
                                    / I \
                                 JL/  |  \JL
      .-.                    i   ()   |   () i                      .-.
      |_|     .^.           /_\  LJ=======LJ  /_\           .^.     |_|
_._._/___\._./___\_._._._._.L_J_/.-. .-. .-.\_L_J._._._._._/___\._./___\._._._
.,        ., |-,-| .,       L_J  |_| [I] |_|  L_J       ., |-,-| .,        .,
JL        JL |-O-| JL       L_J%%%%%%%%%%%%%%%L_J       JL |-O-| JL        JL
HH_IIIIII_HH_'-'-'_HH_IIIIII|_|=======H=======|_|IIIIII_HH_'-'-'_HH_IIIIII_HH_
[]--------[]-------[]-------[_]----\.=I=./----[_]-------[]-------[]--------[]-
||  _/\_  ||\\_I_//||  _/\_ [_] []_/_L_J_\_[] [_] _/\_  ||\\_I_//||  _/\_  ||\
||  |__|  ||=/_|_\=||  |__|_|_|   _L_L_J_J_   |_|_|__|  ||=/_|_\=||  |__|  ||-
||  |__|  |||__|__|||  |__[___]__--__===__--__[___]__|  |||__|__|||  |__|  |||
[_]IIIIIII[_]IIIII[_]IIIIIL___J__II__|_|__II__L___JIIIII[_]IIIII[_]IIIIIIII[_]
[_] \_I_/ [_]\_I_/[_] \_I_[_]\II/[]\_\I/_/[]\II/[_]_I_/ [_]\_I_/[_] \_I_/  [_]
L_J./   \.L_J/   \L_J./   L_JI  I[]/     \[]I  IL_J   \.L_J/   \L_J./   \. L_J
L_J|     |L_J|   |L_J|    L_J|  |[]|     |[]|  |L_J    |L_J|   |L_J|      |L_J
L_JL_____JL_JL___JL_JL____|-||  |[]|     |[]|  ||-|____JL_JL___JL_JL______JL_J");
	clearScreen();

	//gameplay

	while (game.day< 5 & user._mentHealth >0 & user._physHealth >0){
	    game.playTurn(user);
	    game.clearScreen();
	    
	    if (Math.random()<0.2){
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//the phone is ringing game
		if (Math.random()<.5){
		
		System.out.println("Your mom is calling! She forgot the age of your younger sibling");
		numberGame g = new numberGame (1, 20);

		//start the game
		g.play();
		if (numberGame.att ==5){
		    user._mentHealth-=3;}}
		else{
		//finding room game
		FindingBrown s= new FindingBrown();
		s.play();}

		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();

		
	    }



		
	    if (game.changeDay()){
		game.day+=1;
		if (game.day != 5){
		    System.out.println("\n=====================================");
		    System.out.println("You are now moving into day " + game.day+"!");
		    System.out.println(user.printStats());
		    System.out.println("=====================================\n");
		}
	    }
	}
	game.endGame(user, game.day);

    }//end of main method 
}//end of public class Woo
