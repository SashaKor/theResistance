import cs1.Keyboard; 
public class numberGame{
    
    /*==================================================
      class numberGame -- fun fun fun!

      eg, sample interaction with end user:
      Guess a # fr 1-100: 50
      Too high
      Guess a # fr 1-49: 25
      Too low
      Guess a # fr 26-49: 38
      Correct! It took 3 guesses
      ==================================================*/

    //import cs1.Keyboard
	//instance vars
	private int _lo, _hi, _guessCtr, _target;
    public static int att = 0; 


	/*==================================================
	  constructor -- initializes a guess-a-number game
	  pre:  
	  post: _lo is lower bound, _hi is upper bound,
	  _guessCtr is 1, _target is random int on range [_lo,_hi]
	  ==================================================*/
	public numberGame( int a, int b ) 
	{
	    _lo = Math.min(a,b);
	    _hi = Math.max(a,b);
	    _guessCtr = 1;

	    //pick random number in range [a,b]
	    _target = (int) ( Math.random() * (_hi - _lo + 1) + _lo );
	}


	/*==================================================
	  void playRec() -- Prompts a user to guess until guess is correct.
	  Uses recursion.
	  pre:  
	  post: 
	  ==================================================*/
	public void playRec()   
	{
	    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
	    int guess = Keyboard.readInt();

	    //3 cases: we either found it, too hi, too lo
	    if( guess > _target ) { 
		System.out.println("Too high.");
		_guessCtr++;
		_hi = guess - 1;
		//Q: how do you keep going? A:
		this.play();
	    }
	    else if( guess < _target ) {
		System.out.println("Too low");
		_guessCtr++;
		_lo = guess + 1;
		this.play();
	    }
	    else {
		System.out.println("HuzzaaH! It took " + _guessCtr + " guesses");
	    }
	}


	/*==================================================
	  void playIter() -- Prompts a user to guess until guess is correct.
	  Uses iteration.
	  pre:  
	  post: 
	  ==================================================*/
	public void playIter() 
	{
	    int guess;
	    // int a = 0; 

	    while(att<5 ) {
		System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
		guess = Keyboard.readInt();
		if( guess == _target ) {
		    System.out.println("W00T! It took " + _guessCtr + " guesses. You have not failed your mother.");
		    break;
		}
		else if( guess > _target ) {
		    _hi = guess - 1;
		    System.out.println("Too high, chump.");
		}
		else {
		    _lo = guess + 1;
		    System.out.println("Too low, sucker.");
		}
		_guessCtr++;
		att++;
		if (att==5){
		    System.out.println("You have failed your mother. You will now suffer from embarrasement and shame. Your mental health has plummeted");
		    // Woo._mentHealth -= 5;
		}
	    }
	}


	//wrapper for playRec/playIter to simplify calling
	public void play() 
	{ 
	    //use one or the other below:
	    //playRec();
	    //int a = 0;
	    //while (a <6){
	    playIter();
	    //a++; }
	}


	//main method to run it all
	public static void main( String[] args ) 
	{
	    //instantiate a new game
	    //numberGame g = new numberGame (1, 20);

	    //start the game
	    //g.play();
	    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	}//end main

    }//end numberGames
