/*
superclass for all types of students

similar to hw30-yorpg Character superclass
 */

public class Student{

    // tracks social status in school as a whole
    public int _socStat;
    //tracks academic aptitude
    public int _intelligence;
    // mental health; functions as HP in that dropping below 0 = gameover
    public int _mentHealth;
    // physical health; functions as HP in that dropping below 0 = gameover
    public int _physHealth;
    // friend count;
    public int _friendCnt;
    // tracking popularity amongst player's type
    public int _popularity;
    // name; used for user experience
    public String _name;
    // track scenes for each day
	String[] sceneDay1 = new String[5];
        String[] sceneDay2 = new String[5];
        String[] sceneDay3 = new String[5];
        String[] sceneDay4 = new String[5];   

    //default constructor

    public Student(){
	_socStat = 0;
	_intelligence = 0;
	_mentHealth = 0;
	_physHealth = 0;
	_friendCnt = 0;
	_popularity = 0;

	for (int i=0; i<5; i++){
	    sceneDay1[i]="a";
	    sceneDay2[i]="a";
	    sceneDay3[i]="a";
	    sceneDay4[i]="a";
	}
    }
    public Student (String name){
	_socStat = 0;
	_intelligence = 0;
	_mentHealth = 0;
	_physHealth = 0;
	_friendCnt = 0;
	_popularity = 0;
	_name = name;

	for (int i=0; i<5; i++){
	    sceneDay1[i]="a";
	    sceneDay2[i]="a";
	    sceneDay3[i]="a";
	    sceneDay4[i]="a";
	}
    }

	//~~~~~~~~~~~~~~~~~~~~Mutators~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public void changeSocStat(int change){
	System.out.print("\nYour social status has changed from " + _socStat);
	_socStat += change;
	System.out.print(" to " + _socStat + "!\n");
    }

    public void changeIntel(int change){
	System.out.println("\nYour intelligence has changed from " + _intelligence);
	_intelligence += change;
	System.out.print(" to " + _intelligence + "!\n");
    }

    public void changeMentHealth(int change){
	System.out.print("\nYour mental health has changed from " + _mentHealth);
	_mentHealth += change;
	System.out.print(" to " + _mentHealth + "!\n");
    }

    public void changePhysHealth(int change){
	System.out.print("\nYour physical health  has changed from " + _physHealth);
	_physHealth += change;
	System.out.print(" to " + _physHealth + "!\n");
    }

    public void changeFriendCnt(int change){
	System.out.print("\nYour friend count has changed from " + _friendCnt);
	_friendCnt += change;
	System.out.print(" to " + _friendCnt + "!\n");
    }

    public void changePopularity(int change){
	System.out.print("\nYour popularity  has changed from " + _popularity);
	_popularity += change;
	System.out.print(" to " + _popularity + "!\n");
    }

    public void setName(String newName){
	_name = newName;
    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*
      printStats()-- prints stats for user
      post: returns String of all attributes except name
     */

    public String printStats(){
	String result= "";
	result+= "Social Status: " + _socStat+ "\n";
	result+= "Intelligence: " + _intelligence+"\n";
	result+= "Mental Health: " + _mentHealth+"\n";
	result+= "Physical Health: " + _physHealth+"\n";
	result+= "Friend Count: " + _friendCnt+ "\n";
	result+= "Popularity: " + _popularity;

	return result;
    }

    /*
      score()-- calculates score by taking into account all the attributes (other than name)
      post: returns double result
     */

    public double score(){
	//implementation
	return 1.0;
    }

    /*
      randInt()-- returns a random integer range 1-5 (inclusive)
     */
    public int randInt(){
	//implementation
	return 1;
    }

    /*
      getDay()-- accessor to access day from driver file
      (may not be necessary)
     */
}
