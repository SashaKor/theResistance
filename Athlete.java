/*
 class Athlete -- 

 */
public class Athlete extends Student{

    // instance variables inherited from Student

    //default constructor
    public Athlete(){
	    
	_socStat= 10;
    
	_intelligence= 10;
    
	_mentHealth= 20;
    
	_physHealth= 20;
    
	_friendCnt= 2;
    
        _popularity=0;

    }

    public Athlete(String name){
	_socStat= 10;
	_intelligence= 10;
	_mentHealth= 20;
	_physHealth= 20;
	_friendCnt= 2;
        _popularity=0;
	_name = name;

    }
}
	



