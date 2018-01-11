import cs1.Keyboard;
public class Woo{
    //import cs1.keyboard;

    int day =0;
    boolean gameOver = false;
    int eventCtr = 0;

    public void newGame(){
	System.out.println("Welcome to High School 2.0");
	quiz();
    }
	
    public static void quiz(){
	int[] typeStud = new int[5]; //goth, athlete, thespian, nerd, weirdo
	int userIn = 0; 
	System.out.println("Hey there! Are you excited to be in High School?");
	//	System.out.println("Well get ready!");
	System.out.println("We are gonna get you ready by choosing who you're going to be!");
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
	//find the max of the array

	int maxInd = 0;
	for( int i = 0; i< typeStud.length; i++){
	    if (typeStud[maxInd] < typeStud[i]){
		maxInd = i; }
	}

	if (maxInd == 0){
	    System.out.println("Congrats! You're a Goth!"); 
	}
	else if(maxInd == 1){
	    System.out.println("Congrats! You're an Athlete!");
	}
	else if(maxInd == 2){
	    System.out.println("Congrats! You're a Thespian!");
	}
	else if(maxInd == 3){
	    System.out.println("Congrats! You're a Nerd!");
	}	
	else if(maxInd ==4){
	    System.out.println("Congrats! You're a Weirdo!");
	}
	
    }//end of quiz

    
    public static void main(String[] args){
	Woo game = new Woo();
	game.newGame();  
    }//end of main method
}//end of public class Woo
