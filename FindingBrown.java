
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
	this._r= (int) (Math.random()*4 +1);
	this._c= (int) (Math.random()*4 +1);

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

    //play method
    public static void play(){
		
	int userStrRow=0;
	int userStrCol=0;
	int x = 0;

	System.out.println("You are running late and can't seem to find Mr.Brown's classroom!");
	System.out.println("Here's the layout of the cs department classrooms in your school:");
	System.out.println("The classrooms are laid out 3x3. 0's represent closed doors, 6's represent opened doors. Don't try to open an already opened door, you will just waste a turn!");
	System.out.println();

        
	

	while (x<3){
	    print2();
	    
	    System.out.println("Choose the row you think the classroom is in: ");
	    userStrRow= Woo.userInputInt(1,3);

	    System.out.println("Choose the column you think the classroom is in: ");
	    userStrCol= Woo.userInputInt(1,3);

	    if ((userStrRow==_r) && (userStrCol== _c)){
		System.out.println(" You got to class on time! The room number was " + _r +","+_c+"!");
		break;
	    }
	    else {System.out.println("Oh no this is Holmes' classroom. Try again Sherlock!");
		rooms[userStrRow][userStrCol]=6;
	    }

	    x++;
	    
	    
	}

	if (x==3 && userStrRow!=_r && userStrCol!= _c){
	    System.out.println("You are late now! Go cry in the library. The room number was " + _r +","+_c+"!");
	}
	 
	
    }



    //public static void main(String[] args){
	

	

    //}

}
