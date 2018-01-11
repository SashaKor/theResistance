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


    //default constructor
   
    public Student(){
	_socStat = 0;
	_intelligence = 0;
	_mentHealth = 0;
	_physHealth = 0;
	_friendCnt = 0;
	_popularity = 0;
    }
    public Student (String name){
	_socStat = 0;
	_intelligence = 0;
	_mentHealth = 0;
	_physHealth = 0;
	_friendCnt = 0;
	_popularity = 0;
	_name = name;
    }

    //~~~~~~~~~~~~~~~~~~~~Mutators~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public void changeSocStat(int change){
	_socStat += change;
    }

    public void changeIntel(int change){
	_intelligence += change;
    }

    public void changeMentHealth(int change){
	_mentHealth += change;
    }

    public void changePhysHealth(int change){
	_physHealth += change;
    }

    public void changeFriendCnt(int change){
	_friendCnt += change;
    }

    public void changePopularity(int change){
	_popularity += change;
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
	result+= "Social Status: " + _socStat;
	result+= "Intelligence: " + _intelligence;
	result+= "Mental Health: " + _mentHealth;
	result+= "Physical Health: " + _physHealth;
	result+= "Friend Count: " + _friendCnt;
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
