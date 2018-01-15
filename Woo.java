import cs1.Keyboard;
public class Woo{

    int day =0;
    boolean gameOver = false;
    int eventCnt = 0;
    //Student user;
    String userStr = "";
    int type;


    public void newGame(){
	System.out.println("Welcome to High School 2.0");
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
	System.out.println("Hey there! Are you excited to be in High School?");
	//	System.out.println("Well get ready!");
	System.out.println("We are gonna get you ready by choosing who you're going to be!");
	System.out.println("But let's get your name before we transform you");
	userStr = Keyboard.readString();
	//System.out.println(userStr);
	System.out.println("If you could go somewhere right now, where would you go?" + "\n" +
			   "1) the cemetery" + "\n" + //goth
			   "2) the gym" + "\n" + //athlete
			   "3) the theater" + "\n" + //thespain
			   "4) the library" + "\n" + //nerd
			   "5) the museum of noses" + "\n" //weirdo
			   );
	userIn = Keyboard.readInt();
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

	System.out.println("What's your favorite icecream favor?" + "\n" +
			   "1) Rocky Road" + "\n" + //athlete
			   "2) Vanilla" + "\n" + //nerd
			   "3) Tuti Fruti" + "\n" + //thespain
			   "4) Dark Mist" + "\n" + //goth
			   "5) You don't like icecream" + "\n" ); //weirdo
		userIn = Keyboard.readInt();
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
		System.out.println("What's your favorite drink?" + "\n" +
			   "1) pickle juice" + "\n" + //weirdo
			   "2) milk" + "\n" + //nerd
			   "3) gatorade" + "\n" + //athlete
			   "4) cranberry punch" + "\n" + //goth
			   "5) water" + "\n" ); //thespain
		userIn = Keyboard.readInt();
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

  System.out.println("You're at your locker, getting your books and a group of people dressed in black laugh at you while passing. What do you do?" + "\n" +
    "1) punch them" + "\n" + //Athlete
    "2) make some witty remark" + "\n" + //thespian
    "3) conjure up black magic" + "\n" + //Goth
    "4) start laughing hysterically" + "\n" + //weirdo
    "5) bury your face in your books" + "\n"); //nerd
  userIn = Keyboard.readInt(); //goth, athlete, thespian, nerd, weirdo
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

System.out.println("Some people wearing black pass by you. What do you do? \n" +
"1) I'm one of them \n" + //Goth
"2) start crying \n" + //Weirdo
"3) tell them that we only percieve color because of light \n" + //nerd
"4) gossip loudly about them \n" + //Athlete
"5) tell them about the emotional connection directors associate the color black with \n" ); // Thespian
userIn = Keyboard.readInt(); //goth, athlete, thespian, nerd, weirdo
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

System.out.println("You turn on the TV. What channel is on? \n" +
"1) NFL \n" + //Athlete
"2) Death TV \n" + //Goth
"3) Theater Television Network \n" + //Thespian
"4) The Discovery Channel \n" + //Nerd
"5) Weird TV" ); //Weirdo
userIn = Keyboard.readInt(); //goth, athlete, thespian, nerd, weirdo
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
      setDay() - if 5 events are done, new day
      post Cond : resets eventCnt to zero for new Day
  =======================*/
    public void setDay(){
      if (eventCnt % 5 == 0){
        day += 1;
      }
      eventCnt = 0;
    }

    public static boolean playTurn(){
      return true;
    }


    public static void main(String[] args){
	Woo game = new Woo();
	Student user = new Student();
	game.newGame();

	if (game.type == 0){
	    user= new Goth(game.userStr);
	    System.out.println("Congrats " + user._name+ "! You're a Goth!");
	    //user= new Goth(game.userStr);
	}
	else if(game.type == 1){
	    user = new Athlete(game.userStr);
	    System.out.println("Congrats " +user._name+ "! You're an Athlete!");
	    //user = new Athlete(game.userStr);
	}
	else if(game.type == 2){
	    user = new Thespian(game.userStr);
	    System.out.println("Congrats " + user._name + "! You're a Thespian!");
	    //user = new Thespian(game.userStr);
	}
	else if(game.type == 3){
	    user = new Nerd(game.userStr);
	    System.out.println("Congrats " + user._name + "! You're a Nerd!");
	    //user = new Nerd(game.userStr);
	     //System.out.println(user._mentHealth);
	}
	else{
	    user = new Weirdo(game.userStr);
	    System.out.println("Congrats " + user._name + "! You're a Weirdo!");
	    //user = new Weirdo(game.userStr);
	     
	}

	System.out.println(user._mentHealth);
    }//end of main method
}//end of public class Woo
