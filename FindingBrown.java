
// little 2D array minigame
//replaces tried rooms with 6's
import cs1.Keyboard;
public class FindingBrown{
    static int[][] rooms = new int[4][4];
    static int _r;
    static int _c;

    //default construct
    public FindingBrown(){


	//setting correct room value
	for (int x =0; x< 4; x++){
	    rooms[0][x]= x;
	}
	for (int x =0; x< 4; x++){
	    rooms[x][0]= x;}
	this._r= (int) (Math.random()*3 +1);
	this._c= (int) (Math.random()*3 +1);

    }

    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOREACH loop
    public static void print2()
    {

	for( int[] row : rooms) {
	    String result="";
	    for( int i : row ){
		result+= i+" ";}
	    System.out.println(result);
	}


    }
    //error catching, used in Woo.java as well
    public static int userInputInt(int low, int high){
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


    //play method
    public static void play(){

	int userInRow=0;
	int userInCol=0;
	int x = 0;

	System.out.println("You are running late and can't seem to find Mr.Brown's classroom!");
	System.out.println("Here's the layout of the cs department classrooms in your school:");
	System.out.println();




	while (x<3){
	    print2();

	    System.out.println("Choose the row you think the classroom is in: ");
	    userInRow= userInputInt(1,3);

	    System.out.println("Choose the column you think the classroom is in: ");
	    userInCol= userInputInt(1,3);

	    if ((userInRow==_r) && (userInCol== _c)){
		System.out.println(" You got to class on time! The room number was " + _r +","+_c+"!");
		break;
	    }

	    x++;
	    if (x==3){
		break;
	    }

	    System.out.println("Oh no wrong room! Try again!");
	    System.out.println();
	    
		rooms[userInRow][userInCol]=6;
	}

	    
	if (x==3 && (userInRow !=_r || userInCol != _c)){
	    System.out.println("You are late now! Go cry in the library. The room number was " + _r +","+_c+"!");
	}}}






    //public static void main(String[] args){


    //}


